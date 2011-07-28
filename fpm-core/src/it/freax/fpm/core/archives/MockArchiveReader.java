package it.freax.fpm.core.archives;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MockArchiveReader extends ArchiveReader {

	protected MockArchiveReader(File file) throws IOException {
		super(file);
	}

	@Override
	public String readEntry(String entryName) throws IOException {
		return null;
	}

	@Override
	public ArrayList<String> readEntries(String entryName, boolean excludeRoot,
			String root) throws IOException {
		return null;
	}

	@Override
	protected void readEntriesContent() throws IOException {
		return;
	}

	@Override
	public int countEntries(String entryName) throws IOException {
		return 0;
	}

	@Override
	protected void setEntryArrayList() throws IOException {
		return;
	}

}
