package it.freax.fpm.core.executor;

import it.freax.fpm.core.types.ExitCodeControl;
import it.freax.fpm.util.LogConfigurator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;

public class Executor implements Runnable
{
	public static final String[] STATUSES = { "Idle", "Working", "Error", "Completed" };
	public static final int IDLE = 0;
	public static final int WORKING = 1;
	public static final int ERROR = 2;
	public static final int COMPLETED = 3;

	private Instruction instruction;
	private static Logger log = LogConfigurator.getOne(Executor.class).configure();

	private int status = IDLE;

	public Executor(Instruction instruction) throws IOException
	{
		this.instruction = instruction;
	}

	public void execute()
	{
		status = WORKING;
		Thread t = new Thread(this);
		t.start();
	}

	public int getStatus()
	{
		return status;
	}

	@Override
	public void run()
	{
		String delimiter = ExitCodeControl.getDelimiter(instruction.getExitCodecontrol());
		String command = "";
		int exitStatus = 0;

		try
		{
			StringTokenizer st = new StringTokenizer(instruction.getCommand());
			List<String> cmds = new ArrayList<String>();

			while (st.hasMoreTokens())
			{
				cmds.add(st.nextToken());
			}

			int end = 0;
			Runtime env = Runtime.getRuntime();
			File pwd = new File(instruction.getWorkingDir());

			while (end < cmds.size())
			{
				if (cmds.get(0).equalsIgnoreCase(delimiter))
				{
					continue;
				}

				end = cmds.indexOf(delimiter);
				// If the thread is already dead, return.
				// A zero status value corresponds to "NEW".

				if (end < 0)
				{
					end = cmds.size();
				}

				List<String> subCmd = cmds.subList(0, end);
				String[] cmd = subCmd.toArray(new String[subCmd.size()]);

				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < cmd.length; i++)
				{
					sb.append(cmd[i]);
					if (i < cmd.length - 1)
					{
						sb.append(" ");
					}
				}
				command = sb.toString();

				if (command.startsWith("cd"))
				{
					StringBuilder path = new StringBuilder();
					path.append(pwd.getAbsolutePath());
					if (!path.toString().endsWith(System.getProperty("file.separator")))
					{
						path.append(System.getProperty("file.separator"));
					}
					path.append(command.substring(3));
					pwd = new File(path.toString());

					Object[] args = new Object[] { command, 0 };
					String msg = String.format("Command [%1s] exited with status %2d", args);
					log.info(msg);

					// Flushing list from executed commands that have had no
					// problems
					for (int i = end; i >= 0; i--)
					{
						if (end == cmds.size())
						{
							cmds.clear();
							break;
						}

						cmds.remove(i);
					}
					continue;
				}

				Process updater = env.exec(cmd, null, pwd);
				BufferedReader in = new BufferedReader(new InputStreamReader(updater.getInputStream()));

				String line = "";
				while ((line = in.readLine()) != null)
				{
					log.info(line);
				}

				updater.waitFor();
				exitStatus = updater.exitValue();

				Object[] args = new Object[] { command, exitStatus };
				String msg = String.format("Command [%1s] exited with status %2d", args);
				log.info(msg);

				// Flushing list from executed commands that have had no
				// problems
				if (exitStatus == 0)
				{
					for (int i = end; i >= 0; i--)
					{
						if (end == cmds.size())
						{
							cmds.clear();
							break;
						}

						cmds.remove(i);
					}
				}
				else
				{
					break;
				}
			}
			status = COMPLETED;
			instruction.setExitCode(exitStatus);
		}
		catch (IOException e)
		{
			status = ERROR;
			log.error(null, e);
		}
		catch (InterruptedException e)
		{
			status = ERROR;
			log.error(null, e);
		}
	}
}
