package it.freax.fpm.util;

import java.io.IOException;

import org.apache.log4j.*;

public class LogConfigurator extends Constants
{
	Class<?> clazz;

	public LogConfigurator(Class<?> clazz)
	{
		this.clazz = clazz;
	}

	public static LogConfigurator getOne(Class<?> clazz)
	{
		return new LogConfigurator(clazz);
	}

	public Logger configure()
	{
		return configure(false);
	}

	public Logger configure(boolean logToConsole)
	{
		Logger log = Logger.getLogger(clazz);
		String logPath = getDirPrefix() + getLogFile();
		PatternLayout layout = new PatternLayout(getPattern());
		log.setLevel(Level.ALL);

		if (logToConsole)
		{
			ConsoleAppender consapp = new ConsoleAppender(layout);
			consapp.setTarget("System.out");
			log.addAppender(consapp);
		}

		FileAppender fileapp;
		try
		{
			fileapp = new FileAppender(layout, logPath);
			log.addAppender(fileapp);
		}
		catch (IOException e)
		{
			log.warn("FileAppender not initialized!!", e);
		}

		return log;
	}
}
