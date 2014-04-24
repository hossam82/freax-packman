package it.freax.fpm.util;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Streams
{
	private String filename;
	private File file;
	private InputStream is;
	private boolean relative;

	public Streams(String filename)
	{
		if (relative = Strings.getOne().isRelativePath(filename))
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
		if (scanner != null)
		{
			while (scanner.hasNext())
			{
				ret.append(scanner.nextLine());
				ret.append(System.getProperty("line.separator"));
			}
			scanner.close();
		}
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
		if (relative)
		{
			is = ClassLoader.getSystemResourceAsStream(filename);
		}
		else
		{
			is = new FileInputStream(filename);
		}
		this.is = is;
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

	public void dump(InputStream is) throws IOException
	{
		dump(is, filename);
	}

	public void dump(InputStream is, String pathname) throws IOException
	{
		OutputStream os = new FileOutputStream(pathname);
		byte[] buffer = new byte[4096];
		int bytesRead;
		while ((bytesRead = is.read(buffer)) != -1)
		{
			os.write(buffer, 0, bytesRead);
		}
		is.close();
		os.close();
	}

	/**
	 * List directory contents for a resource folder. Not recursive.
	 * This is basically a brute-force implementation.
	 * Works for regular files and also JARs.
	 * 
	 * @author Greg Briggs
	 * @param clazz
	 *            Any java class that lives in the same place as the resources
	 *            you want.
	 * @param path
	 *            Should end with "/", but not start with one.
	 * @return Just the name of each member item, not the full paths.
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public static String[] getResourceListing(Class<?> clazz, String path, String regex) throws URISyntaxException, IOException
	{
		URL dirURL = clazz.getClassLoader().getResource(path);
		if ((dirURL != null) && dirURL.getProtocol().equals("file"))
		{
			/* A file path: easy enough */
			return new File(dirURL.toURI()).list();
		}

		if (dirURL == null)
		{
			/* 
			 * In case of a jar file, we can't actually find a directory.
			 * Have to assume the same jar as clazz.
			 */
			String me = clazz.getName().replace(".", "/") + ".class";
			dirURL = clazz.getClassLoader().getResource(me);
		}

		if (dirURL.getProtocol().equals("jar"))
		{
			/* A JAR path */
			String jarPath = dirURL.getPath().substring(5, dirURL.getPath().indexOf("!")); //strip out only the JAR file
			JarFile jar = new JarFile(URLDecoder.decode(jarPath, "UTF-8"));
			Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
			jar.close();
			Set<String> result = new HashSet<String>(); //avoid duplicates in case it is a subdirectory
			while (entries.hasMoreElements())
			{
				String name = entries.nextElement().getName();
				if (name.startsWith(path) && (regex.isEmpty() || name.matches(regex)))
				{ //filter according to the path
					String entry = name.substring(path.length());
					int checkSubdir = entry.indexOf("/");
					if (checkSubdir >= 0)
					{
						// if it is a subdirectory, we just return the directory name
						entry = entry.substring(0, checkSubdir);
					}
					result.add(entry);
				}
			}
			return result.toArray(new String[result.size()]);
		}

		throw new UnsupportedOperationException("Cannot list files for URL " + dirURL);
	}
}
