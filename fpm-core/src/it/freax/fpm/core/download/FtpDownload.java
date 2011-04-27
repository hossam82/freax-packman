package it.freax.fpm.core.download;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

/**
 * This class extends AbstractDownload class for downloading file
 * from FTP protocol.
 * 
 * @author kLeZ-hAcK
 * @version 0.1
 */
public class FtpDownload extends AbstractDownload
{

	/**
	 * Costructor for FtpDownload.
	 * 
	 * @param url
	 * @param path
	 */
	public FtpDownload(URL url, String path)
	{
		super(url, path);
		this.download();
	}

	/**
	 * Costructor for FtpDownload.
	 * 
	 * @param url
	 * @param path
	 * @param proxyUrl
	 * @param port
	 */
	public FtpDownload(URL url, String path, String proxyUrl, int port)
	{
		super(url, path, proxyUrl, port);
		this.download();
	}

	/**
	 * Costructor for FtpDownload.
	 * 
	 * @param url
	 * @param path
	 * @param proxyUrl
	 * @param port
	 * @param userName
	 * @param password
	 */
	public FtpDownload(URL url, String path, String proxyUrl, int port, String userName, String password)
	{
		super(url, path, proxyUrl, port, userName, password);
		this.download();
	}

	/**
	 * This method permits the download of a file from a url through FTP
	 * protocol.
	 */
	@Override
	public void run()
	{
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try
		{
			if (this.useProxy)
			{
				Properties systemProperties = System.getProperties();
				systemProperties.setProperty("ftp.proxyHost", this.proxyUrl);
				systemProperties.setProperty("ftp.proxyPort", String.valueOf(this.port));

				if (this.useAuthentication)
				{
					Authenticator.setDefault(new SimpleAuthenticator(this.userName, this.password));
				}
			}

			StringBuilder sb = new StringBuilder();
			sb.append(this.path);
			if (!this.path.endsWith(System.getProperty("file.separator")))
			{
				sb.append(System.getProperty("file.separator"));
			}
			sb.append(this.getFileName(this.url));

			this.status = DOWNLOADING;

			URLConnection urlc = this.url.openConnection();

			bis = new BufferedInputStream(urlc.getInputStream());
			bos = new BufferedOutputStream(new FileOutputStream(sb.toString()));

			while (this.status == DOWNLOADING)
			{
				byte[] buffer = new byte[MAX_BUFFER_SIZE];

				// Read from server into buffer.
				int read = bis.read(buffer);
				if (read == -1)
				{
					break;
				}

				// Write buffer to file.
				bos.write(buffer, 0, read);
				this.downloaded += read;
			}
			this.status = COMPLETE;
			this.stateChanged();
		}
		catch (MalformedURLException e)
		{
			if (this.debug)
			{
				e.printStackTrace();
			}
			this.setDebugMessage(e.toString(), true);
			this.error();
		}
		catch (IOException e)
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
			if (bis != null)
			{
				try
				{
					bis.close();
				}
				catch (IOException ioe)
				{
					ioe.printStackTrace();
				}
			}
			if (bos != null)
			{
				try
				{
					bos.close();
				}
				catch (IOException ioe)
				{
					ioe.printStackTrace();
				}
			}
		}
	}
}
