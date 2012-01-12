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
	public static final char EOL = ';';

	private String content;
	private Dictionary<String, String> dict;
	private Dictionary<MapEntry<String, String>, List<EbnfToken>> tokdict;

	public Ebnf(String content)
	{
		this.content = content;
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

	private List<EbnfToken> tokenizeValue(String value, long linenr)
	{
		Collections<EbnfToken> ret = Collections.getOne(new ArrayList<EbnfToken>());

		char[] tokens;
		char operator;
		boolean breakfor;
		boolean datatoken;

		Class<? extends EbnfToken> tokenclass;
		Class<?>[] params;
		Constructor<? extends EbnfToken> c;

		tokens = value.toCharArray();
		breakfor = false;
		datatoken = false;

		try
		{
			for (int i = 0; (i < tokens.length) && !breakfor; i++)
			{
				datatoken = false;
				operator = tokens[i];

				tokenclass = EbnfToken.getToken(operator);
				params = new Class<?>[] { long.class, long.class, char.class };
				c = tokenclass.getConstructor(params);

				EbnfToken token = c.newInstance(linenr, i, operator);

				if (token instanceof RoundsToken)
				{

				}
				else if (token instanceof RepetitionToken)
				{

				}
				else if (token instanceof OperatorToken)
				{
					// TODO: è sbagliato che si interrompa il ciclo in questo caso
					// Se io avessi, come ho, un semicolon in un RoundsToken
					// avrei difficoltà a capire che non devo completare la
					// lettura dei token in quanto in questo caso sarebbe "quotato"
					// La soluzione è interpretare il rouds token come un container
					// Per tutti i token che sono contenuti tra l'opener e il closer.
					breakfor = token.getOperator() == EOL;
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
