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
	private String importStmt;
	private String eos;

	/**
	 * @param languageName
	 * @param grammarFile
	 * @param entryPoint
	 * @param importStmt
	 * @param eos
	 */
	public Language(String languageName, String grammarFile, String entryPoint, String importStmt, String eos)
	{
		this.languageName = languageName;
		this.grammarFile = grammarFile;
		this.entryPoint = entryPoint;
		this.importStmt = importStmt;
		this.eos = eos;
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

	/**
	 * @return the importStmt
	 */
	public String getImportStmt()
	{
		return importStmt;
	}

	/**
	 * @return the eos
	 */
	public String getEos()
	{
		return eos;
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
		result = (prime * result) + ((eos == null) ? 0 : eos.hashCode());
		result = (prime * result) + ((grammarFile == null) ? 0 : grammarFile.hashCode());
		result = (prime * result) + ((importStmt == null) ? 0 : importStmt.hashCode());
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
		if (eos == null)
		{
			if (other.eos != null) { return false; }
		}
		else if (!eos.equals(other.eos)) { return false; }
		if (grammarFile == null)
		{
			if (other.grammarFile != null) { return false; }
		}
		else if (!grammarFile.equals(other.grammarFile)) { return false; }
		if (importStmt == null)
		{
			if (other.importStmt != null) { return false; }
		}
		else if (!importStmt.equals(other.importStmt)) { return false; }
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
		builder.append(", importStmt=");
		builder.append(importStmt);
		builder.append(", eos=");
		builder.append(eos);
		builder.append("]");
		return builder.toString();
	}

	public static Language create(File grammar, String lang) throws FileNotFoundException, ExtensionDecodingException
	{
		Language ret;
		Streams streams = Streams.getOne(grammar);
		Strings s = Strings.getOne();
		String entryPoint, importStmt, eos, grammarContents = streams.read();
		String ep_pref = Constants.ENTRY_POINT_DEL, ep_suf = s.reverse(Constants.ENTRY_POINT_DEL);
		String is_pref = Constants.IMPORT_STMT_DEL, is_suf = s.reverse(Constants.IMPORT_STMT_DEL);
		String eos_pref = Constants.EOS_DEL, eos_suf = s.reverse(Constants.EOS_DEL);
		entryPoint = s.getStringInsideDelimiters(grammarContents, ep_pref, ep_suf);
		importStmt = s.getStringInsideDelimiters(grammarContents, is_pref, is_suf);
		eos = s.getStringInsideDelimiters(grammarContents, eos_pref, eos_suf);

		entryPoint = cleanColoredTags(entryPoint, s);
		importStmt = cleanColoredTags(importStmt, s);
		eos = cleanColoredTags(eos, s);

		ret = new Language(lang, grammar.getAbsolutePath(), entryPoint, importStmt, eos);
		return ret;
	}

	private static String cleanColoredTags(String input, Strings util)
	{
		String ret = "";
		ret = util.trimEnd(util.trimStart(input.replace("/*", "").replace("*/", "")));
		return ret;
	}
}
