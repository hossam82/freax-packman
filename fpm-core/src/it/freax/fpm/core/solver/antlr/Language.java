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
	private int importStmt;
	private int eos;

	/**
	 * @param languageName
	 * @param grammarFile
	 * @param entryPoint
	 * @param importStmt
	 * @param eos
	 */
	public Language(String languageName, String grammarFile, String entryPoint, int importStmt, int eos)
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
	public int getImportStmt()
	{
		return importStmt;
	}

	/**
	 * @return the eos
	 */
	public int getEos()
	{
		return eos;
	}

	public static Language create(File grammar, String lang) throws FileNotFoundException, ExtensionDecodingException
	{
		Language ret;
		Streams streams = Streams.getOne(grammar);
		Strings s = Strings.getOne();
		int importStmt = 0, eos = 0;
		String entryPoint, grammarContents = streams.read();
		String ep_pref = Constants.ENTRY_POINT_DEL, ep_suf = s.reverse(Constants.ENTRY_POINT_DEL);
		entryPoint = s.getStringInsideDelimiters(grammarContents, ep_pref, ep_suf);
		// TODO: Read grammar file and fill Language object with the importStmt and eos
		ret = new Language(lang, grammar.getAbsolutePath(), entryPoint, importStmt, eos);
		return ret;
	}
}
