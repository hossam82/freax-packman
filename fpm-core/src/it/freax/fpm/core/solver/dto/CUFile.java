package it.freax.fpm.core.solver.dto;

import java.util.Vector;

public class CUFile
{
	private String Name;
	private boolean Notable;
	private Vector<String> LangMatches;
	private Vector<String> Imports;

	public CUFile(String name)
	{
		this.Name = name;
		this.LangMatches = new Vector<String>();
		this.Imports = new Vector<String>();
	}

	public String getName()
	{
		return this.Name;
	}

	public boolean getNotable()
	{
		return this.Notable;
	}

	public void setNotable(boolean value)
	{
		this.Notable = value;
	}

	public void addLang(String match)
	{
		this.LangMatches.add(match);
	}

	public void addImport(String Import)
	{
		this.Imports.add(Import);
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("CUFile:\n- Name --> ");
		builder.append(this.Name);
		builder.append("\n- Notable --> ");
		builder.append(this.Notable);
		builder.append("\n- LangMatches --> ");
		builder.append(this.LangMatches);
		builder.append("\n- Imports --> ");
		builder.append(this.Imports);
		return builder.toString();
	}
}
