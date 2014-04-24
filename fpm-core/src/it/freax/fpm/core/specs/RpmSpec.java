package it.freax.fpm.core.specs;

import it.freax.fpm.util.ErrorHandler;
import it.freax.fpm.util.LogConfigurator;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.log4j.Logger;
import org.freecompany.redline.ReadableChannelWrapper;
import org.freecompany.redline.Scanner;
import org.freecompany.redline.header.Format;
import org.freecompany.redline.header.Header;
import org.freecompany.redline.payload.CpioHeader;

public class RpmSpec extends Spec
{
	private static final Logger log = LogConfigurator.getOne(RpmSpec.class).configure(true);
	protected String PackageName;
	protected String OS;
	protected String Architecture;

	public RpmSpec(Spec spec)
	{
		super(spec);
	}

	public String getArchitecture()
	{
		return Architecture;
	}

	public String getOS()
	{
		return OS;
	}

	public String getPackageName()
	{
		return PackageName;
	}

	@Override
	public void Load(File file)
	{
		try
		{
			ReadableByteChannel channel = Channels.newChannel(new FileInputStream(file));
			ReadableChannelWrapper in = new ReadableChannelWrapper(channel);
			Format format = new Scanner().run(in);
			log.debug(format);
			InputStream uncompressed = new BZip2CompressorInputStream(new FileInputStream(file));
			in = new ReadableChannelWrapper(Channels.newChannel(uncompressed));
			CpioHeader header;
			int total = 0;
			do
			{
				header = new CpioHeader();
				total = header.read(in, total);
				log.debug(header);
				Header rpmheader = new Header();
				rpmheader.read(in);
				log.debug(rpmheader);
				log.debug(rpmheader.getEntry(Header.HeaderTag.NAME));
				final int skip = header.getFileSize();
				if (uncompressed.skip(skip) != skip) { throw new RuntimeException("Skip failed."); }
				total += header.getFileSize();
			}
			while (!header.isLast());
		}
		catch (Exception e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
		}
	}

	@Override
	public String toString()
	{
		// TODO toString
		return null;
	}

}
