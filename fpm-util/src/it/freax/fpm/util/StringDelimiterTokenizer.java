/**
 * 
 */
package it.freax.fpm.util;

import java.util.Enumeration;

/**
 * @author klez
 * 
 */
public class StringDelimiterTokenizer implements Enumeration<String>
{
	int currentposition = 0;
	String stringToSplit;
	String delimiter;
	String[] tokens;

	/**
	 * 
	 */
	public StringDelimiterTokenizer(String sToTokenize, String delim)
	{
		this(sToTokenize, delim, false);
	}

	/**
	 * 
	 */
	public StringDelimiterTokenizer(String sToTokenize, String delim, boolean tokenizeDelimiter)
	{
		stringToSplit = sToTokenize;
		delimiter = delim;
		tokens = splitString(stringToSplit, delimiter, tokenizeDelimiter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Enumeration#hasMoreElements()
	 */
	@Override
	public boolean hasMoreElements()
	{
		return currentposition < tokens.length;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Enumeration#nextElement()
	 */
	@Override
	public String nextElement()
	{
		if (hasMoreElements())
		{
			return tokens[currentposition++];
		}
		else
		{
			return null;
		}
	}

	public boolean hasMoreTokens()
	{
		return hasMoreElements();
	}

	public String nextToken()
	{
		return nextElement();
	}

	/**
	 * String split on multicharacter delimiter.
	 * 
	 * @param stringToSplit
	 * @param delimiter
	 * @return
	 */
	private static String[] splitString(String stringToSplit, String delimiter, boolean takeDelimiter)
	{
		String[] aRet;
		int iLast;
		int iFrom;
		int iFound;
		int iRecords;
		int iJump;

		// return Blank Array if stringToSplit == "")
		if (stringToSplit.equals("")) { return new String[0]; }

		// count Field Entries
		iFrom = 0;
		iRecords = 0;
		while (true)
		{
			iFound = stringToSplit.indexOf(delimiter, iFrom);
			if (iFound == -1)
			{
				break;
			}

			iRecords += (takeDelimiter ? 2 : 1);
			iFrom = iFound + delimiter.length();
		}
		iRecords = iRecords + 1;

		// populate aRet[]
		aRet = new String[iRecords];
		if (iRecords == 1)
		{
			aRet[0] = stringToSplit;
		}
		else
		{
			iLast = 0;
			iFrom = 0;
			iFound = 0;
			iJump = 0;
			for (int i = 0; i < iRecords; i++)
			{
				iFound = stringToSplit.indexOf(delimiter, iFrom);
				if (takeDelimiter)
				{
					iJump = (iFrom == iFound ? delimiter.length() : 0);
					iFound += iJump;
				}
				if (iFound == -1)
				{ // at End
					aRet[i] = stringToSplit.substring(iLast + delimiter.length(), stringToSplit.length());
				}
				else if (iFound == 0)
				{ // at Beginning
					aRet[i] = delimiter;
				}
				else
				{ // somewhere in middle
					aRet[i] = stringToSplit.substring(iFrom, iFound);
				}
				iLast = iFound - (takeDelimiter ? iJump : 0);
				iFrom = iFound + (takeDelimiter ? 0 : delimiter.length());
			}
		}
		return aRet;
	}

	public static void main(String[] args)
	{
		String s = "This is a string, to split gracefully, with a multi-character delimiter.";
		String[] res = splitString(s, ", ", true);
		System.out.println("With takeDelimiter = true");
		System.out.println();
		for (int i = 0; i < res.length; i++)
		{
			System.out.println(res[i]);
		}
		System.out.println();
		res = splitString(s, ", ", false);
		System.out.println("With takeDelimiter = false");
		System.out.println();
		for (int i = 0; i < res.length; i++)
		{
			System.out.println(res[i]);
		}
		System.out.println();
	}

}
