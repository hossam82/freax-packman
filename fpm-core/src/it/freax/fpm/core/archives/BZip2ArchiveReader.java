package it.freax.fpm.core.archives;

import it.freax.fpm.core.util.Streams;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

public class BZip2ArchiveReader extends ArchiveReader
{

	public BZip2ArchiveReader(File file) throws IOException
	{
		super(file);
		type = "BZip2";
	}

	@Override
	protected void setEntryArrayList() throws IOException
	{
		entries = new ArrayList<String>();
		TarArchiveInputStream tarin = new TarArchiveInputStream(new BZip2CompressorInputStream(openStream()));
		TarArchiveEntry entry = null;
		while ((entry = tarin.getNextTarEntry()) != null)
		{
			entries.add(entry.getName());
		}
		tarin.close();
		closeStream();
	}

	@Override
	public String readEntry(String entryName) throws IOException
	{
		String lines = "";
		TarArchiveInputStream tarin = new TarArchiveInputStream(new BZip2CompressorInputStream(openStream()));
		TarArchiveEntry entry = null;
		while ((entry = tarin.getNextTarEntry()) != null)
		{
			if (entry.getName().contains(entryName))
			{
				byte[] buf = new byte[(int) entry.getSize()];
				tarin.read(buf, 0, (int) entry.getSize());
				ByteArrayInputStream bais = new ByteArrayInputStream(buf);
				lines = Streams.getOne(bais).read();
				break;
			}
		}
		tarin.close();
		closeStream();
		return lines;
	}

	@Override
	public int countEntries(String entryName) throws IOException
	{
		int counter = 0;
		TarArchiveInputStream tarin = new TarArchiveInputStream(new BZip2CompressorInputStream(openStream()));
		TarArchiveEntry entry = null;
		while ((entry = tarin.getNextTarEntry()) != null)
		{
			if (entry.getName().contains(entryName))
			{
				counter++;
			}
		}
		tarin.close();
		closeStream();
		return counter;
	}

	@Override
	public ArrayList<String> readEntries(String entryName, boolean excludeRoot, String root) throws IOException
	{
		ArrayList<String> ret = new ArrayList<String>();
		TarArchiveInputStream tarin = new TarArchiveInputStream(new BZip2CompressorInputStream(openStream()));
		TarArchiveEntry entry = null;
		boolean isRoot = excludeRoot;
		while ((entry = tarin.getNextTarEntry()) != null)
		{
			if (excludeRoot)
			{
				isRoot = entry.getName().equalsIgnoreCase(root.concat(entryName));
			}

			if (entry.getName().contains(entryName) && !isRoot)
			{
				ret.add(entry.getName());
			}
		}
		tarin.close();
		closeStream();
		return ret;
	}

	@Override
	protected void readEntriesContent() throws IOException
	{
		TarArchiveInputStream tarin = new TarArchiveInputStream(new BZip2CompressorInputStream(openStream()));
		TarArchiveEntry entry = null;
		while ((entry = tarin.getNextTarEntry()) != null)
		{
			byte[] buf = new byte[(int) entry.getSize()];
			tarin.read(buf, 0, (int) entry.getSize());
			ByteArrayInputStream bais = new ByteArrayInputStream(buf);
			filecontents.put(entry.getName(), Streams.getOne(bais).read());
		}
		tarin.close();
		closeStream();
	}
}
