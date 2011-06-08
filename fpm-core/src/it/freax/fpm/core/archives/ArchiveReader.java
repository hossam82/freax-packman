package it.freax.fpm.core.archives;

import it.freax.fpm.core.exceptions.ArchiveNotSupportedException;
import it.freax.fpm.core.types.ArchiveType;
import it.freax.fpm.core.util.Constants;
import it.freax.fpm.core.util.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Vector;

public abstract class ArchiveReader extends Constants
{
	private FileInputStream fis;
	protected File file;
	protected Vector<String> entries;
	protected HashMap<String, String> filecontents;
	protected ArchiveType type;
	protected boolean hasRead;

	protected ArchiveReader(File file) throws IOException
	{
		this.file = file;
		fis = new FileInputStream(this.file);
		filecontents = new HashMap<String, String>();
		hasRead = false;
		setEntryVector();
	}

	public File getFile()
	{
		return file;
	}

	public ArchiveType getType()
	{
		return type;
	}

	public Vector<String> getEntries()
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

	protected FileInputStream openStream()
	{
		if (fis == null)
		{
			try
			{
				fis = new FileInputStream(file);
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
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
	public static ArchiveReader getRightInstance(File file) throws ArchiveNotSupportedException
	{
		ArchiveReader ret = null;
		try
		{
			ArchiveType type = null;
			type = ArchiveReader.getArchiveType(file);
			if (type == ArchiveType.Unsupported) { throw new ArchiveNotSupportedException("Formato dell'archivio non supportato!"); }
			String className = ArchiveReader.class.getPackage().getName() + "." + type.name() + ArchiveReader.class.getSimpleName();
			Class<?> c = Class.forName(className);
			Class<?>[] ctorParams = new Class[]
			{ File.class };
			ret = (ArchiveReader) c.getConstructor(ctorParams).newInstance(file);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SecurityException e)
		{
			e.printStackTrace();
		}
		catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch (InvocationTargetException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return ret;
	}

	private static ArchiveType getArchiveType(File file) throws IOException
	{
		ArchiveType ret = ArchiveType.Unsupported;
		FileInputStream input = new FileInputStream(file);
		String type = String.format("%h%h", input.read(), input.read());
		Properties properties = FileUtils.getProperties(getArchivesConf());
		ret = ArchiveType.valueOf(properties.getProperty(type));
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
	public abstract Vector<String> readEntries(String entryName, boolean excludeRoot, String root) throws IOException;

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
	protected abstract void setEntryVector() throws IOException;
}
