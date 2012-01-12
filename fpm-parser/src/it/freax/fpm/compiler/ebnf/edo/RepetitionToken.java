/**
 * 
 */
package it.freax.fpm.compiler.ebnf.edo;

import it.freax.fpm.util.exceptions.ParseException;

/**
 * @author kLeZ-hAcK
 * 
 */
public class RepetitionToken extends EbnfToken
{
	/**
	 * @param line
	 * @param col
	 */
	public RepetitionToken(long line, long col, char operator) throws ParseException
	{
		super(line, col, operator);
	}
}
