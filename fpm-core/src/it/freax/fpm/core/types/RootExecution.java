package it.freax.fpm.core.types;

public enum RootExecution
{
	Sudo, Expect;

	public static String getPrivileges(RootExecution rootExec)
	{
		String ret = "";
		switch (rootExec)
		{
			case Expect:
				ret = "";
				break;
			case Sudo:
				ret = "sudo";
				break;
		}
		return ret;
	}

	public static RootExecution parseRootExecution(String rootExec)
	{
		RootExecution ret = null;
		if (rootExec.equalsIgnoreCase("sudo"))
		{
			ret = RootExecution.Sudo;
		}
		else if (rootExec.equalsIgnoreCase("expect"))
		{
			ret = RootExecution.Expect;
		}
		return ret;
	}
}
