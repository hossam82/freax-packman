package it.freax.fpm.core.solver.dto;

import java.util.TreeSet;

public class PackageInfos
{
	private TreeSet<Treenode> archiveSpecification;
	private String packageName;
	private String packageVersion;

	public String getPackageName()
	{
		return this.packageName;
	}

	public void setPackageName(String packageName)
	{
		this.packageName = packageName;
	}

	public String getPackageVersion()
	{
		return this.packageVersion;
	}

	public void setPackageVersion(String packageVersion)
	{
		this.packageVersion = packageVersion;
	}

	public TreeSet<Treenode> getArchiveSpecification()
	{
		return this.archiveSpecification;
	}

	public void setArchiveSpecification(TreeSet<Treenode> archiveSpecification)
	{
		this.archiveSpecification = archiveSpecification;
	}
}
