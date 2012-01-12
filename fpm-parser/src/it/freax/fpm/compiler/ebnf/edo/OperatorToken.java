/**
 * 
 */
package it.freax.fpm.compiler.ebnf.edo;

import it.freax.fpm.util.exceptions.ParseException;

/**
 * @author kLeZ-hAcK
 * 
 */
public class OperatorToken extends EbnfToken
{
	/**
	 * @param line
	 * @param col
	 * @param operator
	 */
	public OperatorToken(long line, long col, char operator) throws ParseException
	{
		super(line, col, operator);
	}
}
