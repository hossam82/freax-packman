/**
 * 
 */
package it.freax.fpm.compiler.ebnf.edo;

import it.freax.fpm.util.exceptions.ParseException;

/**
 * @author klez
 * 
 */
public class RoundsToken extends EbnfToken
{
	private boolean opener;

	/**
	 * @param line
	 * @param col
	 * @param operator
	 */
	public RoundsToken(long line, long col, char operator) throws ParseException
	{
		super(line, col, operator);
		for (int i = 0; i < Operators.length; i++)
		{
			if (Operators[i] == operator)
			{
				opener = i % 2 == 0;
				break;
			}
		}
	}

	public boolean isOpener()
	{
		return opener;
	}
}
