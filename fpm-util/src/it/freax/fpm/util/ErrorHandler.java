/**
 * 
 */
package it.freax.fpm.util;

import org.apache.log4j.Logger;

/**
 * @author kLeZ-hAcK
 */
public class ErrorHandler
{
	private Logger log;
	private Class<?> toHandle;

	public ErrorHandler(Class<?> toHandle)
	{
		this.toHandle = toHandle;
		log = LogConfigurator.getOne(this.toHandle).configure();
	}

	public ErrorHandler(Class<?> toHandle, boolean logToConsole)
	{
		this.toHandle = toHandle;
		log = LogConfigurator.getOne(this.toHandle).configure(logToConsole);
	}

	public static ErrorHandler getOne(Class<?> toHandle)
	{
		return new ErrorHandler(toHandle);
	}

	public static ErrorHandler getOne(Class<?> toHandle, boolean logToConsole)
	{
		return new ErrorHandler(toHandle, logToConsole);
	}

	public void handle(Throwable t)
	{
		handle("Message logged from ErrorHandler", t);
	}

	public void handle(String message, Throwable t)
	{
		log.error(message, t);
	}

	@SuppressWarnings("unchecked")
	public <E extends Exception> E rethrow(Throwable t)
	{
		Exception e = new Exception(t);
		handle(t);
		return (E) e;
	}

	@SuppressWarnings("unchecked")
	public <E extends Exception> E rethrow(String message, Throwable t)
	{
		Exception e = new Exception(t);
		handle(message, t);
		return (E) e;
	}
}
