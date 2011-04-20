package it.freax.fpm.test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestParseFile
{
	public static void main(String[] args)
	{
		File file = new File("/home/kLeZ-hAcK/Documents/Documenti OpenOffice/dist-upgrade_201007241514.log");
		StringBuilder ret = new StringBuilder();
		Scanner scanner = null;
		try
		{
			scanner = new Scanner(file);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		while (scanner.hasNext())
		{
			ret.append(scanner.nextLine());
			ret.append(System.getProperty("line.separator"));
		}

		System.out.println(ret.toString());
	}
}
