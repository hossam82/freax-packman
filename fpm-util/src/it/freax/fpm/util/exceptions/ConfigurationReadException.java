package it.freax.fpm.util.exceptions;

public class ConfigurationReadException extends Exception
{
	private static final long serialVersionUID = 9089946189682563456L;
	private String message;

	public ConfigurationReadException()
	{
		message = "Non è stato possibile leggere il file di configurazione";
	}

	public ConfigurationReadException(String message)
	{
		this.message = message;
	}

	public ConfigurationReadException(Exception previousException)
	{
		initCause(previousException);
	}

	public ConfigurationReadException(String message, Exception previousException)
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
