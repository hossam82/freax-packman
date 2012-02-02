package it.freax.fpm.core.archives;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MockArchiveReader extends ArchiveReader
{

	protected MockArchiveReader(File file) throws IOException
	{
		super(file);
	}

	@Override
	public String getType()
	{
		return null;
	}

	@Override
	public String readEntry(String entryName) throws IOException
	{
		return null;
	}

	@Override
	public List<String> readEntries(String entryName, boolean excludeRoot, String root) throws IOException
	{
		return null;
	}

	@Override
	protected void readEntriesContent() throws IOException
	{
		return;
	}

	@Override
	public int countEntries(String entryName) throws IOException
	{
		return 0;
	}

	@Override
	protected void setEntryArrayList() throws IOException
	{
		return;
	}

	@Override
	public int compareTo(ArchiveReader o)
	{
		return 0;
	}

}
