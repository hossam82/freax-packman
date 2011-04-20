package it.freax.fpm.test.main;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

public class TestGetResources
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		File[] files = File.listRoots();
		Properties props = System.getProperties();
		Map<String, String> env = System.getenv();

		for (int i = 0; i < files.length; i++)
		{
			System.out.println(files[i].getPath());
		}

		File testtxt = new File("test.txt");
		System.out.println(testtxt.exists());

		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println();
		System.out.println();

		props.list(System.out);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		Iterator<Entry<String, String>> iterator = env.entrySet().iterator();

		while (iterator.hasNext())
		{
			Entry<String, String> entry = iterator.next();
			System.out.print("Key: ");
			System.out.println(entry.getKey());
			System.out.print("Value: ");
			System.out.println(entry.getValue());
		}
	}
}
