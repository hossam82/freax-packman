package it.freax.fpm.core.util;

import it.freax.fpm.core.types.ExitCodeControl;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class CoreUtils
{
	public static <E> E firstOrDefault(Vector<E> vec, E defaultArg)
	{
		return (vec.isEmpty() ? defaultArg : vec.firstElement());
	}

	public static <E> E lastOrDefault(Vector<E> vec, E defaultArg)
	{
		return (vec.isEmpty() ? defaultArg : vec.lastElement());
	}

	public static <E> E indexOrDefault(Vector<E> vec, int index, E defaultArg)
	{
		return (vec.isEmpty() ? defaultArg : vec.get(index));
	}

	public static <E> Vector<E> toVector(E[] arr)
	{
		List<E> l = Arrays.asList(arr);
		return new Vector<E>(l);
	}

	public static Vector<String> split(String str, String delim)
	{
		Vector<String> ret = new Vector<String>();
		if (str != null)
		{
			ret = toVector(str.split(delim));
		}
		return ret;
	}

	public static String merge(Vector<String> toMerge, String delimiter)
	{
		StringBuffer merged = new StringBuffer();
		for (int i = 0; i < toMerge.size(); i++)
		{
			merged.append(toMerge.get(i));
			if (i < toMerge.size() - 1)
			{
				merged.append(delimiter);
			}
		}
		return merged.toString();
	}

	public static String getDelimiter(ExitCodeControl exitCodecontrol)
	{
		String ret = "&&";
		switch (exitCodecontrol)
		{
			case Weak:
				ret = ";";
				break;
			case Strong:
				ret = "&&";
				break;
			case Inverted:
				ret = "||";
				break;
		}
		return ret;
	}

	public static String concatPaths(String... args)
	{
		String ret = "";
		final String FS = System.getProperty("file.separator");
		for (int i = 0; i < args.length; i++)
		{
			if (!ret.endsWith(FS))
			{
				ret += FS;
			}
			if (args[i].endsWith(FS))
			{
				ret += args[i];
			}
			else
			{
				ret += args[i] + FS;
			}
		}
		return ret;
	}
}
