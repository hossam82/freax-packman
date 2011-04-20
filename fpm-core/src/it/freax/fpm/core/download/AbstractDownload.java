package it.freax.fpm.core.download;

/**
 * @author kLeZ-hAcK
 */
import java.io.File;
import java.net.URL;
import java.util.Observable;

// This class downloads a file from a URL.
public abstract class AbstractDownload extends Observable implements Runnable
{
	// Max size of download buffer.
	protected static final int MAX_BUFFER_SIZE = 10 * 1024;

	// These are the status names.
	public static final String[] STATUSES = { "Downloading", "Paused", "Complete", "Cancelled", "Error" };

	// These are the status codes.
	public static final int DOWNLOADING = 0;
	public static final int PAUSED = 1;
	public static final int COMPLETE = 2;
	public static final int CANCELLED = 3;
	public static final int ERROR = 4;

	protected URL url; // download URL
	protected long size; // size of download in bytes
	protected long downloaded; // number of bytes downloaded
	protected int status; // current status of download
	protected String path; // path where to download the file
	protected StringBuilder debugMessage; // message for debugging purposes
	protected boolean useProxy; // this is necessary because of the check for
	// calling the proxy server
	protected boolean useAuthentication; // this is necessary because when
	// calling the proxy I have to know
	// if the proxy server requires
	// authentication or not
	protected String proxyUrl; // address of the proxy server (IP or Hostname)
	protected int port; // proxy server listening port
	protected String userName; // an account that is able to connect to the
	// proxy (if necessary)
	protected String password; // a password for the account name

	public boolean debug = false;

	// Constructor for AbstractDownload.
	public AbstractDownload(URL url, String path)
	{
		this.url = url;
		this.path = path;
		size = -1;
		downloaded = 0;
		status = DOWNLOADING;
		debugMessage = new StringBuilder();
	}

	public AbstractDownload(URL url, String path, String proxyUrl, int port)
	{
		this(url, path);
		useProxy = true;
		useAuthentication = false;
		this.proxyUrl = proxyUrl;
		this.port = port;
	}

	public AbstractDownload(URL url, String path, String proxyUrl, int port, String userName, String password)
	{
		this(url, path, proxyUrl, port);
		useAuthentication = true;
		this.userName = userName;
		this.password = password;
	}

	// Cancel this download.
	public void cancel()
	{
		status = CANCELLED;
		stateChanged();
	}

	// Start or resume downloading.
	protected void download()
	{
		Thread thread = new Thread(this);
		thread.start();
	}

	// Mark this download as having an error.
	protected void error()
	{
		status = ERROR;
		stateChanged();
	}

	public String getDebugMessages()
	{
		return debugMessage.toString().trim();
	}

	public long getDownloaded()
	{
		return downloaded;
	}

	// Get file name portion of URL.
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

	// Get this download's progress.
	public float getProgress()
	{
		return ((float) downloaded / size) * 100;
	}

	// Get this download's size.
	public long getSize()
	{
		return size;
	}

	// Get this download's status.
	public int getStatus()
	{
		return status;
	}

	// Get this download's URL.
	public String getUrl()
	{
		return url.toString();
	}

	// Pause this download.
	public void pause()
	{
		status = PAUSED;
		stateChanged();
	}

	// Resume this download.
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

	// AbstractDownload file.
	public abstract void run();

	/**
	 * Sets the debug message used for error reporting and debug purpose. It
	 * don't append a line feed at the end of the line.
	 * 
	 * @author kLeZ-hAcK
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

	// Notify observers that this download's status has changed.
	protected void stateChanged()
	{
		setChanged();
		notifyObservers();
	}
}
