package it.freax.fpm.core.specs.tarball.conf;

import it.freax.fpm.core.specs.tarball.types.MethodType;

public class MethodParams
{
	private MethodType type;
	private String divider;
	private int index;
	private boolean extension;

	public MethodParams(MethodType type, String divider)
	{
		this.type = type;
		this.divider = divider;
	}

	public MethodType getType()
	{
		return this.type;
	}

	public void setType(MethodType type)
	{
		this.type = type;
	}

	public String getDivider()
	{
		return this.divider;
	}

	public void setDivider(String divider)
	{
		this.divider = divider;
	}

	public int getIndex()
	{
		return this.index;
	}

	public void setIndex(int index)
	{
		this.index = index;
	}

	public boolean isExtension()
	{
		return this.extension;
	}

	public void setExtension(boolean extension)
	{
		this.extension = extension;
	}
}
