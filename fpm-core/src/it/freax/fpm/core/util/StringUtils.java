package it.freax.fpm.core.util;

import java.util.Collection;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Pattern;

public class StringUtils
{
	public static final int rangeExtMin = 2;
	public static final int rangeExtMax = 4;
	public static final String extSeparator = ".";

	public static String getExtension(String path)
	{
		String ext = "";
		Vector<String> candidates = new Vector<String>();
		String[] splitted = path.split(extSeparator);
		for (int i = 0; i < splitted.length - 1; i++)
		{
			if (!splitted[i].isEmpty() && inRangeExt(splitted[i]))
			{
				candidates.add(splitted[i]);
			}
		}
		if (!path.endsWith(ext)) { throw new NullPointerException("Extension decoding failed!"); }
		return ext;
	}

	private static boolean inRangeExt(String ext)
	{
		return (ext.length() >= rangeExtMin) && (ext.length() <= rangeExtMax);
	}

	public static String removeExtension(String fileName)
	{
		return fileName.replace(getExtension(fileName), "");
	}

	public static String replaceExtension(String fileName, String extToReplace)
	{
		return fileName.replace(getExtension(fileName), extToReplace);
	}

	public static String trimEnd(String str)
	{
		str = str.trim();
		int idx = str.lastIndexOf(' ');
		if ((str != null) && !str.equalsIgnoreCase(""))
		{
			str = str.substring(0, idx);
		}
		return str;
	}

	public static String trimStart(String str)
	{
		str = str.trim();
		int idx = str.lastIndexOf(' ') + 1;
		if ((str != null) && !str.equalsIgnoreCase(""))
		{
			str = str.substring(idx, str.length());
		}
		return str;
	}

	public static String getStringInsideDelimiters(String input, String startDelimiter, String endDelimiter)
	{
		String ret = "";
		if ((input != null) && !input.isEmpty())
		{
			ret = input.substring(input.indexOf(startDelimiter) + 1);
			if (!ret.equalsIgnoreCase(input))
			{
				ret = ret.substring(0, ret.indexOf(endDelimiter));
			}
		}
		return ret;
	}

	public static String getStringFromKeyValue(String input, String keyValueDelimiter, boolean getKey)
	{
		String ret = "";
		StringTokenizer st = new StringTokenizer(input, keyValueDelimiter);
		if (getKey)
		{
			ret = st.nextToken();
		}
		else
		{
			st.nextToken();
			if (st.hasMoreTokens())
			{
				ret = st.nextToken();
			}
		}
		return ret;
	}

	public static String Clean(String input)
	{
		return input.replace("[", "").replace("]", "");
	}

	public static String getRowSubstring(String input, String subset, boolean removeSubSet)
	{
		int beginIndex = input.indexOf(subset);
		if (removeSubSet)
		{
			beginIndex += subset.length();
		}
		return input.substring(beginIndex);
	}

	public static Vector<String> getLines(String input)
	{
		Vector<String> ret = new Vector<String>();
		Scanner scn = new Scanner(input);
		while (scn.hasNext())
		{
			ret.add(scn.next());
		}
		return ret;
	}

	public static String getLines(Collection<String> input)
	{
		StringBuffer ret = new StringBuffer();
		String[] inputArr = input.toArray(new String[input.size()]);
		for (int i = 0; i < inputArr.length; i++)
		{
			ret.append(inputArr[i]).append(System.getProperty("line.separator"));
		}
		return ret.toString();
	}

	public static Vector<String> grep(String input, String pattern, boolean caseInsensitive)
	{
		Vector<String> ret = new Vector<String>();
		Scanner scn = new Scanner(input);
		int Options = 0;
		if (caseInsensitive)
		{
			Options |= Pattern.CASE_INSENSITIVE;
		}
		Pattern patRegex = Pattern.compile(pattern, Options);
		while (scn.hasNext())
		{
			String curr = scn.nextLine();
			if (patRegex.matcher(curr).matches())
			{
				ret.add(curr);
			}
		}
		return ret;
	}

	public static String Split(String input, String delim, int elemidx, boolean remext)
	{
		String ret = "";
		if (remext)
		{
			ret = removeExtension(input);
		}
		ret = input.split(delim)[elemidx];
		return ret;
	}

	private static int getOpID(String input)
	{
		int opid = 0;
		char first = input.charAt(0);
		switch (first)
		{
			case '"':
			{
				opid = 1;
				break;
			}
			case '\'':
			{
				opid = 2;
				break;
			}
			case '<':
			{
				opid = 3;
				break;
			}
			case '{':
			{
				opid = 4;
				break;
			}
			case '[':
			{
				opid = 5;
				break;
			}
			case '(':
			{
				opid = 6;
				break;
			}
		}
		return opid;
	}

	public static String KeyValue(String input, String delim)
	{
		String ret = "";
		ret = getStringFromKeyValue(input, delim, false);
		int opid = getOpID(ret);
		switch (opid)
		//gli esempi sono tutti con uguale anche se il delimiter è dinamico
		{
			case 0: // Semplice, Chiave=Valore
			{
				break;
			}
			case 1:// Con virgolette, Chiave="Valore"
			{
				ret = getStringInsideDelimiters(ret, "\"", "\"");
				break;
			}
			case 2: // Con apici, Chiave='Valore'
			{
				ret = getStringInsideDelimiters(ret, "'", "'");
				break;
			}
			case 3: // Con parentesi angolari, Chiave=<Valore>
			{
				ret = getStringInsideDelimiters(ret, "<", ">");
				break;
			}
			case 4: // Con parentesi graffe, Chiave={Valore}
			{
				ret = getStringInsideDelimiters(ret, "{", "}");
				break;
			}
			case 5: // Con parentesi quadre, Chiave=[Valore]
			{
				ret = getStringInsideDelimiters(ret, "[", "]");
				break;
			}
			case 6: // Con parentesi tonde, Chiave=(Valore)
			{
				ret = getStringInsideDelimiters(ret, "(", ")");
				break;
			}
		}
		return ret;
	}

	public static String trimDir(String file)
	{
		int idx = file.lastIndexOf(System.getProperty("file.separator")) + 1;
		file = file.substring(idx);
		return file;
	}
}
