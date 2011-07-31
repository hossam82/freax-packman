package it.freax.fpm.util;

import it.freax.fpm.util.exceptions.ConfigurationReadException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public final class Constants
{
	public static final String USER_HOME = System.getProperty("user.home");
	public static final String FS = System.getProperty("file.separator");
	public static final String CONST_FILE = "constants.properties";
	public static final String REL_P = "${REL}";
	/**
	 * Token that acts as a place holder for the previous path in the path
	 */
	public static final String PREV_P = "${PREV}";
	public static final String SEP_P = ":";
	public static final String CONF_PATHS = REL_P + "/conf/" + SEP_P + USER_HOME + "/.fpm/" + SEP_P + PREV_P + "/conf/" + SEP_P + "/etc/fpm/";

	private static Constants singleton = null;
	private static boolean hasLoaded = false;

	private String workPath = USER_HOME;
	private String confdir = "conf";
	private String logdir = "logs";
	private String archives_conf = "Archives.conf";
	private String sourcediscoverconf = "source-detect.xml";
	private String logfile = "fpm-install.log";
	private String pattern = "%-8r [%t] %-5p %c - %m%n";

	public static Constants getOne()
	{
		if (!hasLoaded && (singleton == null))
		{
			Scanner sc = new Scanner(CONF_PATHS).useDelimiter(SEP_P);
			String prev = "";
			while (sc.hasNext() && !hasLoaded)
			{
				singleton = new Constants();
				boolean relative = false;
				String path = sc.next();
				if (path.startsWith(PREV_P))
				{
					path = path.replace(PREV_P, prev.substring(0, prev.length() - 1));
				}
				else if (path.startsWith(REL_P))
				{
					path = path.replace(REL_P + "/", "");
					relative = true;
				}
				else if (path.contains("~"))
				{
					path = path.replace("~", USER_HOME);
				}
				prev = path;

				path = path.concat(CONST_FILE);

				try
				{
					InputStream is = null;
					if (relative)
					{
						is = ClassLoader.getSystemResourceAsStream(path);
					}
					else
					{
						is = new FileInputStream(path);
					}

					Properties props = new Properties();
					props.load(is);
					String prop;

					prop = props.getProperty("workPath");
					if ((prop != null) && !prop.isEmpty())
					{
						singleton.setWorkPath(prop);
					}
					else
					{
						throw new ConfigurationReadException();
					}

					prop = props.getProperty("confdir");
					if ((prop != null) && !prop.isEmpty())
					{
						singleton.setConfdir(prop);
					}
					else
					{
						throw new ConfigurationReadException();
					}

					prop = props.getProperty("logdir");
					if ((prop != null) && !prop.isEmpty())
					{
						singleton.setLogDir(prop);
					}
					else
					{
						throw new ConfigurationReadException();
					}

					prop = props.getProperty("archives_conf");
					if ((prop != null) && !prop.isEmpty())
					{
						singleton.setArchivesConf(prop);
					}
					else
					{
						throw new ConfigurationReadException();
					}

					prop = props.getProperty("sourcediscoverconf");
					if ((prop != null) && !prop.isEmpty())
					{
						singleton.setSourceDiscoverConf(prop);
					}
					else
					{
						throw new ConfigurationReadException();
					}

					prop = props.getProperty("logfile");
					if ((prop != null) && !prop.isEmpty())
					{
						singleton.setLogFile(prop);
					}
					else
					{
						throw new ConfigurationReadException();
					}

					prop = props.getProperty("pattern");
					if ((prop != null) && !prop.isEmpty())
					{
						singleton.setPattern(prop);
					}
					else
					{
						throw new ConfigurationReadException();
					}

					hasLoaded = true;
				}
				catch (Throwable e)
				{
					singleton = null;
					hasLoaded = false;
				}
			}
		}
		return singleton;
	}

	public static Constants getOneReset()
	{
		hasLoaded = false;
		singleton = null;
		return getOne();
	}

	public String getFullConfPath()
	{
		String ret = "";
		String paths = "";
		String prev = "";
		String fpm_conf_paths = System.getenv("FPM_CONF_PATHS");
		if (Strings.getOne().isNullOrEmpty(fpm_conf_paths))
		{
			paths = CONF_PATHS;
		}
		else
		{
			paths = fpm_conf_paths;
		}

		boolean found = false;
		Scanner sc = new Scanner(paths).useDelimiter(SEP_P);
		while (sc.hasNext() && !found)
		{
			boolean relative = false;
			String path = sc.next();
			if (path.startsWith(PREV_P))
			{
				path = path.replace(PREV_P, prev.substring(0, prev.length() - 1));
			}
			else if (path.startsWith(REL_P))
			{
				path = path.replace(REL_P + FS, "");
				relative = true;
			}
			else if (path.contains("~"))
			{
				path = path.replace("~", USER_HOME);
			}
			prev = path;

			path = path.concat(CONST_FILE);

			try
			{
				if (relative)
				{
					ClassLoader.getSystemResourceAsStream(path);
				}
				else
				{
					new FileInputStream(path);
				}
				ret = prev;
				found = true;
			}
			catch (FileNotFoundException fnfe)
			{
			}
		}
		return ret;
	}

	public String getConfdir()
	{
		return confdir;
	}

	public void setConfdir(String confdir)
	{
		this.confdir = confdir;
	}

	public String getArchivesConf()
	{
		return archives_conf;
	}

	public void setArchivesConf(String archives_conf)
	{
		this.archives_conf = archives_conf;
	}

	public String getSourceDiscoverConf()
	{
		return sourcediscoverconf;
	}

	public void setSourceDiscoverConf(String sourcediscoverconf)
	{
		this.sourcediscoverconf = sourcediscoverconf;
	}

	public String getLogFile()
	{
		return logfile;
	}

	public void setLogFile(String logfile)
	{
		this.logfile = logfile;
	}

	public String getPattern()
	{
		return pattern;
	}

	public void setPattern(String pattern)
	{
		this.pattern = pattern;
	}

	public void setLogDir(String logdir)
	{
		this.logdir = logdir;
	}

	public String getLogDir()
	{
		return logdir;
	}

	public void setWorkPath(String workPath)
	{
		this.workPath = workPath;
	}

	public String getWorkPath()
	{
		return (workPath.contains("~") ? workPath.replace("~", USER_HOME) : workPath);
	}
}
