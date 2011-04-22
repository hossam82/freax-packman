package it.freax.fpm.core.solver.dto;

import it.freax.fpm.core.solver.specs.DummySpec;

import java.util.TreeSet;

public class PackageInfos
{
	private TreeSet<Treenode> archiveSpecification;
	private DummySpec dummy;

	public PackageInfos()
	{
		this.archiveSpecification = new TreeSet<Treenode>();
		this.dummy = new DummySpec();
	}

	public TreeSet<Treenode> getArchiveSpecification()
	{
		return this.archiveSpecification;
	}

	public void setArchiveSpecification(TreeSet<Treenode> archiveSpecification)
	{
		this.archiveSpecification = archiveSpecification;
	}

	public DummySpec getDummy()
	{
		return this.dummy;
	}

	public void setDummy(DummySpec dummy)
	{
		this.dummy = dummy;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("PackageInfos:\n- dummy --> ");
		builder.append(this.dummy);
		return builder.toString();
	}
}
