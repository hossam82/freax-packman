package it.freax.fpm.core.util;

import java.io.IOException;

import org.apache.log4j.*;

public class LogConfigurator
{
	public static Logger configure(Class<?> clazz)
	{
		return configure(clazz, true);
	}

	public static Logger configure(Class<?> clazz, boolean logToConsole)
	{
		Logger log = Logger.getLogger(clazz);
		String logPath = System.getProperty("user.dir");
		if (!logPath.endsWith(System.getProperty("file.separator")))
		{
			logPath = logPath + System.getProperty("file.separator");
		}
		logPath = logPath + "fpm-install.log";
		String pattern = "%-8r [%t] %-5p %c - %m%n";
		PatternLayout layout = new PatternLayout(pattern);
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
