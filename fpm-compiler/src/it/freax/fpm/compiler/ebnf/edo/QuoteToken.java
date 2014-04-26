/**
 * 
 */
package it.freax.fpm.compiler.ebnf.edo;

import it.freax.fpm.util.exceptions.ParseException;

/**
 * @author klez
 * 
 */
public class QuoteToken extends EbnfToken
{
	/**
	 * @param line
	 * @param col
	 * @param operator
	 * @throws ParseException
	 */
	public QuoteToken(long line, long col, char operator) throws ParseException
	{
		super(line, col, operator);
	}
}
