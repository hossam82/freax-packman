/**
 * 
 */
package it.freax.fpm.compiler.ebnf;

import it.freax.fpm.compiler.ebnf.edo.*;
import it.freax.fpm.compiler.exceptions.AmbiguousCrossReferenceException;
import it.freax.fpm.util.*;
import it.freax.fpm.util.exceptions.ParseException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @author kLeZ-hAcK
 * 
 */
public class Ebnf
{
	public static final String EOF = "<EOF>";
	public static final String COLLECTED = "<COLLECTED>";
	public static final String IDENTIFIER = "<IDENTIFIER>";
	public static final String LITERAL_SUFFIX = "_LITERAL";
	public static final String ROOT_ENTRY = "CompilationUnit";
	public static final LinearDictionary<String, String> regexSpecials;
	static
	{
		LinearDictionary<String, String> map = new LinearDictionary<String, String>();
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

	private boolean collectErrors = true;
	private String regex;
	private String content;
	private List<Exception> collectedErrors;
	private HashSet<String> builtSymbolsCache;
	private HashMap<String, String> builtTokensCache;
	private LinearDictionary<String, String> dict;
	private LinearDictionary<MapEntry<String, String>, List<EbnfToken>> tokdict;

	public Ebnf(String content, boolean collectErrors)
	{
		this.content = content;
		this.collectErrors = collectErrors;
		builtTokensCache = new HashMap<String, String>();
		builtSymbolsCache = new HashSet<String>();
		collectedErrors = new ArrayList<Exception>();
	}

	public String getRegex()
	{
		return regex;
	}

	public String getContent()
	{
		return content;
	}

	public LinearDictionary<String, String> getEbnf()
	{
		return dict;
	}

	public LinearDictionary<MapEntry<String, String>, List<EbnfToken>> getTokdict()
	{
		return tokdict;
	}

	public boolean hasEbnf()
	{
		return (dict != null) && !dict.isEmpty();
	}

	public List<Exception> getCollectedErrors()
	{
		return collectedErrors;
	}

	public void read() throws ParseException
	{
		dict = Strings.getOne().getMap(content, "::=", "{[\t", "\t]}");
	}

	public void buildTokens()
	{
		tokdict = new LinearDictionary<MapEntry<String, String>, List<EbnfToken>>();

		Iterator<MapEntry<String, String>> it = dict.iterator();
		int i = 0;
		while (it.hasNext())
		{
			MapEntry<String, String> entry = it.next();
			tokdict.put(entry, tokenizeValue(entry.getValue(), ++i));
		}
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

		return ret;
	}

	public void buildRegex() throws AmbiguousCrossReferenceException
	{
		StringBuilder ret = new StringBuilder();
		ret.append('^');
		ret.append(buildRegex(ROOT_ENTRY, true));
		ret.append('$');
		regex = ret.toString();
	}

	private String buildRegex(String regexclass, boolean recursive) throws AmbiguousCrossReferenceException
	{
		// FIXME: Tutto sbagliato, da rifare, è impensabile una regex di queste dimensioni.
		// Bisognerà riprogettare da capo il sistema di riconoscimento.
		// Rimane l'ebnf e quindi il lavoro fatto per il parser,
		// ma poi con questo coso ci devo fare qualcosa.
		String ret = "";
		if (builtTokensCache.containsKey(regexclass))
		{
			ret = builtTokensCache.get(regexclass);
		}
		else
		{
			if (!builtSymbolsCache.contains(regexclass))
			{
				builtSymbolsCache.add(regexclass);
			}
			else if (collectErrors)
			{
				collectedErrors.add(new AmbiguousCrossReferenceException(regexclass));
				ret = COLLECTED;
				regexclass = null;
			}
			else
			{
				throw new AmbiguousCrossReferenceException(regexclass);
			}
			MapEntry<String, String> regclass = dict.getPair(regexclass);
			if (regclass != null)
			{
				StringBuilder sb = new StringBuilder();
				List<EbnfToken> tokens = tokdict.get(regclass);
				boolean quoted = false, collected = false;

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
						if ((token.getOperator() != ';') && !collected)
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
							else if (dict.containsKey(data) && recursive)
							{
								data = buildRegex(data, recursive);
							}
						}

						if (!data.equalsIgnoreCase(COLLECTED))
						{
							collected = false;
							sb.append(data);
							if (!sb.toString().endsWith("\\s+"))
							{
								sb.append("\\s+");
							}
						}
						else
						{
							collected = true;
						}
					}
				}
				builtTokensCache.put(regexclass, sb.toString());
				ret = sb.toString();
			}
		}
		return ret;
	}

	private List<EbnfToken> tokenizeValue(String value, long linenr)
	{
		FpmCollections<EbnfToken> ret = FpmCollections.getOne(new ArrayList<EbnfToken>());

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
