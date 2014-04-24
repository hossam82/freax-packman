/**
 * 
 */
package it.freax.fpm.util.exceptions;

/**
 * @author klez
 * 
 */
public class ParseException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8896572337504426252L;

	private String message;

	public ParseException()
	{
		message = "";
	}

	public ParseException(String message)
	{
		this.message = message;
	}

	public ParseException(Exception previousException)
	{
		initCause(previousException);
	}

	public ParseException(String message, Exception previousException)
	{
		this.message = message;
		initCause(previousException);
	}

	@Override
	public String getMessage()
	{
		return message;
	}
}
