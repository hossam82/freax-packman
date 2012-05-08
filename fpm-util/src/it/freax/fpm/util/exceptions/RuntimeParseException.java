/**
 * 
 */
package it.freax.fpm.util.exceptions;

/**
 * @author kLeZ-hAcK
 */
public class RuntimeParseException extends RuntimeException
{
	private static final long serialVersionUID = -745200546970440959L;
	private String message;

	public RuntimeParseException()
	{
		message = "";
	}

	public RuntimeParseException(String message)
	{
		this.message = message;
	}

	public RuntimeParseException(Exception previousException)
	{
		initCause(previousException);
	}

	public RuntimeParseException(String message, Exception previousException)
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
