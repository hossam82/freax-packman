package it.freax.fpm.core.specs.tarball.conf;

public class Instruction implements Comparable<Instruction>
{
	private int id;
	private String action;
	private String permissions;

	public Instruction(int id, String action, String permissions)
	{
		this.id = id;
		this.action = action;
		this.permissions = permissions;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getAction()
	{
		return this.action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	public String getPermissions()
	{
		return this.permissions;
	}

	public void setPermissions(String permissions)
	{
		this.permissions = permissions;
	}

	@Override
	public int compareTo(Instruction instr)
	{
		return this.action.compareTo(instr.action);
	}
}
