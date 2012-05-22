package it.freax.fpm.core.specs.tarball.conf;

import it.freax.fpm.core.specs.tarball.types.ExitCodeControlType;
import it.freax.fpm.core.specs.tarball.types.RootExecutionType;

public class General
{
	private RootExecutionType rootExec;
	private ExitCodeControlType exitCodeControl;

	public RootExecutionType getRootExec()
	{
		return this.rootExec;
	}

	public void setRootExec(RootExecutionType rootExec)
	{
		this.rootExec = rootExec;
	}

	public ExitCodeControlType getExitCodeControl()
	{
		return this.exitCodeControl;
	}

	public void setExitCodeControl(ExitCodeControlType exitCodeControl)
	{
		this.exitCodeControl = exitCodeControl;
	}
}
