package it.freax.fpm.test.main;

import it.freax.fpm.core.download.AbstractDownload;
import it.freax.fpm.core.download.FtpDownload;
import it.freax.fpm.core.download.HttpDownload;

import java.io.Console;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class MainClass
{
	private static final String PARAMETER_REGEX = "[\\-|\\-\\-][\\p{Graph}]*";
	private static final String URL_REGEX = "(http|ftp)?\\:\\/\\/[\\p{Graph}\\p{Punct}]*";
	private static final String PATH_REGEX = System.getProperty("file.separator") + "[\\p{Graph}\\p{Punct}]*";
	private static final String SUPPORTED_CMDS[] = { "--protocol", "--proxy", "-p", "--port", "-P", "--user", "-u", "--password", "--ftpUser", "--ftpPassword" };
	private static boolean useProxy = false, requiresAuthentication = false,
			ftpAuthentication = false;
	private static String path = "", uri = "", protocol = "HTTP",
			proxyUrl = "", user = "", ftpUser = "", ftpPassword = "";
	private static char password[] = new char[0];
	private static int proxyPort = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		if (args[0].equalsIgnoreCase("--debug"))
		{
			args = new String[] { "-p", "localhost", "-P", "5865", "/home/kLeZ-hAcK/", "http://download.opensuse.org/distribution/11.2/iso/openSUSE-11.2-DVD-x86_64.iso" };
			args = new String[] { "/home/kLeZ-hAcK/", "http://download.opensuse.org/distribution/11.2/iso/openSUSE-11.2-DVD-x86_64.iso" };
			args = new String[] { "/home/kLeZ-hAcK/", "ftp://ftp.kde.org/pub/kde/stable/4.4.4/src/kdeaccessibility-4.4.4.tar.bz2" };
			args = new String[] { "/home/kLeZ-hAcK/", "http://ftp.unina.it/pub/Linux/kde/stable/4.4.4/src/kdeaccessibility-4.4.4.tar.bz3" };
		}

		if (!CheckCommandLine(args)) { return; }

		try
		{
			URL url = null;

			if (protocol.equalsIgnoreCase("ftp"))
			{
				StringBuffer sb = new StringBuffer("ftp://");

				if (ftpAuthentication)
				{
					sb.append(ftpUser);
					sb.append(':');
					sb.append(ftpPassword);
					sb.append('@');
				}

				if (uri.indexOf('@') >= 0)
				{
					sb.append(uri.substring(uri.indexOf('@') + 1, uri.indexOf('/', uri.indexOf('@') + 1)));
				}
				else
				{
					sb.append(uri.substring(uri.indexOf("ftp://") + 6, uri.indexOf('/', uri.indexOf("ftp://") + 6)));
				}

				sb.append(uri.substring(uri.indexOf('/', uri.indexOf("ftp://") + 6)));
				sb.append(";type=i");

				url = new URL(sb.toString());
			}
			else if (protocol.equalsIgnoreCase("http"))
			{
				url = new URL(uri);
			}

			Date data = new Date();

			System.out.print("Download started at ");
			System.out.println(data.toString());
			System.out.print("Using the protocol ");
			System.out.print(protocol);
			System.out.println(" as specified");

			AbstractDownload d = null;

			if (useProxy)
			{
				if (requiresAuthentication)
				{
					if (password.length <= 0)
					{
						Console c = System.console();
						System.out.print("Password: ");
						password = c.readPassword();
					}
					String sPwd = String.valueOf(password);
					if (protocol.equalsIgnoreCase("http"))
					{
						d = new HttpDownload(url, path, proxyUrl, proxyPort, user, sPwd);
					}
					else if (protocol.equalsIgnoreCase("ftp"))
					{
						d = new FtpDownload(url, path, proxyUrl, proxyPort, user, sPwd);
					}
				}
				else if (protocol.equalsIgnoreCase("http"))
				{
					d = new HttpDownload(url, path, proxyUrl, proxyPort);
				}
				else if (protocol.equalsIgnoreCase("ftp"))
				{
					d = new FtpDownload(url, path, proxyUrl, proxyPort);
				}
			}
			else if (protocol.equalsIgnoreCase("http"))
			{
				d = new HttpDownload(url, path);
			}
			else if (protocol.equalsIgnoreCase("ftp"))
			{
				d = new FtpDownload(url, path);
			}

			d.debug = args[0].equalsIgnoreCase("--debug");
			double currentProgress = 0.0D;
			int countResumes = 0;

			do
			{
				if (countResumes++ > 0)
				{
					System.out.print("Numero di resume durante il download: ");
					System.out.println(countResumes);

					d.resume();
				}

				while (d.getStatus() == AbstractDownload.DOWNLOADING)
				{
					if ((d.getProgress() > 0.0D) && (currentProgress < d.getProgress()))
					{
						currentProgress = d.getProgress();

						System.out.print("\rDownloaded [");
						System.out.print(d.getDownloaded());
						System.out.print("] of [");
						System.out.print(d.getSize());
						System.out.print("] Progress: ");
						System.out.print(String.format("%1$.1f", new Object[] { Float.valueOf(d.getProgress()) }));
						System.out.print(" %");
						Thread.sleep(900);
					}
				}
			}
			while ((d.getProgress() < 100D) && ((d.getStatus() == AbstractDownload.DOWNLOADING) || (d.getStatus() == AbstractDownload.COMPLETE)));

			System.out.println();
			System.out.println();

			data = new Date();

			System.out.print("Download ended at ");
			System.out.print(data.toString());
			System.out.print(" with status ");

			if (d.getStatus() == AbstractDownload.ERROR)
			{
				System.err.print(AbstractDownload.STATUSES[d.getStatus()]);
				System.err.print(" ");
				System.err.print("<");
				System.err.print(d.getDebugMessages());
				System.err.println(">");
			}
			else
			{
				System.out.println(AbstractDownload.STATUSES[d.getStatus()]);
			}
		}
		catch (MalformedURLException murlex)
		{
			murlex.printStackTrace();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	private static boolean CheckCommandLine(String args[])
	{
		if (args.length < 1) { return false; }

		for (int i = 0; i < args.length; i++)
		{
			if (args[i].matches(PARAMETER_REGEX))
			{
				int k;
				for (k = 0; k < SUPPORTED_CMDS.length; k++)
				{
					if (args[i].equals(SUPPORTED_CMDS[k]))
					{
						break;
					}
					if (k == SUPPORTED_CMDS.length - 1)
					{
						k = 10000;
					}
				}

				if (k == 0)
				{
					protocol = args[i + 1];
					i++;
				}
				else if ((k == 1) || (k == 2))
				{
					useProxy = true;
					proxyUrl = args[i + 1];
					i++;
				}
				else if ((k == 3) || (k == 4))
				{
					proxyPort = Integer.valueOf(args[i + 1]).intValue();
					i++;
				}
				else if ((k == 5) || (k == 6))
				{
					requiresAuthentication = true;
					user = args[i + 1];
					i++;
				}
				else if (k == 7)
				{
					password = args[i + 1].toCharArray();
					i++;
				}
				else if (k == 8)
				{
					ftpAuthentication = true;
					ftpUser = args[i + 1];
					i++;
				}
				else if (k == 9)
				{
					ftpAuthentication = true;
					ftpPassword = args[i + 1];
					i++;
				}
			}
			else if (args[i].matches(URL_REGEX))
			{
				uri = args[i];
			}
			else if (args[i].matches(PATH_REGEX))
			{
				path = args[i];
			}
			else
			{
				System.out.println("Parameters are not valid! Check command line!");
				return false;
			}
		}

		return true;
	}
}
