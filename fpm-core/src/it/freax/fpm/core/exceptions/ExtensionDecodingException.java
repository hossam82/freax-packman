/**
 * 
 */
package it.freax.fpm.core.exceptions;

/**
 * @author kLeZ-hAcK
 */
public class ExtensionDecodingException extends Throwable
{
	private String path = "";
	/**
	 * 
	 */
	private static final long serialVersionUID = 4818831333616013113L;

	public ExtensionDecodingException(String path)
	{
		this.path = path;
	}

	/* (non-Javadoc)
		 * @see java.lang.Throwable#getLocalizedMessage()
		 */
	@Override
	public String getLocalizedMessage()
	{

		return "Cannot decode extension in uri: " + path + "\n\n" + super.getLocalizedMessage();
	}
}
