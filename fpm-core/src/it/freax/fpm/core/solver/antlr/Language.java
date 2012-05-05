/**
 * 
 */
package it.freax.fpm.core.solver.antlr;

import it.freax.fpm.util.Constants;
import it.freax.fpm.util.Streams;
import it.freax.fpm.util.Strings;
import it.freax.fpm.util.exceptions.ExtensionDecodingException;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author kLeZ-hAcK
 */
public class Language
{
	private String languageName;
	private String grammarFile;
	private String entryPoint;

	/**
	 * @param languageName
	 * @param grammarFile
	 * @param entryPoint
	 */
	public Language(String languageName, String grammarFile, String entryPoint)
	{
		this.languageName = languageName;
		this.grammarFile = grammarFile;
		this.entryPoint = entryPoint;
	}

	/**
	 * @return the languageName
	 */
	public String getLanguageName()
	{
		return languageName;
	}

	/**
	 * @return the grammarFile
	 */
	public String getGrammarFile()
	{
		return grammarFile;
	}

	/**
	 * @return the entryPoint
	 */
	public String getEntryPoint()
	{
		return entryPoint;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((entryPoint == null) ? 0 : entryPoint.hashCode());
		result = (prime * result) + ((grammarFile == null) ? 0 : grammarFile.hashCode());
		result = (prime * result) + ((languageName == null) ? 0 : languageName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) { return true; }
		if (obj == null) { return false; }
		if (!(obj instanceof Language)) { return false; }
		Language other = (Language) obj;
		if (entryPoint == null)
		{
			if (other.entryPoint != null) { return false; }
		}
		else if (!entryPoint.equals(other.entryPoint)) { return false; }
		if (grammarFile == null)
		{
			if (other.grammarFile != null) { return false; }
		}
		else if (!grammarFile.equals(other.grammarFile)) { return false; }
		if (languageName == null)
		{
			if (other.languageName != null) { return false; }
		}
		else if (!languageName.equals(other.languageName)) { return false; }
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Language [languageName=");
		builder.append(languageName);
		builder.append(", grammarFile=");
		builder.append(grammarFile);
		builder.append(", entryPoint=");
		builder.append(entryPoint);
		builder.append("]");
		return builder.toString();
	}

	public static Language create(File grammar, String lang) throws FileNotFoundException, ExtensionDecodingException
	{
		Language ret;
		Streams streams = Streams.getOne(grammar);
		Strings s = Strings.getOne();
		String entryPoint, grammarContents = streams.read();
		String ep_pref = Constants.ENTRY_POINT_DEL, ep_suf = s.reverse(Constants.ENTRY_POINT_DEL);
		entryPoint = s.getStringInsideDelimiters(grammarContents, ep_pref, ep_suf);
		ret = new Language(lang, grammar.getAbsolutePath(), entryPoint);
		return ret;
	}
}
