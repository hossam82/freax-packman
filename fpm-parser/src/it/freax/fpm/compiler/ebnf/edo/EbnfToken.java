/**
 * 
 */
package it.freax.fpm.compiler.ebnf.edo;

import it.freax.fpm.compiler.analysis.lexical.Token;
import it.freax.fpm.util.exceptions.ParseException;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author kLeZ-hAcK
 * 
 */
public class EbnfToken extends Token
{
	public static final char NULL = '\0';
	public static final char ROUNDS_NOTABLE = '"';
	public static final char EOL = ';';
	public static final Map<Class<? extends EbnfToken>, char[]> OPERATORS_ASSOCIATION;
	static
	{
		HashMap<Class<? extends EbnfToken>, char[]> associations = new HashMap<Class<? extends EbnfToken>, char[]>();
		associations.put(RoundsToken.class, new char[] { '(', ')', '[', ']', '{', '}' });
		associations.put(QuoteToken.class, new char[] { '"', '\'' });
		associations.put(RepetitionToken.class, new char[] { '?', '*', '+' });
		associations.put(OperatorToken.class, new char[] { '|', ';' });
		associations.put(DataToken.class, new char[] { NULL });
		OPERATORS_ASSOCIATION = Collections.unmodifiableMap(associations);
	}

	protected char[] Operators;
	protected char operator;
	protected boolean throwExOnCheck = true;

	/**
	 * @param line
	 * @param col
	 * @param operator
	 */
	public EbnfToken(long line, long col, char operator) throws ParseException
	{
		super(line, col);
		this.operator = operator;
		throwExOnCheck = true;
		Operators = OPERATORS_ASSOCIATION.get(getToken(operator));
		checkOperator();
	}

	public EbnfToken(long line, long col, char[] operators, char operator) throws ParseException
	{
		super(line, col);
		this.operator = operator;
		throwExOnCheck = true;
		Operators = operators;
		checkOperator();
	}

	public char getOperator()
	{
		return operator;
	}

	protected boolean checkOperator() throws ParseException
	{
		if ((Operators == null) || (Operators.length == 0)) { return true; }
		boolean ok = false;
		for (char op : Operators)
		{
			ok |= op == operator;
		}
		String msg = String.format("Operator not recognized by the interpreter.\n" + "Please check line %d at col %d.", line, col);
		if (throwExOnCheck && !ok) { throw new ParseException(msg); }
		return ok;
	}

	public static Class<? extends EbnfToken> getToken(char operator)
	{
		Class<? extends EbnfToken> ret = null;
		Iterator<Entry<Class<? extends EbnfToken>, char[]>> it = OPERATORS_ASSOCIATION.entrySet().iterator();
		while (it.hasNext() && (ret == null))
		{
			Entry<Class<? extends EbnfToken>, char[]> entry = it.next();
			for (int i = 0; (i < entry.getValue().length) && (ret == null); i++)
			{
				if (operator == entry.getValue()[i])
				{
					ret = entry.getKey();
				}
			}
		}
		if (ret == null)
		{
			ret = DataToken.class;
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append('@').append(line).append(':').append(col);

		sb.append("(\"");
		if (this instanceof DataToken)
		{
			sb.append(((DataToken) this).getData());
		}
		else
		{
			sb.append(getOperator());
		}
		sb.append("\")");

		return sb.toString();
	}
}
