package it.freax.fpm.core.specs;

import java.io.File;

public class RpmSpec extends Spec
{
	protected String PackageName;
	protected String OS;
	protected String Architecture;

	public String getArchitecture()
	{
		return this.Architecture;
	}

	public String getOS()
	{
		return this.OS;
	}

	public String getPackageName()
	{
		return this.PackageName;
	}

	@Override
	public void Load(File file)
	{
		// TODO Load

	}

	@Override
	public String toString()
	{
		// TODO toString
		return null;
	}

}
