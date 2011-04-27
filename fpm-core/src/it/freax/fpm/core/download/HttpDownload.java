package it.freax.fpm.core.download;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

/**
 * This class extends AbstractDownload class for downloading file
 * from HTTP protocol.
 * 
 * @author kLeZ-hAcK
 * @version 0.1
 */
public final class HttpDownload extends AbstractDownload
{

	/**
	 * Costructor for HttpDownload.
	 * 
	 * @param url
	 * @param path
	 */
	public HttpDownload(URL url, String path)
	{
		super(url, path);
		this.download();
	}

	/**
	 * Costructor for HttpDownload.
	 * 
	 * @param url
	 * @param path
	 * @param proxyUrl
	 * @param port
	 */
	public HttpDownload(URL url, String path, String proxyUrl, int port)
	{
		super(url, path, proxyUrl, port);
		this.download();
	}

	/**
	 * Costructor for HttpDownload.
	 * 
	 * @param url
	 * @param path
	 * @param proxyUrl
	 * @param port
	 * @param userName
	 * @param password
	 */
	public HttpDownload(URL url, String path, String proxyUrl, int port, String userName, String password)
	{
		super(url, path, proxyUrl, port, userName, password);
		this.download();
	}

	/**
	 * This method permits the download of a file from a url through HTTP
	 * protocol.
	 */
	@Override
	public void run()
	{
		RandomAccessFile rafile = null;
		InputStream stream = null;
		HttpURLConnection connection = null;

		try
		{
			if (this.useProxy)
			{
				Properties systemProperties = System.getProperties();
				systemProperties.setProperty("http.proxyHost", this.proxyUrl);
				systemProperties.setProperty("http.proxyPort", String.valueOf(this.port));

				if (this.useAuthentication)
				{
					Authenticator.setDefault(new SimpleAuthenticator(this.userName, this.password));
				}
			}

			connection = (HttpURLConnection) this.url.openConnection();

			connection.setRequestMethod("GET");
			connection.setInstanceFollowRedirects(true);

			StringBuilder sb = new StringBuilder();
			sb.append(this.path);
			if (!this.path.endsWith(System.getProperty("file.separator")))
			{
				sb.append(System.getProperty("file.separator"));
			}
			sb.append(this.getFileName(this.url));

			// Specify what portion of file to download if we are resuming a
			// download.
			if (this.downloaded > 0)
			{
				connection.setRequestProperty("Range", "bytes=" + this.downloaded + "-");
			}

			// Connect to server.
			connection.connect();
			int responseCode = connection.getResponseCode();

			// Make sure response code is in the 200 range.
			if (responseCode != HttpURLConnection.HTTP_OK)
			{
				this.setDebugMessage("Response code is not 200: ", true);
				this.setDebugMessage(String.valueOf(connection.getResponseCode()), true);
				this.setDebugMessage(String.valueOf(connection.getResponseMessage()), true);
				if (responseCode >= 300)
				{
					this.error();
					return;
				}
			}

			// Check for valid content length.
			long contentLength = Long.parseLong(connection.getHeaderField("content-length"));
			if (contentLength < 1)
			{
				this.setDebugMessage("Content length is not valid.", false);
				this.error();
				return;
			}

			/*
			 * Set the size for this download if it hasn't been already set.
			 */
			if (this.size == -1)
			{
				this.size = contentLength;
				this.stateChanged();
			}

			// Open file and seek to the end of it.
			rafile = new RandomAccessFile(sb.toString(), "rw");
			rafile.seek(this.downloaded);

			stream = connection.getInputStream();

			while (this.status == DOWNLOADING)
			{
				/*
				 * Size buffer according to how much of the file is left to
				 * download.
				 */
				byte buffer[];

				if (this.size - this.downloaded > MAX_BUFFER_SIZE)
				{
					buffer = new byte[MAX_BUFFER_SIZE];
				}
				else if ((this.size - this.downloaded < MAX_BUFFER_SIZE) && (this.size - this.downloaded > 0))
				{
					buffer = new byte[(int) (this.size - this.downloaded)];
				}
				else
				{
					break;
				}

				// Read from server into buffer.
				int read = stream.read(buffer);
				if (read == -1)
				{
					break;
				}

				// Write buffer to file.
				rafile.write(buffer, 0, read);
				this.downloaded += read;
				this.stateChanged();
			}

			/*
			 * Change status to complete if this point was reached because
			 * downloading has finished.
			 */
			if (this.status == DOWNLOADING)
			{
				this.status = COMPLETE;
				this.stateChanged();
			}
		}
		catch (Exception e)
		{
			if (this.debug)
			{
				e.printStackTrace();
			}
			this.setDebugMessage(e.toString(), true);
			this.error();
		}
		finally
		{
			// Close file.
			if (rafile != null)
			{
				try
				{
					rafile.close();
				}
				catch (Exception e)
				{
				}
			}

			// Close connection to server.
			if (stream != null)
			{
				try
				{
					stream.close();
				}
				catch (Exception e)
				{
				}
			}
		}
	}
}
