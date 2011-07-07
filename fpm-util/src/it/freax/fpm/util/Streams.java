package it.freax.fpm.util;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class Streams extends Constants
{
	private String filename;
	private File file;
	private InputStream is;

	public Streams(String filename)
	{
		if (isSystemResource())
		{
			this.filename = filename;
		}
		else
		{
			file = new File(filename);
			this.filename = file.getAbsolutePath();
		}
	}

	public Streams(File file)
	{
		this.file = file;
		filename = file.getAbsolutePath();
	}

	public Streams(InputStream is)
	{
		this.is = is;
	}

	public static Streams getOne(String filename)
	{
		return new Streams(filename);
	}

	public static Streams getOne(File file)
	{
		return new Streams(file);
	}

	public static Streams getOne(InputStream is)
	{
		return new Streams(is);
	}

	public String read() throws FileNotFoundException
	{
		StringBuilder ret = new StringBuilder();
		Scanner scanner = null;
		if (file != null)
		{
			scanner = new Scanner(file);
		}
		else if (is != null)
		{
			scanner = new Scanner(is);
		}
		while (scanner.hasNext())
		{
			ret.append(scanner.nextLine());
			ret.append(System.getProperty("line.separator"));
		}
		scanner.close();
		return ret.toString();
	}

	private Properties getPropertiesFromInputStream(InputStream is) throws IOException
	{
		Properties props = null;
		if (is != null)
		{
			props = new Properties();
			props.load(is);
		}
		return props;
	}

	public Properties getProperties() throws IOException
	{
		Properties props = null;
		if (is != null)
		{
			props = getPropertiesFromInputStream(is);
		}
		else
		{
			props = getPropertiesFromInputStream(getResource());
		}
		return props;
	}

	public InputStream getResource() throws FileNotFoundException
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

	public File write(byte[] toWrite, boolean overwrite) throws IOException
	{
		if (file == null)
		{
			file = new File(filename);
		}
		if (overwrite)
		{
			file.delete();
		}
		if (file.exists() || file.createNewFile())
		{
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(toWrite);
			fileOutputStream.close();
		}
		else
		{
			throw new IOException("File not exists and cannot be created, aborting");
		}
		return file;
	}
}
