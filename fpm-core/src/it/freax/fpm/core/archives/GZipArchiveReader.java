package it.freax.fpm.core.archives;

import it.freax.fpm.util.Streams;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;

public class GZipArchiveReader extends ArchiveReader {
	private String type;

	public GZipArchiveReader(File file) throws IOException {
		super(file);
		this.type = "GZip";
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	protected void setEntryArrayList() throws IOException {
		TarArchiveInputStream tarin = new TarArchiveInputStream(
				new GzipCompressorInputStream(this.openStream()));
		List<String> entries = this.getEntries();
		TarArchiveEntry entry = null;
		while ((entry = tarin.getNextTarEntry()) != null)
			entries.add(entry.getName());

		tarin.close();
		this.closeStream();
	}

	@Override
	public String readEntry(String entryName) throws IOException {
		String lines = "";
		TarArchiveInputStream tarin = new TarArchiveInputStream(
				new GzipCompressorInputStream(this.openStream()));
		TarArchiveEntry entry = null;
		while ((entry = tarin.getNextTarEntry()) != null)
			if (entry.getName().contains(entryName)) {
				byte[] buf = new byte[(int) entry.getSize()];
				tarin.read(buf, 0, (int) entry.getSize());
				ByteArrayInputStream bais = new ByteArrayInputStream(buf);
				lines = Streams.getOne(bais).read();
				break;
			}
		tarin.close();
		this.closeStream();
		return lines;
	}

	@Override
	public int countEntries(String entryName) throws IOException {
		int counter = 0;
		TarArchiveInputStream tarin = new TarArchiveInputStream(
				new GzipCompressorInputStream(this.openStream()));
		TarArchiveEntry entry = null;
		while ((entry = tarin.getNextTarEntry()) != null)
			if (entry.getName().contains(entryName))
				counter++;
		tarin.close();
		this.closeStream();
		return counter;
	}

	@Override
	public List<String> readEntries(String entryName, boolean excludeRoot,
			String root) throws IOException {
		List<String> ret = new ArrayList<String>();
		TarArchiveInputStream tarin = new TarArchiveInputStream(
				new GzipCompressorInputStream(this.openStream()));
		TarArchiveEntry entry = null;
		boolean isRoot = excludeRoot;
		while ((entry = tarin.getNextTarEntry()) != null) {
			if (excludeRoot)
				isRoot = entry.getName().equalsIgnoreCase(
						root.concat(entryName));

			if (entry.getName().contains(entryName) && !isRoot)
				ret.add(entry.getName());
		}
		tarin.close();
		this.closeStream();
		return ret;
	}

	@Override
	protected void readEntriesContent() throws IOException {
		if (!this.hasRead()) {
			TarArchiveInputStream tarin = new TarArchiveInputStream(
					new GzipCompressorInputStream(this.openStream()));
			TarArchiveEntry entry = null;
			Map<String, String> filecontents = this.getFilesContents();

			while ((entry = tarin.getNextTarEntry()) != null) {
				byte[] buf = new byte[(int) entry.getSize()];
				tarin.read(buf, 0, (int) entry.getSize());
				ByteArrayInputStream bais = new ByteArrayInputStream(buf);
				filecontents.put(entry.getName(), Streams.getOne(bais).read());
			}
			tarin.close();
			this.closeStream();
		}
	}

	@Override
	public int compareTo(ArchiveReader arg0) {
		return this.getFile().compareTo(arg0.getFile());
	}
}
