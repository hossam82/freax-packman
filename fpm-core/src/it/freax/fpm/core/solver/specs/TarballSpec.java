package it.freax.fpm.core.solver.specs;

import it.freax.fpm.core.archives.ArchiveReader;
import it.freax.fpm.core.exceptions.ArchiveNotSupportedException;
import it.freax.fpm.core.solver.core.SourceDiscoverer;
import it.freax.fpm.core.solver.dto.PackageInfos;
import it.freax.fpm.core.types.ArchiveType;

import java.io.File;
import java.io.IOException;

public class TarballSpec extends Spec
{
	private ArchiveType ArchType;
	private PackageInfos pakInfo;

	public TarballSpec(PackageInfos pakInfo)
	{
		this.pakInfo = pakInfo;
	}

	public ArchiveType getArchType()
	{
		if (this.ArchType == null)
		{
			this.ArchType = ArchiveType.Unsupported;
		}
		return this.ArchType;
	}

	@Override
	public void Load(File tarball)
	{
		this.File = tarball;
		ArchiveReader reader;
		if (this.pakInfo == null)
		{
			try
			{
				reader = ArchiveReader.getRightInstance(tarball);
				this.ArchType = reader.getType();
				SourceDiscoverer srcdsx = new SourceDiscoverer(reader);
				this.pakInfo = srcdsx.discover();
			}
			catch (ArchiveNotSupportedException e)
			{
				this.ArchType = ArchiveType.Unsupported;
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("TarballSpec:\n- ArchType --> ");
		builder.append(this.ArchType);
		builder.append("\n- pakInfo --> ");
		builder.append(this.pakInfo);
		builder.append("\n- File --> ");
		builder.append(this.File);
		builder.append("\n- Package --> ");
		builder.append(this.Package);
		builder.append("\n- Scripts --> ");
		builder.append(this.Scripts);
		builder.append("\n- ChangeLog --> ");
		builder.append(this.ChangeLog);
		builder.append("\n- Provides --> ");
		builder.append(this.Provides);
		builder.append("\n- Requires --> ");
		builder.append(this.Requires);
		builder.append("\n- ConfigFiles --> ");
		builder.append(this.ConfigFiles);
		builder.append("\n- DocFiles --> ");
		builder.append(this.DocFiles);
		return builder.toString();
	}
}
