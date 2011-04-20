package it.freax.fpm.core.types;

public enum ExitCodeControl
{
	Weak, Strong, Inverted;

	public static String getDelimiter(ExitCodeControl exitCodecontrol)
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

	public static ExitCodeControl parseExitCodeControl(String exitCodeControl)
	{
		ExitCodeControl ret = null;
		if (exitCodeControl.equalsIgnoreCase("weak"))
		{
			ret = ExitCodeControl.Weak;
		}
		else if (exitCodeControl.equalsIgnoreCase("strong"))
		{
			ret = ExitCodeControl.Strong;
		}
		else if (exitCodeControl.equalsIgnoreCase("inverted"))
		{
			ret = ExitCodeControl.Inverted;
		}
		return ret;
	}
}
