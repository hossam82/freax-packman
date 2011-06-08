package it.freax.fpm.core.util;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class FileUtils extends Constants
{
	public static String read(File file) throws FileNotFoundException
	{
		StringBuilder ret = new StringBuilder();
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext())
		{
			ret.append(scanner.nextLine());
			ret.append(System.getProperty("line.separator"));
		}
		scanner.close();
		return ret.toString();
	}

	public static String read(InputStream is) throws IOException
	{
		StringBuilder ret = new StringBuilder();
		Scanner scanner = new Scanner(is);
		while (scanner.hasNext())
		{
			ret.append(scanner.nextLine());
			ret.append(System.getProperty("line.separator"));
		}
		scanner.close();
		is.close();
		return ret.toString();
	}

	private static Properties getPropertiesFromInputStream(InputStream is) throws IOException
	{
		Properties props = null;
		if (is != null)
		{
			props = new Properties();
			props.load(is);
		}
		return props;
	}

	public static Properties getProperties(String filename) throws IOException
	{
		return getPropertiesFromInputStream(getResource(filename));
	}

	public static InputStream getResource(String filename) throws FileNotFoundException
	{
		InputStream is = null;
		if (isSystemResource())
		{
			is = ClassLoader.getSystemResourceAsStream(filename);
		}
		else
		{
			is = new FileInputStream(filename);
		}
		return is;
	}
}
