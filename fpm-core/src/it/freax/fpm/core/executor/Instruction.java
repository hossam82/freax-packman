package it.freax.fpm.core.executor;

import it.freax.fpm.core.specs.tarball.types.ExitCodeControlType;

public class Instruction
{
	private String workingDir;
	private String command;
	private int exitCode;
	private String output;
	private ExitCodeControlType exitCodecontrol;

	public Instruction(String command, String workingDir)
	{
		this.command = command;
		this.workingDir = workingDir;
	}

	public String getWorkingDir()
	{
		return this.workingDir;
	}

	public String getCommand()
	{
		return this.command;
	}

	public int getExitCode()
	{
		return this.exitCode;
	}

	public void setExitCode(int value)
	{
		this.exitCode = value;
	}

	public String getOutput()
	{
		return this.output;
	}

	public void setOutput(String value)
	{
		this.output = value;
	}

	public ExitCodeControlType getExitCodecontrol()
	{
		return this.exitCodecontrol;
	}

	public void setExitCodecontrol(ExitCodeControlType exitCodecontrol)
	{
		this.exitCodecontrol = exitCodecontrol;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Instruction:\n- workingDir --> ");
		builder.append(this.workingDir);
		builder.append("\n- command --> ");
		builder.append(this.command);
		builder.append("\n- exitCode --> ");
		builder.append(this.exitCode);
		builder.append("\n- output --> ");
		builder.append(this.output);
		builder.append("\n- exitCodecontrol --> ");
		builder.append(this.exitCodecontrol);
		return builder.toString();
	}
}
