package it.freax.fpm.core.archives;

import it.freax.fpm.core.exceptions.ArchiveNotSupportedException;
import it.freax.fpm.core.types.ArchiveType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Vector;

public abstract class ArchiveReader
{
	private FileInputStream fis;
	protected File file;
	protected Vector<String> entries;
	protected HashMap<String, String> filecontents;
	protected ArchiveType type;

	public ArchiveReader(File file) throws IOException
	{
		this.file = file;
		this.fis = new FileInputStream(this.file);
		this.filecontents = new HashMap<String, String>();
		this.setEntryVector();
	}

	public File getFile()
	{
		return this.file;
	}

	public ArchiveType getType()
	{
		return this.type;
	}

	public Vector<String> getEntries()
	{
		return this.entries;
	}

	public HashMap<String, String> getFilesContents()
	{
		return this.filecontents;
	}

	public String getEntryContent(String entryName)
	{
		return this.filecontents.get(entryName);
	}

	protected FileInputStream openStream()
	{
		if (this.fis == null)
		{
			try
			{
				this.fis = new FileInputStream(this.file);
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			this.closeStream();
			this.fis = this.openStream();
		}
		return this.fis;
	}

	protected void closeStream()
	{
		try
		{
			this.fis.close();
		}
		catch (IOException e)
		{
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
		int b1 = 0, b2 = 0;
		b1 = input.read();
		b2 = input.read();

		if ((b1 == 0x1f) && (b2 == 0x8b))
		{
			ret = ArchiveType.GZip;
		}
		else if ((b1 == 0x42) && (b2 == 0x5a))
		{
			ret = ArchiveType.BZip2;
		}
		else if ((b1 == 0x50) && (b2 == 0x4b))
		{
			ret = ArchiveType.Zip;
		}
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
	public abstract HashMap<String, String> readEntries() throws IOException;

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
