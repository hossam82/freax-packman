package it.freax.fpm.core.specs.tarball.dto;

import java.util.ArrayList;

public class SrcFile
{
	private String name;
	private String content;
	private ArrayList<String> langs;
	private ArrayList<String> includes;
	private boolean isNotable;

	public SrcFile()
	{
		langs = new ArrayList<String>();
		includes = new ArrayList<String>();
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

	public ArrayList<String> getLangs()
	{
		return langs;
	}

	public ArrayList<String> getIncludes()
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

	public void addAllIncludes(ArrayList<String> includes)
	{
		this.includes.addAll(includes);
	}

	public void addAllLangs(ArrayList<String> langs)
	{
		this.langs.addAll(langs);
	}

	@Override
	public String toString()
	{
		return name + "; isNotable: " + isNotable;
	}
}
