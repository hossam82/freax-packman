package it.freax.fpm.core.download;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

public final class HttpDownload extends AbstractDownload
{
	public HttpDownload(URL url, String path)
	{
		super(url, path);
		download();
	}

	public HttpDownload(URL url, String path, String proxyUrl, int port)
	{
		super(url, path, proxyUrl, port);
		download();
	}

	public HttpDownload(URL url, String path, String proxyUrl, int port, String userName, String password)
	{
		super(url, path, proxyUrl, port, userName, password);
		download();
	}

	@Override
	public void run()
	{
		RandomAccessFile rafile = null;
		InputStream stream = null;
		HttpURLConnection connection = null;

		try
		{
			if (useProxy)
			{
				Properties systemProperties = System.getProperties();
				systemProperties.setProperty("http.proxyHost", proxyUrl);
				systemProperties.setProperty("http.proxyPort", String.valueOf(port));

				if (useAuthentication)
				{
					Authenticator.setDefault(new SimpleAuthenticator(userName, password));
				}
			}

			connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.setInstanceFollowRedirects(true);

			StringBuilder sb = new StringBuilder();
			sb.append(path);
			if (!path.endsWith(System.getProperty("file.separator")))
			{
				sb.append(System.getProperty("file.separator"));
			}
			sb.append(getFileName(url));

			// Specify what portion of file to download if we are resuming a
			// download.
			if (downloaded > 0)
			{
				connection.setRequestProperty("Range", "bytes=" + downloaded + "-");
			}

			// Connect to server.
			connection.connect();
			int responseCode = connection.getResponseCode();

			// Make sure response code is in the 200 range.
			if (responseCode != HttpURLConnection.HTTP_OK)
			{
				setDebugMessage("Response code is not 200: ", true);
				setDebugMessage(String.valueOf(connection.getResponseCode()), true);
				setDebugMessage(String.valueOf(connection.getResponseMessage()), true);
				if (responseCode >= 300)
				{
					error();
					return;
				}
			}

			// Check for valid content length.
			long contentLength = Long.parseLong(connection.getHeaderField("content-length"));
			if (contentLength < 1)
			{
				setDebugMessage("Content length is not valid.", false);
				error();
				return;
			}

			/*
			 * Set the size for this download if it hasn't been already set.
			 */
			if (size == -1)
			{
				size = contentLength;
				stateChanged();
			}

			// Open file and seek to the end of it.
			rafile = new RandomAccessFile(sb.toString(), "rw");
			rafile.seek(downloaded);

			stream = connection.getInputStream();

			while (status == DOWNLOADING)
			{
				/*
				 * Size buffer according to how much of the file is left to
				 * download.
				 */
				byte buffer[];

				if (size - downloaded > MAX_BUFFER_SIZE)
				{
					buffer = new byte[MAX_BUFFER_SIZE];
				}
				else if ((size - downloaded < MAX_BUFFER_SIZE) && (size - downloaded > 0))
				{
					buffer = new byte[(int) (size - downloaded)];
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
				downloaded += read;
				stateChanged();
			}

			/*
			 * Change status to complete if this point was reached because
			 * downloading has finished.
			 */
			if ((status == DOWNLOADING))
			{
				status = COMPLETE;
				stateChanged();
			}
		}
		catch (Exception e)
		{
			if (debug)
			{
				e.printStackTrace();
			}
			setDebugMessage(e.toString(), true);
			error();
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
