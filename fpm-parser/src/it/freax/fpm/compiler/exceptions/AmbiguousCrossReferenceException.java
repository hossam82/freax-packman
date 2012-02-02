/**
 * 
 */
package it.freax.fpm.compiler.exceptions;

/**
 * @author kLeZ-hAcK
 * 
 */
public class AmbiguousCrossReferenceException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3208786112417793756L;

	private static final String fmtmessage = "The parameter '%s' is ambiguous in his context";

	/**
	 * @param message
	 */
	public AmbiguousCrossReferenceException(String parameter)
	{
		super(String.format(fmtmessage, parameter));
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AmbiguousCrossReferenceException(String parameter, Throwable cause)
	{
		super(String.format(fmtmessage, parameter), cause);
	}

	@SuppressWarnings("unused")
	private AmbiguousCrossReferenceException()
	{
	}

	@SuppressWarnings("unused")
	private AmbiguousCrossReferenceException(Throwable cause)
	{
	}
}
