package it.freax.fpm.test.main;

import it.freax.fpm.core.executor.Executor;
import it.freax.fpm.core.executor.Instruction;

import java.io.File;
import java.io.IOException;

public class ProcessRunner
{
	public static void main(String[] args)
	{
		File file = new File(args[1]);
		String command = null, workingDir = null;
		if (args[0].equalsIgnoreCase("--make"))
		{
			String filename = file.getName(), dirname;
			dirname = filename.substring(0, filename.lastIndexOf('.'));
			if (filename.contains("tar"))
			{
				dirname = dirname.substring(0, dirname.lastIndexOf('.'));
			}

			command = String.format("rm -rf %1$s/ && tar -xvzf %2$s && cd %1$s/ && ./configure && make && sudo make install", new Object[] { dirname, filename });

			if (file.getPath().contains("/"))
			{
				workingDir = file.getPath();
			}
			else
			{
				workingDir = System.getenv("PWD");
			}
		}

		// command =
		// "rm -rf hexedit-0.9.7/ && tar -xvzf hexedit-0.9.7.tar.gz && cd hexedit-0.9.7/ && ./configure && make && sudo make install";
		// workingDir = "/home/klez/Documents/Programmi/hexedit/";
		Executor bld;

		try
		{
			Instruction instr = new Instruction(command, workingDir);
			bld = new Executor(instr);
			bld.execute();
			while (bld.getStatus() == Executor.WORKING)
			{
				Thread.sleep(1 * 1000);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
