/**
 * 
 */
package it.freax.fpm.util;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author klez
 */
public class FileNameRegexFilter implements FilenameFilter
{
	private String regex;

	/**
	 * 
	 */
	public FileNameRegexFilter(String regex)
	{
		this.regex = regex;
	}

	/* (non-Javadoc)
	 * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
	 */
	@Override
	public boolean accept(File dir, String name)
	{
		return name.matches(regex);
	}

}
