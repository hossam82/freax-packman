package it.freax.fpm.core.archives;

import it.freax.fpm.util.Constants;
import it.freax.fpm.util.Generics;
import it.freax.fpm.util.Streams;
import it.freax.fpm.util.exceptions.ArchiveNotSupportedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public abstract class ArchiveReader implements Comparable<ArchiveReader> {
	private FileInputStream fis;
	private File file;
	private List<String> entries;
	private Map<String, String> filecontents;
	private boolean hasRead;

	public ArchiveReader(File file) throws IOException {
		this.file = file;
		this.fis = new FileInputStream(this.file);
		this.entries = new ArrayList<String>();
		this.filecontents = new HashMap<String, String>();
		this.hasRead = false;
		this.setEntryArrayList();
	}

	public File getFile() {
		return this.file;
	}

	public abstract String getType();

	public List<String> getEntries() {
		return this.entries;
	}

	public Map<String, String> getFilesContents() {
		return this.filecontents;
	}

	public String getEntryContent(String entryName) {
		return this.filecontents.get(entryName);
	}

	public boolean hasRead() {
		return this.hasRead;
	}

	public void setHasRead(boolean hasRead) {
		this.hasRead = hasRead;
	}

	protected FileInputStream openStream() throws FileNotFoundException {
		if (this.fis == null)
			this.fis = new FileInputStream(this.file);
		else {
			this.closeStream();
			this.fis = this.openStream();
		}
		return this.fis;
	}

	protected void closeStream() {
		try {
			this.fis.close();
		} catch (IOException e) {
		}
		this.fis = null;
	}

	/**
	 * Questo metodo si occupa di istanziare un oggetto archive reader tipizzato
	 * dal tipo di archivio passato in input.
	 * 
	 * @param type
	 *            il tipo di archivio
	 * @return un'istanza di un oggetto che eredita da ArchiveReader
	 * @throws ArchiveNotSupportedException
	 */
	public static ArchiveReader getRightInstance(File file)
			throws ArchiveNotSupportedException, IOException {
		String type = ArchiveReader.getArchiveType(file);
		if (type == "Unsupported")
			throw new ArchiveNotSupportedException();
		ArchiveReader instance;
		try {
			instance = Generics.getOne(ArchiveReader.class).getChildInstance(
					type, file);
		} catch (Throwable e1) {
			throw new ArchiveNotSupportedException();
		}
		return instance;
	}

	private static String getArchiveType(File file) throws IOException {
		Constants consts = Constants.getOne();
		String ret = "Unsupported";
		FileInputStream input = new FileInputStream(file);
		String type = String.format("%h%h", input.read(), input.read());
		String archives_conf = consts.getFullConfPath()
				+ consts.getArchivesConf();
		Properties properties = Streams.getOne(archives_conf).getProperties();
		ret = properties.getProperty(type);
		input.close();
		return ret;
	}

	/**
	 * Questo metodo permette di leggere un file di testo all'interno di un
	 * archivio senza scompattarlo.
	 * 
	 * @param entryName
	 * @return
	 * @throws IOException
	 */
	public abstract String readEntry(String entryName) throws IOException;

	/**
	 * Questo metodo permette di leggere tutti i file di testo con lo stesso
	 * nome, opzionalmente escludendo la root, all'interno di un archivio senza
	 * scompattarlo.
	 * 
	 * @param entryName
	 * @return
	 * @throws IOException
	 */
	public abstract List<String> readEntries(String entryName,
			boolean excludeRoot, String root) throws IOException;

	/**
	 * Questo metodo permette di leggere tutti i file di testo all'interno di un
	 * archivio senza scompattarlo.
	 * 
	 * @return Un HashMap contenente coppie che hanno come chiave il nome del
	 *         file completo di percorso, e come valore il suo contenuto.
	 */
	public Map<String, String> readEntries() throws IOException {
		if (!this.hasRead) {
			this.readEntriesContent();
			this.hasRead = true;
		}
		return this.filecontents;
	}

	/**
	 * Questo metodo permette di leggere tutti i file di testo all'interno di un
	 * archivio senza scompattarlo. I contenuti vengono via via inseriti
	 * nell'attributo filecontents
	 */
	protected abstract void readEntriesContent() throws IOException;

	/**
	 * Questo metodo permette di contare le occorrenze di un file all'interno di
	 * un archivio senza scompattarlo.
	 * 
	 * @param entryName
	 * @return
	 * @throws IOException
	 */
	public abstract int countEntries(String entryName) throws IOException;

	/**
	 * Questo metodo si occupa di popolare il vettore di elementi contenuti
	 * nell'archivio che viene letto dalla classe che eredita da questa. Si
	 * dovrebbe popolare con delle stringhe contenenti i nomi dei file con il
	 * percorso relativo completo in maniera ricorsiva semplice. Un esempio di
	 * vettore da 4 elementi è: [somefile.c], [otherfile.c],
	 * [header/somefile.h], [header/otherfile.h]
	 * 
	 * @throws IOException
	 */
	protected abstract void setEntryArrayList() throws IOException;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (this.file == null ? 0 : this.file.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ArchiveReader))
			return false;
		ArchiveReader other = (ArchiveReader) obj;
		if (this.file == null) {
			if (other.file != null)
				return false;
		} else if (!this.file.equals(other.file))
			return false;
		return true;
	}
}
