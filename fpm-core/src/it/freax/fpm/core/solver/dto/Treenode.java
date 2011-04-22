package it.freax.fpm.core.solver.dto;

public class Treenode implements Comparable<Treenode>
{
	private String Name;
	private CompilationUnit AssociatedCU;
	private boolean IsCU = false;

	public Treenode(String Name)
	{
		this.Name = Name;
		this.AssociatedCU = new CompilationUnit(Name);
	}

	public String getName()
	{
		return this.Name;
	}

	public CompilationUnit getAssociatedCU()
	{
		return this.AssociatedCU;
	}

	public boolean isCU()
	{
		return this.IsCU;
	}

	public void setIsCU(boolean value)
	{
		this.IsCU = value;
	}

	public void updateCU(CompilationUnit cu)
	{
		if ((cu != null) && cu.getName().equalsIgnoreCase(this.AssociatedCU.getName()))
		{
			this.AssociatedCU = cu;
		}
	}

	@Override
	public int compareTo(Treenode arg0)
	{
		return this.Name.compareTo(arg0.getName());
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Treenode:\n- Name --> ");
		builder.append(this.Name);
		builder.append("\n- IsCU --> ");
		builder.append(this.IsCU);
		builder.append("\n- AssociatedCU --> ");
		builder.append(this.AssociatedCU);
		return builder.toString();
	}
}
