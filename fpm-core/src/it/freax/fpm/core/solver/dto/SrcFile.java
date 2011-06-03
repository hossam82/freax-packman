package it.freax.fpm.core.solver.dto;

import java.util.Vector;

public class SrcFile
{
	private String name;
	private String content;
	private Vector<String> langs;
	private Vector<String> includes;
	private boolean isNotable;

	public SrcFile()
	{
		langs = new Vector<String>();
		includes = new Vector<String>();
	}

	public SrcFile(String name)
	{
		this();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public Vector<String> getLangs()
	{
		return langs;
	}

	public Vector<String> getIncludes()
	{
		return includes;
	}

	public boolean isNotable()
	{
		return isNotable;
	}

	public void setNotable(boolean isNotable)
	{
		this.isNotable = isNotable;
	}

	public void addLang(String lang)
	{
		langs.add(lang);
	}

	public void addImport(String include)
	{
		includes.add(include);
	}

	public void addAllIncludes(Vector<String> includes)
	{
		this.includes.addAll(includes);
	}

	public void addAllLangs(Vector<String> langs)
	{
		this.langs.addAll(langs);
	}

	@Override
	public String toString()
	{
		return name + "; isNotable: " + isNotable;
	}
}
