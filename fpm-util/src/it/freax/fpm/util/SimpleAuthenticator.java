/**
 * @author klez
 * @version 0.1
 */
package it.freax.fpm.util;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class SimpleAuthenticator extends Authenticator
{
	private final String username, password;

	public SimpleAuthenticator(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	@Override
	protected PasswordAuthentication getPasswordAuthentication()
	{
		return new PasswordAuthentication(this.username, this.password.toCharArray());
	}
}
