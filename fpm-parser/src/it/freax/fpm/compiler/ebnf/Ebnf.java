/**
 * 
 */
package it.freax.fpm.compiler.ebnf;

import it.freax.fpm.compiler.ebnf.edo.*;
import it.freax.fpm.util.*;
import it.freax.fpm.util.exceptions.ParseException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author kLeZ-hAcK
 * 
 */
public class Ebnf
{
	public static final String EOF = "<EOF>";
	public static final String IDENTIFIER = "<IDENTIFIER>";
	public static final String LITERAL_SUFFIX = "_LITERAL";
	public static final String ROOT_ENTRY = "CompilationUnit";
	public static final Dictionary<String, String> regexSpecials;
	static
	{
		Dictionary<String, String> map = new Dictionary<String, String>();
		map.put("[", "\\[");
		map.put("\\", "\\\\");
		map.put("^", "\\^");
		map.put("$", "\\$");
		map.put(".", "\\.");
		map.put("|", "\\|");
		map.put("?", "\\?");
		map.put("*", "\\*");
		map.put("+", "\\+");
		map.put("(", "\\(");
		map.put(")", "\\)");
		regexSpecials = map;
	}

	private String regex;
	private String content;
	private Dictionary<String, String> dict;
	private HashMap<String, String> builtTokensCache;
	private Dictionary<MapEntry<String, String>, List<EbnfToken>> tokdict;

	public Ebnf(String content)
	{
		this.content = content;
		builtTokensCache = new HashMap<String, String>();
	}

	public String getRegex()
	{
		return regex;
	}

	public String getContent()
	{
		return content;
	}

	public Dictionary<String, String> getEbnf()
	{
		return dict;
	}

	public Dictionary<MapEntry<String, String>, List<EbnfToken>> getTokdict()
	{
		return tokdict;
	}

	public boolean hasEbnf()
	{
		return (dict != null) && !dict.isEmpty();
	}

	public void read() throws ParseException
	{
		dict = Strings.getOne().getMap(content, "::=", "{[\t", "\t]}");
	}

	public void buildTokens()
	{
		tokdict = new Dictionary<MapEntry<String, String>, List<EbnfToken>>();

		Iterator<MapEntry<String, String>> it = dict.iterator();
		int i = 0;
		while (it.hasNext())
		{
			MapEntry<String, String> entry = it.next();
			tokdict.put(entry, tokenizeValue(entry.getValue(), ++i));
		}
	}

	public void buildRegex()
	{
		StringBuilder ret = new StringBuilder();
		ret.append('^');
		ret.append(buildRegex(ROOT_ENTRY));
		ret.append('$');
		regex = ret.toString();
	}

	public boolean matches(String unit)
	{
		boolean ret = false;
		/*
		 * TODO: Sembra strano, ma devo costruire una immensa regex per ogni
		 * value dell'ebnf, perché l'ebnf è strutturato proprio in regex-like.
		 * 
		 * Esempio calzante è la CompilationUnit che prevede:
		 * (PackageDeclaration)? -> si legge 0 o 1 elementi di tipo
		 * PackageDeclaration
		 * (ImportDeclaration)* -> si legge 0 o n elementi di tipo
		 * ImportDeclaration
		 * (TypeDeclaration)* -> si legge 0 o n elementi di tipo TypeDeclaration
		 * 
		 * Esattamente con le stesse regole delle regex.
		 * 
		 * La costruzione dell'algoritmo deve seguire le regole degli
		 * Automi a Stati Finiti (FSA), seguendo percorsi di tipo
		 * deterministico.
		 */

		return ret && regex.equals(null);
	}

	private String buildRegex(String regexclass)
	{
		// TODO: Per evitare i riferimenti incrociati l'idea è di inserire subito
		// l'elemento all'iterno della tabella di hash, e successivamente di
		// aggiornarlo con il suo valore calcolato. In questo modo si può tenere
		// conto di eventuali riferimenti incrociati. :D
		String ret = "";
		if (builtTokensCache.containsKey(regexclass))
		{
			ret = builtTokensCache.get(regexclass);
		}
		else
		{
			StringBuilder sb = new StringBuilder();
			MapEntry<String, String> regclass = dict.getPair(regexclass);
			if (regclass != null)
			{
				List<EbnfToken> tokens = tokdict.get(regclass);
				boolean quoted = false;

				for (EbnfToken token : tokens)
				{
					if (token instanceof RoundsToken)
					{
						sb.append(token.getOperator());
					}
					else if (token instanceof RepetitionToken)
					{
						sb.append(token.getOperator());
					}
					else if (token instanceof OperatorToken)
					{
						if (token.getOperator() != ';')
						{
							sb.append(token.getOperator());
						}
					}
					else if (token instanceof QuoteToken)
					{
						quoted = !quoted;
					}
					else if (token instanceof DataToken)
					{
						String data = ((DataToken) token).getData();
						if (quoted)
						{
							// Regex special characters are: [ \ ^ $ . | ? * + ( )
							// They have to be despecialized by putting a \ before

							boolean contained = false;
							Iterator<String> it = regexSpecials.keySet().iterator();
							while (it.hasNext())
							{
								contained |= data.contains(it.next());
							}

							if (contained)
							{
								for (MapEntry<String, String> entry : regexSpecials)
								{
									data = data.replace(entry.getKey(), entry.getValue());
								}
							}
						}
						else
						{
							// Here I need a switch but, since java does not support switch with strings
							// I need to do a logic switch with an if-then-else statement tail

							if (data.equalsIgnoreCase(EOF))
							{
								break;
							}
							else if (data.equalsIgnoreCase(IDENTIFIER) || data.contains(LITERAL_SUFFIX))
							{
								data = dict.get(data);
							}
							else if (dict.containsKey(data))
							{
								data = buildRegex(data);
							}
						}
						sb.append(data);
						if (!sb.toString().endsWith("\\s+"))
						{
							sb.append("\\s+");
						}
					}
				}
			}
			builtTokensCache.put(regexclass, sb.toString());
			ret = sb.toString();
		}
		return ret;
	}

	private List<EbnfToken> tokenizeValue(String value, long linenr)
	{
		Collections<EbnfToken> ret = Collections.getOne(new ArrayList<EbnfToken>());

		char[] tokens;
		char operator;
		boolean breakfor, datatoken, quoted;

		Class<? extends EbnfToken> tokenclass;
		Class<?>[] params;
		Constructor<? extends EbnfToken> c;

		tokens = value.toCharArray();
		breakfor = false;
		datatoken = false;
		quoted = false;

		try
		{
			for (int i = 0; (i < tokens.length) && !breakfor; i++)
			{
				datatoken = false;
				operator = tokens[i];

				tokenclass = EbnfToken.getToken(operator);
				if (quoted && !tokenclass.equals(QuoteToken.class))
				{
					tokenclass = DataToken.class;
				}
				else if (Character.isWhitespace(operator) && tokenclass.equals(DataToken.class))
				{
					continue;
				}

				params = new Class<?>[] { long.class, long.class, char.class };
				c = tokenclass.getConstructor(params);

				EbnfToken token = c.newInstance(linenr, i, operator);

				if (token instanceof RoundsToken)
				{

				}
				else if (token instanceof RepetitionToken)
				{

				}
				else if (token instanceof QuoteToken)
				{
					quoted = !quoted;
				}
				else if (token instanceof OperatorToken)
				{
					breakfor = (!ret.isNullOrEmpty() && (ret.last() instanceof RoundsToken) && !((RoundsToken) ret.last()).isOpener() && (token.getOperator() == EbnfToken.EOL));
				}
				else if (token instanceof DataToken)
				{
					if (!ret.isNullOrEmpty() && (ret.last() instanceof DataToken))
					{
						((DataToken) ret.last()).append(operator);
						datatoken = true;
					}
				}
				if (!datatoken)
				{
					ret.add(token);
				}
			}
		}
		catch (SecurityException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
			ret.clear();
		}
		catch (NoSuchMethodException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
			ret.clear();
		}
		catch (IllegalArgumentException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
			ret.clear();
		}
		catch (InstantiationException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
			ret.clear();
		}
		catch (IllegalAccessException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
			ret.clear();
		}
		catch (InvocationTargetException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
			ret.clear();
		}
		return ret.toList();
	}
}
