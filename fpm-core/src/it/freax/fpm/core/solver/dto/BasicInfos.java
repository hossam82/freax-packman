package it.freax.fpm.core.solver.dto;

public class BasicInfos
{
	protected String PackageName;
	protected String Version;
	protected String Infos;

	public String getPackageName()
	{
		return this.PackageName;
	}

	public void setPackageName(String packageName)
	{
		this.PackageName = packageName;
	}

	public String getVersion()
	{
		return this.Version;
	}

	public void setVersion(String version)
	{
		this.Version = version;
	}

	public String getInfos()
	{
		return this.Infos;
	}

	public void setInfos(String infos)
	{
		this.Infos = infos;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("SubPackage:\n- PackageName --> ");
		builder.append(this.PackageName);
		builder.append("\n- Version --> ");
		builder.append(this.Version);
		builder.append("\n- Infos --> ");
		builder.append(this.Infos);
		return builder.toString();
	}
}
