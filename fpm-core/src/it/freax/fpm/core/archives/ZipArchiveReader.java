package it.freax.fpm.core.archives;

import it.freax.fpm.core.types.ArchiveType;
import it.freax.fpm.core.util.FileUtils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipArchiveReader extends ArchiveReader
{

	public ZipArchiveReader(File file) throws IOException
	{
		super(file);
		this.type = ArchiveType.Zip;
	}

	@Override
	protected void setEntryVector() throws IOException
	{
		ZipInputStream in = new ZipInputStream(this.openStream());
		this.entries = new Vector<String>();
		ZipEntry entry = null;
		while ((entry = in.getNextEntry()) != null)
		{
			this.entries.add(entry.getName());
		}
		in.close();
		this.closeStream();
	}

	@Override
	public String readEntry(String entryName) throws IOException
	{
		String lines = "";
		ZipInputStream in = new ZipInputStream(this.openStream());
		ZipEntry entry = null;
		while ((entry = in.getNextEntry()) != null)
		{
			if (entry.getName().contains(entryName))
			{
				byte[] buf = new byte[(int) entry.getSize()];
				in.read(buf, 0, (int) entry.getSize());
				ByteArrayInputStream bais = new ByteArrayInputStream(buf);
				lines = FileUtils.read(bais);
				break;
			}
		}
		in.close();
		this.closeStream();
		return lines;
	}

	@Override
	public int countEntries(String entryName) throws IOException
	{
		int counter = 0;
		ZipInputStream in = new ZipInputStream(this.openStream());
		ZipEntry entry = null;
		while ((entry = in.getNextEntry()) != null)
		{
			if (entry.getName().contains(entryName))
			{
				counter++;
			}
		}
		in.close();
		this.closeStream();
		return counter;
	}

	@Override
	public Vector<String> readEntries(String entryName, boolean excludeRoot, String root) throws IOException
	{
		Vector<String> ret = new Vector<String>();
		ZipInputStream in = new ZipInputStream(this.openStream());
		ZipEntry entry = null;
		boolean isRoot = excludeRoot;
		while ((entry = in.getNextEntry()) != null)
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
		in.close();
		this.closeStream();
		return ret;
	}

	@Override
	public HashMap<String, String> readEntries() throws IOException
	{
		ZipInputStream in = new ZipInputStream(this.openStream());
		ZipEntry entry = null;
		while ((entry = in.getNextEntry()) != null)
		{
			byte[] buf = new byte[(int) entry.getSize()];
			in.read(buf, 0, (int) entry.getSize());
			ByteArrayInputStream bais = new ByteArrayInputStream(buf);
			this.filecontents.put(entry.getName(), FileUtils.read(bais));
		}
		in.close();
		this.closeStream();
		return this.filecontents;
	}
}
