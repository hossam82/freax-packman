package it.freax.fpm.core.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FileUtils
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
}
