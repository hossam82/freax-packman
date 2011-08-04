package it.freax.fpm.util;

import java.io.IOException;

import org.apache.log4j.*;

public class LogConfigurator
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

	/**
	 * Configures the Logger (log4j) class used by the entire library to log
	 * what happens at run time. logToConsole is enabled by default, in this
	 * overload.
	 * 
	 * @return
	 */
	public Logger configure()
	{
		return configure(true);
	}

	/**
	 * Configures the Logger (log4j) class used by the entire library to log
	 * what happens at run time.
	 * 
	 * @param logToConsole
	 *            determines if log4j engine should log to the standard output
	 *            or not.
	 * @return a Logger class used to log events and functional meanings of the
	 *         application.
	 */
	public Logger configure(boolean logToConsole)
	{
		Constants c = Constants.getOne();
		Logger log = Logger.getLogger(clazz);
		String logPath = c.getConstant("log.dir") + c.getConstant("log.file");
		PatternLayout layout = new PatternLayout(c.getConstant("log.pattern"));
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
		} catch (IOException e)
		{
			log.warn("FileAppender not initialized!!", e);
		}

		return log;
	}
}
