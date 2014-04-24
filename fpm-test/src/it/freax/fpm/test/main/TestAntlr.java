/**
 * 
 */
package it.freax.fpm.test.main;

import it.freax.fpm.core.specs.tarball.antlr.AntlrEngine;
import it.freax.fpm.util.LogConfigurator;
import it.freax.fpm.util.Streams;
import it.freax.fpm.util.exceptions.ConfigurationReadException;
import it.freax.fpm.util.exceptions.ExtensionDecodingException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Calendar;

import org.antlr.runtime.*;
import org.apache.log4j.Logger;

/**
 * @author klez
 */
public class TestAntlr
{
	/**
	 * @param args
	 * @throws IOException
	 * @throws RecognitionException
	 */
	public static void main(String[] args)
	{
		Logger log = LogConfigurator.getOne(TestAntlr.class).configure(true);
		try
		{
			long start = Calendar.getInstance().getTimeInMillis();
			log.debug(start);
			AntlrEngine engine;
			String[] sources = new String[] { "/usr/src/linux/kernel/cpu.c", "/usr/share/cacti/install/index.php", "/home/klez/projects/FreaxPackageManager/fpm-test/src/it/freax/fpm/test/main/TestAntlr.java" };
			for (String source : sources)
			{
				engine = new AntlrEngine("Java.g", "Java");
				if (engine.process(source, Streams.getOne(source).read()))
				{
					log.debug(Calendar.getInstance().getTimeInMillis() - start);
					for (String imp : engine.getImports())
					{
						log.info(imp);
					}
				}
			}
		}
		catch (IllegalArgumentException e)
		{
			log.error("", e);
		}
		catch (SecurityException e)
		{
			log.error("", e);
		}
		catch (IOException e)
		{
			log.error("", e);
		}
		catch (ConfigurationReadException e)
		{
			log.error("", e);
		}
		catch (ExtensionDecodingException e)
		{
			log.error("", e);
		}
		catch (URISyntaxException e)
		{
			log.error("", e);
		}
	}
}
