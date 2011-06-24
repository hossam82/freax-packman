/**
 * 
 */
package it.freax.fpm.core.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * @author kLeZ-hAcK
 */
public class Generics<T>
{
	Class<T> clazz;

	public Generics(Class<T> clazz)
	{
		this.clazz = clazz;
	}

	public static <T> Generics<T> getOne()
	{
		return new Generics<T>(null);
	}

	public static <T> Generics<T> getOne(Class<T> clazz)
	{
		return new Generics<T>(clazz);
	}

	@SuppressWarnings("unchecked")
	public T getInstance()
	{
		T t = null;
		if (clazz != null)
		{
			try
			{
				t = clazz.newInstance();
			}
			catch (InstantiationException e)
			{
				e.printStackTrace();
			}
			catch (IllegalAccessException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			t = (T) new Object();
		}
		return t;
	}

	public T getChildInstance(String childSideName, Object... args)
	{
		StringBuffer className = new StringBuffer(clazz.getPackage().getName());
		className.append('.');
		className.append(childSideName).append(clazz.getName());
		return getInstance(className.toString(), args);
	}

	@SuppressWarnings("unchecked")
	public T getInstance(String className, Object... args)
	{
		T ret = null;
		Collections<Class<?>> colls = Collections.getOne(new ArrayList<Class<?>>());
		try
		{
			Class<?> dad = Class.forName(className);
			for (Object o : args)
			{
				colls.add(o.getClass());
			}
			ret = (T) dad.getConstructor(colls.toArray()).newInstance(args);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SecurityException e)
		{
			e.printStackTrace();
		}
		catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch (InvocationTargetException e)
		{
			e.printStackTrace();
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	public <C> C cast(T t)
	{
		return (C) t;
	}
}
