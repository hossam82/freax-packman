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
		this.langs = new Vector<String>();
		this.includes = new Vector<String>();
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public Vector<String> getLangs()
	{
		return this.langs;
	}

	public Vector<String> getIncludes()
	{
		return this.includes;
	}

	public boolean isNotable()
	{
		return this.isNotable;
	}

	public void setNotable(boolean isNotable)
	{
		this.isNotable = isNotable;
	}

	public void addLang(String lang)
	{
		this.langs.add(lang);
	}

	public void addInclude(String include)
	{
		this.includes.add(include);
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
		return this.name + "; isNotable: " + this.isNotable;
	}
}
