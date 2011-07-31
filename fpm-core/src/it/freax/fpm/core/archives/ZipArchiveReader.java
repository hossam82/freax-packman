package it.freax.fpm.core.archives;

import it.freax.fpm.util.Streams;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipArchiveReader extends ArchiveReader {
	private String type;

	public ZipArchiveReader(File file) throws IOException {
		super(file);
		this.type = "Zip";
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	protected void setEntryArrayList() throws IOException {
		ZipInputStream in = new ZipInputStream(this.openStream());
		List<String> entries = this.getEntries();
		ZipEntry entry = null;
		while ((entry = in.getNextEntry()) != null)
			entries.add(entry.getName());
		in.close();
		this.closeStream();
	}

	@Override
	public String readEntry(String entryName) throws IOException {
		String lines = "";
		ZipInputStream in = new ZipInputStream(this.openStream());
		ZipEntry entry = null;
		while ((entry = in.getNextEntry()) != null)
			if (entry.getName().contains(entryName)) {
				byte[] buf = new byte[(int) entry.getSize()];
				in.read(buf, 0, (int) entry.getSize());
				ByteArrayInputStream bais = new ByteArrayInputStream(buf);
				lines = Streams.getOne(bais).read();
				break;
			}
		in.close();
		this.closeStream();
		return lines;
	}

	@Override
	public int countEntries(String entryName) throws IOException {
		int counter = 0;
		ZipInputStream in = new ZipInputStream(this.openStream());
		ZipEntry entry = null;
		while ((entry = in.getNextEntry()) != null)
			if (entry.getName().contains(entryName))
				counter++;
		in.close();
		this.closeStream();
		return counter;
	}

	@Override
	public List<String> readEntries(String entryName, boolean excludeRoot,
			String root) throws IOException {
		List<String> ret = new ArrayList<String>();
		ZipInputStream in = new ZipInputStream(this.openStream());
		ZipEntry entry = null;
		boolean isRoot = excludeRoot;
		while ((entry = in.getNextEntry()) != null) {
			if (excludeRoot)
				isRoot = entry.getName().equalsIgnoreCase(
						root.concat(entryName));

			if (entry.getName().contains(entryName) && !isRoot)
				ret.add(entry.getName());
		}
		in.close();
		this.closeStream();
		return ret;
	}

	@Override
	protected void readEntriesContent() throws IOException {
		ZipInputStream in = new ZipInputStream(this.openStream());
		ZipEntry entry = null;
		Map<String, String> filecontents = this.getFilesContents();

		while ((entry = in.getNextEntry()) != null) {
			byte[] buf = new byte[(int) entry.getSize()];
			in.read(buf, 0, (int) entry.getSize());
			ByteArrayInputStream bais = new ByteArrayInputStream(buf);
			filecontents.put(entry.getName(), Streams.getOne(bais).read());
		}
		in.close();
		this.closeStream();
	}

	@Override
	public int compareTo(ArchiveReader arg0) {
		return this.getFile().compareTo(arg0.getFile());
	}

}
