package it.freax.fpm.core.specs.tarball.types;

public enum ExitCodeControlType
{
	Weak, Strong, Inverted;

	public static String getDelimiter(ExitCodeControlType exitCodecontrol)
	{
		String ret = "&&";
		switch (exitCodecontrol)
		{
			case Weak:
				ret = ";";
				break;
			case Strong:
				ret = "&&";
				break;
			case Inverted:
				ret = "||";
				break;
		}
		return ret;
	}

	public static ExitCodeControlType parseExitCodeControl(String exitCodeControl)
	{
		ExitCodeControlType ret = null;
		if (exitCodeControl.equalsIgnoreCase("weak"))
		{
			ret = ExitCodeControlType.Weak;
		}
		else if (exitCodeControl.equalsIgnoreCase("strong"))
		{
			ret = ExitCodeControlType.Strong;
		}
		else if (exitCodeControl.equalsIgnoreCase("inverted"))
		{
			ret = ExitCodeControlType.Inverted;
		}
		return ret;
	}
}
