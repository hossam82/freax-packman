package it.freax.fpm.core.util;

public abstract class Constants
{
	public static final int rangeExtMin = 1;
	public static final int rangeExtMax = 4;
	public static final String extSeparator = ".";

	private boolean systemResource = true;
	private String confdir = "conf";
	private String archives_conf = "Archives.conf";
	private String sourcediscoverconf = "source-detect.xml";
	private String logfile = "fpm-install.log";
	private String pattern = "%-8r [%t] %-5p %c - %m%n";

	public static Constants getOne()
	{
		return new Constants()
		{
		};
	}

	public String getDirPrefix()
	{
		String ret = "";
		if (!isSystemResource())
		{
			ret = System.getProperty("user.dir");
		}
		return ret;
	}

	public String getFullConfPath()
	{
		return Strings.getOne().concatPaths(getDirPrefix(), getConfdir());
	}

	public boolean isSystemResource()
	{
		return systemResource;
	}

	public void setSystemResource(boolean systemResource)
	{
		this.systemResource = systemResource;
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
}
