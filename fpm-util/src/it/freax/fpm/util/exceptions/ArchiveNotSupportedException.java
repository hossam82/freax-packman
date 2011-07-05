package it.freax.fpm.util.exceptions;

public class ArchiveNotSupportedException extends Exception
{
	private String message;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ArchiveNotSupportedException(String message)
	{
		this.message = message;
	}

	@Override
	public String getMessage()
	{
		return message;
	}
}
