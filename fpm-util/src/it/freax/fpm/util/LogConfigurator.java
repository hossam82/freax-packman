package it.freax.fpm.util;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

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
		Logger log = Logger.getLogger(clazz);
		boolean loadDefaults = false;
		String logPath = null;
		PatternLayout layout = null;
		Strings str = Strings.getOne();
		String logLevel = "", logConsoleLevel = "", logFileLevel = "";
		try
		{
			Constants c = Constants.getOneReset(clazz);
			Properties log4j = c.getLog4j();
			loadDefaults = log4j.isEmpty();
			if (!loadDefaults)
			{
				PropertyConfigurator.configure(log4j);
			}
			else
			{
				logLevel = c.getConstant("log.level");
				logConsoleLevel = c.getConstant("log.console.level");
				logFileLevel = c.getConstant("log.file.level");
				logPath = str.safeConcatPaths(c.getConstant("log.dir"), c.getConstant("log.file"));
				if (!str.checkPathExistence(logPath))
				{
					str.createPath(logPath);
					new File(logPath).createNewFile();
				}
				layout = new PatternLayout(c.getConstant("log.pattern"));
			}
		}
		catch (Throwable e)
		{
			logPath = str.safeConcatPaths(Constants.USER_HOME, "." + Constants.FPM_DIR);
			if (!str.checkPathExistence(logPath))
			{
				str.createPath(logPath);
			}
			logPath = str.safeConcatPaths(logPath, Constants.MAIN_LOG_FILE);
			layout = new PatternLayout(Constants.DEFAULT_LOG_PATTERN);
			loadDefaults = true;
		}

		if (loadDefaults)
		{
			log.setLevel(Level.toLevel(logLevel));

			if (logToConsole)
			{
				ConsoleAppender consapp = new ConsoleAppender(layout);
				consapp.setTarget("System.out");
				consapp.setThreshold(Level.toLevel(logConsoleLevel));
				log.addAppender(consapp);
			}

			FileAppender fileapp;
			try
			{
				fileapp = new FileAppender(layout, logPath);
				fileapp.setThreshold(Level.toLevel(logFileLevel));
				log.addAppender(fileapp);
			}
			catch (IOException e)
			{
				log.warn("FileAppender not initialized! ".concat(e.getMessage()));
			}
		}
		log.trace("Logger initialized!");
		return log;
	}
}
