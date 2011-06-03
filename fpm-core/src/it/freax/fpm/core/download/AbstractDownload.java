package it.freax.fpm.core.download;

import java.io.File;
import java.net.URL;
import java.util.Observable;

/**
 * This class downloads a file from a URL.
 * 
 * @author kLeZ-hAcK
 * @version 0.1
 */
public abstract class AbstractDownload extends Observable implements Runnable
{
	public static final int CANCELLED = 3;
	public static final int COMPLETE = 2;
	public static final int DOWNLOADING = 0; // These are the status codes.
	public static final int ERROR = 4;
	// Max size of download buffer.
	protected static final int MAX_BUFFER_SIZE = 10 * 1024;
	public static final int PAUSED = 1;
	// These are the status names.
	public static final String[] STATUSES =
	{ "Downloading", "Paused", "Complete", "Cancelled", "Error" };

	public boolean debug = false;
	protected StringBuilder debugMessage; // message for debugging purposes
	protected long downloaded; // number of bytes downloaded
	// proxy (if necessary)
	protected String password; // a password for the account name
	protected String path; // path where to download the file
	protected int port; // proxy server listening port
	// calling the proxy I have to know
	// if the proxy server requires
	// authentication or not
	protected String proxyUrl; // address of the proxy server (IP or Hostname)
	protected long size; // size of download in bytes
	protected int status; // current status of download
	protected URL url; // download URL
	// calling the proxy server
	protected boolean useAuthentication; // this is necessary because when
	protected boolean useProxy; // this is necessary because of the check for

	protected String userName; // an account that is able to connect to the

	/**
	 * Constructor for AbstractDownload.
	 * 
	 * @param url
	 * @param path
	 */
	public AbstractDownload(URL url, String path)
	{
		this.url = url;
		this.path = path;
		size = -1;
		downloaded = 0;
		status = DOWNLOADING;
		debugMessage = new StringBuilder();
	}

	/**
	 * Constructor for AbstractDownload.
	 * 
	 * @param url
	 * @param path
	 * @param proxyUrl
	 * @param port
	 */
	public AbstractDownload(URL url, String path, String proxyUrl, int port)
	{
		this(url, path);
		useProxy = true;
		useAuthentication = false;
		this.proxyUrl = proxyUrl;
		this.port = port;
	}

	/**
	 * Constructor for AbstractDownload.
	 * 
	 * @param url
	 * @param path
	 * @param proxyUrl
	 * @param port
	 * @param userName
	 * @param password
	 */
	public AbstractDownload(URL url, String path, String proxyUrl, int port, String userName, String password)
	{
		this(url, path, proxyUrl, port);
		useAuthentication = true;
		this.userName = userName;
		this.password = password;
	}

	/**
	 * Cancel this download
	 */
	public void cancel()
	{
		status = CANCELLED;
		stateChanged();
	}

	/**
	 * Start or resume downloading
	 */
	protected void download()
	{
		Thread thread = new Thread(this);
		thread.start();
	}

	/**
	 * Mark this download as having an error
	 */
	protected void error()
	{
		status = ERROR;
		stateChanged();
	}

	/**
	 * Format debug messages
	 * 
	 * @return debug messages
	 */
	public String getDebugMessages()
	{
		return debugMessage.toString().trim();
	}

	/**
	 * Size of current dowloading
	 * 
	 * @return size
	 */
	public long getDownloaded()
	{
		return downloaded;
	}

	/**
	 * Get file name portion of URL
	 * 
	 * @param url
	 * @return name's file
	 */
	protected String getFileName(URL url)
	{
		String fileName = url.getFile();
		int endFileName = 0;

		if (fileName.lastIndexOf('?') > 0)
		{
			endFileName = fileName.lastIndexOf('?');
		}
		else if (fileName.lastIndexOf(';') > 0)
		{
			endFileName = fileName.lastIndexOf(';');
		}
		else
		{
			endFileName = fileName.length();
		}

		fileName = fileName.substring(fileName.lastIndexOf('/') + 1, endFileName);
		return fileName;
	}

	/**
	 * Get this download's progress.
	 * 
	 * @return value for progress bar
	 */
	public float getProgress()
	{
		return (float) downloaded / size * 100;
	}

	/**
	 * Get this download's size.
	 * 
	 * @return size
	 */
	public long getSize()
	{
		return size;
	}

	/**
	 * Get this download's status.
	 * 
	 * @return current status
	 */
	public int getStatus()
	{
		return status;
	}

	/**
	 * Get this download's URL.
	 * 
	 * @return url of this download
	 */
	public String getUrl()
	{
		return url.toString();
	}

	/**
	 * Pause this download.
	 */
	public void pause()
	{
		status = PAUSED;
		stateChanged();
	}

	/**
	 * Resume this download.
	 */
	public void resume()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(path);
		if (!path.endsWith(System.getProperty("file.separator")))
		{
			sb.append(System.getProperty("file.separator"));
		}
		sb.append(getFileName(url));

		File file = new File(sb.toString());
		if (file.exists())
		{
			downloaded = file.length();
		}

		status = DOWNLOADING;
		stateChanged();
		download();
	}

	/**
	 * Implements this method for downloading a file with a specific protocol.
	 */
	@Override
	public abstract void run();

	/**
	 * Sets the debug message used for error reporting and debug purpose. It
	 * don't append a line feed at the end of the line.
	 * 
	 * @param debugMessage
	 * @param append
	 */
	protected void setDebugMessage(String debugMessage, boolean append)
	{
		if (!append)
		{
			this.debugMessage.delete(0, this.debugMessage.length() - 1);
		}
		if (this.debugMessage.length() > 0)
		{
			if (this.debugMessage.charAt(this.debugMessage.length() - 1) != ' ')
			{
				this.debugMessage.append(' ');
			}
		}
		this.debugMessage.append(debugMessage);
	}

	/**
	 * Notify observers that this download's status has changed.
	 */
	protected void stateChanged()
	{
		setChanged();
		this.notifyObservers();
	}
}
