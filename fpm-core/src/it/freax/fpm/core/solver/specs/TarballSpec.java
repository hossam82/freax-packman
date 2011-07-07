package it.freax.fpm.core.solver.specs;

import it.freax.fpm.core.archives.ArchiveReader;
import it.freax.fpm.core.solver.core.SourceDiscoverer;
import it.freax.fpm.util.ErrorHandler;
import it.freax.fpm.util.exceptions.ArchiveNotSupportedException;
import it.freax.fpm.util.exceptions.ConfigurationReadException;

import java.io.File;
import java.io.IOException;

public class TarballSpec extends Spec
{
	private String ArchType;

	public TarballSpec(Spec spec)
	{
		if (spec != null)
		{
			map(spec);
		}
	}

	public void setPackageName(String packageName)
	{
		Package.setPackageName(packageName);
	}

	public void setVersion(String version)
	{
		Package.setVersion(version);
	}

	public void setPackage(String packageName, String packageVersion)
	{
		Package.setPackageName(packageName);
		Package.setVersion(packageVersion);
	}

	public void setScripts(String Scripts)
	{
		this.Scripts = Scripts;
	}

	public void setChangeLog(String ChangeLog)
	{
		this.ChangeLog = ChangeLog;
	}

	public void addDocFile(String docName, String docContent)
	{
		DocFiles.put(docName, docContent);
	}

	public String getArchType()
	{
		if ((ArchType == null) || ArchType.isEmpty())
		{
			ArchType = "Unsupported";
		}
		return ArchType;
	}

	@Override
	public void Load(File tarball)
	{
		File = tarball;
		if (!mapped)
		{
			ArchiveReader reader;
			try
			{
				reader = ArchiveReader.getRightInstance(tarball);
				ArchType = reader.getType();
				SourceDiscoverer srcdsx = new SourceDiscoverer(reader, this);
				srcdsx.discover();
			}
			catch (ArchiveNotSupportedException e)
			{
				ArchType = "Unsupported";
			}
			catch (IOException e)
			{
				ErrorHandler.getOne(getClass()).handle(e);
			}
			catch (ConfigurationReadException e)
			{
				ErrorHandler.getOne(getClass()).handle(e);
			}
		}
	}
}
