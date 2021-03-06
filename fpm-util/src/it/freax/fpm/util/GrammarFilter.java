/**
 * 
 */
package it.freax.fpm.util;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;

/**
 * @author klez
 */
public class GrammarFilter<K, V> implements FilenameFilter
{
	private final Map<K, V> supported_langs;

	public GrammarFilter(Map<K, V> supported_langs)
	{
		this.supported_langs = supported_langs;
	}

	/* (non-Javadoc)
	 * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
	 */
	@Override
	public boolean accept(File dir, String name)
	{
		return supported_langs.containsKey(name) && name.endsWith(".g");
	}
}
