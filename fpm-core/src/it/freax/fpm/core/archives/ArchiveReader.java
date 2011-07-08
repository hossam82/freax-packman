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
import java.util.Properties;

public abstract class ArchiveReader extends Constants
{
	private FileInputStream fis;
	protected File file;
	protected ArrayList<String> entries;
	protected HashMap<String, String> filecontents;
	protected String type;
	protected boolean hasRead;

	protected ArchiveReader(File file) throws IOException
	{
		this.file = file;
		fis = new FileInputStream(this.file);
		filecontents = new HashMap<String, String>();
		hasRead = false;
		setEntryArrayList();
	}

	public File getFile()
	{
		return file;
	}

	public String getType()
	{
		return type;
	}

	public ArrayList<String> getEntries()
	{
		return entries;
	}

	public HashMap<String, String> getFilesContents()
	{
		return filecontents;
	}

	public String getEntryContent(String entryName)
	{
		return filecontents.get(entryName);
	}

	public boolean hasRead()
	{
		return hasRead;
	}

	public void setHasRead(boolean hasRead)
	{
		this.hasRead = hasRead;
	}

	protected FileInputStream openStream() throws FileNotFoundException
	{
		if (fis == null)
		{
			fis = new FileInputStream(file);
		}
		else
		{
			closeStream();
			fis = openStream();
		}
		return fis;
	}

	protected void closeStream()
	{
		try
		{
			fis.close();
		}
		catch (IOException e)
		{
		}
		fis = null;
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
	public static ArchiveReader getRightInstance(File file) throws ArchiveNotSupportedException, IOException
	{
		String type = ArchiveReader.getArchiveType(file);
		if (type == "Unsupported") { throw new ArchiveNotSupportedException(); }
		ArchiveReader instance;
		try
		{
			instance = Generics.getOne(ArchiveReader.class).getChildInstance(type, file);
		}
		catch (Throwable e1)
		{
			throw new ArchiveNotSupportedException();
		}
		return instance;
	}

	private static String getArchiveType(File file) throws IOException
	{
		Constants consts = Constants.getOne();
		String ret = "Unsupported";
		FileInputStream input = new FileInputStream(file);
		String type = String.format("%h%h", input.read(), input.read());
		String archives_conf = consts.getFullConfPath() + consts.getArchivesConf();
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
	public abstract ArrayList<String> readEntries(String entryName, boolean excludeRoot, String root) throws IOException;

	/**
	 * Questo metodo permette di leggere tutti i file di testo
	 * all'interno di un archivio senza scompattarlo.
	 * 
	 * @return Un HashMap contenente coppie che hanno come chiave il nome
	 *         del file completo di percorso, e come valore il suo contenuto.
	 */
	public HashMap<String, String> readEntries() throws IOException
	{
		if (!hasRead)
		{
			readEntriesContent();
			hasRead = true;
		}
		return filecontents;
	}

	/**
	 * Questo metodo permette di leggere tutti i file di testo
	 * all'interno di un archivio senza scompattarlo.
	 * I contenuti vengono via via inseriti nell'attributo filecontents
	 */
	protected abstract void readEntriesContent() throws IOException;

	/**
	 * Questo metodo permette di contare le occorrenze di un file
	 * all'interno di un archivio senza scompattarlo.
	 * 
	 * @param entryName
	 * @return
	 * @throws IOException
	 */
	public abstract int countEntries(String entryName) throws IOException;

	/**
	 * Questo metodo si occupa di popolare il vettore di elementi contenuti
	 * nell'archivio che viene letto dalla classe che eredita da questa.
	 * Si dovrebbe popolare con delle stringhe contenenti i nomi dei file
	 * con il percorso relativo completo in maniera ricorsiva semplice.
	 * Un esempio di vettore da 4 elementi è:
	 * [somefile.c],
	 * [otherfile.c],
	 * [header/somefile.h],
	 * [header/otherfile.h]
	 * 
	 * @throws IOException
	 */
	protected abstract void setEntryArrayList() throws IOException;
}
