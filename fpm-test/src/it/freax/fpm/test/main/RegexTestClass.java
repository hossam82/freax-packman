package it.freax.fpm.test.main;

import java.io.File;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexTestClass
{
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		Pattern p = Pattern.compile("(.*)VERSION(.*)=(.*)");
		System.out.println(p.matcher("SMB_VERSION_STRING='3.5.5'").matches());
		System.out.println(p.matcher("VERSION='3.5.5'").matches());
		String path = "/home/kLeZ-hAcK/Documents/Programmi/Sorgenti/samba-3.5.5/source3/configure";
		Scanner scn = new Scanner(new File(path));
		int countNoPat = 0, countPat = 0;
		long timestart = Calendar.getInstance().getTimeInMillis();
		while (scn.hasNext())
		{
			if (p.matcher(scn.next()).matches())
			{
				countNoPat++;
			}
		}
		System.out.println(Calendar.getInstance().getTimeInMillis() - timestart);
		timestart = Calendar.getInstance().getTimeInMillis();
		while (scn.hasNext(p))
		{
			if (!scn.next(p).isEmpty())
			{
				countPat++;
			}
		}
		System.out.println(Calendar.getInstance().getTimeInMillis() - timestart);
		System.out.println(countNoPat);
		System.out.println(countPat);
	}
}
