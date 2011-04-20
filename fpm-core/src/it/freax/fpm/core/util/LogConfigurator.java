package it.freax.fpm.core.util;

import java.io.IOException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LogConfigurator
{
	public static Logger configure(Class<?> clazz)
	{
		Logger log = Logger.getLogger(clazz);
		String logPath = System.getProperty("user.dir");
		if (!logPath.endsWith(System.getProperty("file.separator")))
		{
			logPath = logPath + System.getProperty("file.separator");
		}
		logPath = logPath + "fpm-install.log";
		String pattern = "%r [%t] %-5p %c - %m%n";
		PatternLayout layout = new PatternLayout(pattern);
		ConsoleAppender consapp = new ConsoleAppender(layout);
		consapp.setTarget("System.out");
		log.setLevel(Level.ALL);
		log.addAppender(consapp);
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
