package it.freax.fpm.core.specs.tarball.types;

public enum RootExecutionType
{
	Sudo, Expect;

	public static String getPrivileges(RootExecutionType rootExec)
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

	public static RootExecutionType parseRootExecution(String rootExec)
	{
		RootExecutionType ret = null;
		if (rootExec.equalsIgnoreCase("sudo"))
		{
			ret = RootExecutionType.Sudo;
		}
		else if (rootExec.equalsIgnoreCase("expect"))
		{
			ret = RootExecutionType.Expect;
		}
		return ret;
	}
}
