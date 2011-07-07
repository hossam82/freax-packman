/**
 * 
 */
package it.freax.fpm.util;

import java.lang.reflect.InvocationTargetException;

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
	public <E extends Exception> E rethrow(E e, Throwable t)
	{
		handle(t);
		E ret = null;
		try
		{
			ret = (E) e.getClass().getConstructor(new Class<?>[]
			{ Exception.class }).newInstance(t);
		}
		catch (IllegalArgumentException e1)
		{
			handle(e1);
		}
		catch (SecurityException e1)
		{
			handle(e1);
		}
		catch (InstantiationException e1)
		{
			handle(e1);
		}
		catch (IllegalAccessException e1)
		{
			handle(e1);
		}
		catch (InvocationTargetException e1)
		{
			handle(e1);
		}
		catch (NoSuchMethodException e1)
		{
			handle(e1);
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	public <E extends Exception> E rethrow(String message, Throwable t)
	{
		Exception e = new Exception(t);
		handle(message, t);
		return (E) e;
	}
}
