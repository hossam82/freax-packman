/**
 * 
 */
package it.freax.fpm.compiler.ebnf.edo;

import it.freax.fpm.util.exceptions.ParseException;

/**
 * @author klez
 * 
 */
public class DataToken extends EbnfToken
{
	private String data;

	public DataToken(long line, long col, char operator) throws ParseException
	{
		super(line, col, NULL);
		data = String.valueOf(operator);
	}

	public DataToken(long line, long col, String data) throws ParseException
	{
		super(line, col, NULL);
		this.data = data;
	}

	public String getData()
	{
		return data;
	}

	public DataToken append(char c)
	{
		return append(String.valueOf(c));
	}

	public DataToken append(String s)
	{
		data = data.concat(s);
		return this;
	}
}
