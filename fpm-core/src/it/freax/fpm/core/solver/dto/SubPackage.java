package it.freax.fpm.core.solver.dto;

public class SubPackage
{
	protected String PackageName;
	protected String Version;
	protected String Infos;

	public String getPackageName()
	{
		return PackageName;
	}

	public void setPackageName(String packageName)
	{
		PackageName = packageName;
	}

	public String getVersion()
	{
		return Version;
	}

	public void setVersion(String version)
	{
		Version = version;
	}

	public String getInfos()
	{
		return Infos;
	}

	public void setInfos(String infos)
	{
		Infos = infos;
	}
}
