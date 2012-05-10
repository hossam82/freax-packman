package it.freax.fpm.util;

import it.freax.fpm.util.exceptions.ConfigurationReadException;
import java.io.*;
import java.util.Properties;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

public final class Constants
{
	/**
	 * Home directory dell'utente.<br/>
	 * In *nix è /home/USER/ In Windows è C:\Users\USER\ (Vista, 2k8, 7) o
	 * C:\Documents and Settings\USER\ (2k, XP, 2k3)
	 */
	public static final String USER_HOME = System.getProperty("user.home");
	/**
	 * Directory di esecuzione del programma java, la jvm risolve il percorso
	 * dei class file o del jar file che sta eseguendo e torna la directory root
	 * che li contiene.<br/>
	 * Es.: java -jar /home/joe/fpm/fpmMain.jar -> /home/joe/fpm
	 */
	public static final String USER_DIR = System.getProperty("user.dir");

	/**
	 * Nome del sistema operativo in uso.<br/>
	 * Windows 7, Windows XP, Linux, Solaris, Mac OS X ...
	 */
	public static final String OS_NAME = System.getProperty("os.name");

	/**
	 * Separatore di file (e directory), In Windows '\', in *nix '/'.
	 */
	public static final String FS = System.getProperty("file.separator");

	/**
	 * Separatore di linea, In Windows '\r\n', in *nix '\n' in MacOS '\r'.
	 */
	public static final String LS = System.getProperty("line.separator");

	/**
	 * Nazionalità (e linguaggio) dell'utente corrente
	 */
	public static final String COUNTRY = System.getProperty("user.country");

	/**
	 * Nome del file di configurazione principale di fpm.
	 */
	public static final String MAIN_CONF_FILE = "fpm.conf";

	/**
	 * Nome del file di configurazione per log4j di fpm.
	 */
	public static final String LOG4J_CONF_FILE = "log4j.conf";

	/**
	 * Nome del file di log principale di fpm.
	 */
	public static final String MAIN_LOG_FILE = "fpm.log";

	/**
	 * Pattern di default per il logger di fpm.
	 */
	public static final String DEFAULT_LOG_PATTERN = "%-8r [%t] %-5p %c - %m%n";

	/**
	 * Nome della directory contenente i file di configurazione.
	 */
	public static final String CONF_DIR = "conf";

	/**
	 * Nome della directory delle grammatiche di ANTLR
	 */
	public static final String GRAMMARS_DIR = "grammars";

	/**
	 * Nome della directory dei file fisici di fpm (configurazione, log, ...).
	 */
	public static final String FPM_DIR = "fpm";

	/**
	 * Tag di sostituzione che sta a indicare un percorso relativo (interno al
	 * jar che contiene il software eseguito).
	 */
	public static final String REL_P = "${REL}";

	/**
	 * Tag di sostituzione che sta a indicare un paese (o una lingua) per il
	 * sistema di internazionalizzazione.
	 */
	public static final String COUNTRY_P = "${COUNTRY}";

	/**
	 * Tag di sostituzione che sta a indicare il percorso precedente nella lista
	 * di percorsi.
	 */
	public static final String PREV_P = "${PREV}";

	/**
	 * Tag di sostituzione che sta a indicare il percorso della directory di
	 * output per i file generati dalle grammatiche ANTLR
	 */
	public static final String ANTLR_OUT_P = "${ANTLR-Output}";

	/**
	 * Separatore per la lista di percorsi da utilizzare per la ricerca del
	 * MAIN_CONF_FILE.
	 */
	public static final String SEP_P = ":";

	/**
	 * Segnaposto per la directory home dell'utente corrente.
	 */
	public static final String HOME_P = "~";

	/**
	 * Package per le classi generate dal motore ANTLR
	 */
	public static final String ENGINE_PACKAGE = "it.freax.fpm.core.solver.parsers.";

	/**
	 * Delimitatore per la variabile Entry Point all'interno dei file di
	 * grammatica.<br>
	 * Sitassi aggiunta per fpm.<br>
	 * Il delimitatore viene usato come commento di colorazione direttamente sul
	 * tag all'interno della grammatica nel modo:
	 * {@literal /*@@EP::* / ENTRY_POINT /*[reverse(@@EP::)]* /}<br>
	 * Esempio:<br>
	 * {@literal /*@@EP::* / compilationUnit /*::PE@@* /}
	 * 
	 * @author kLeZ-hAcK<br>
	 */
	public static final String ENTRY_POINT_DEL = "@@EP::";

	/**
	 * Delimitatore per la variabile Import Statement all'interno dei file di
	 * grammatica.<br>
	 * Sitassi aggiunta per fpm.<br>
	 * Il delimitatore viene usato come commento di colorazione direttamente sul
	 * tag all'interno della grammatica nel modo:
	 * {@literal /*@@IS::* / IMPORT_STMT /*[reverse(@@IS::)]* /}<br>
	 * Esempio:<br>
	 * {@literal /*@@EP::* / IMPORT /*::PE@@* /}
	 * 
	 * @author kLeZ-hAcK<br>
	 */
	public static final String IMPORT_STMT_DEL = "@@IS::";

	/**
	 * Delimitatore per la variabile Import Statement all'interno dei file di
	 * grammatica.<br>
	 * Sitassi aggiunta per fpm.<br>
	 * Il delimitatore viene usato come commento di colorazione direttamente sul
	 * tag all'interno della grammatica nel modo:
	 * {@literal /*@@EOS::* / EOS /*[reverse(@@EOS::)]* /}<br>
	 * Esempio:<br>
	 * {@literal /*@@EOS::* / SEMI /*::EOS@@* /}
	 * 
	 * @author kLeZ-hAcK<br>
	 */
	public static final String EOS_DEL = "@@EOS::";

	/**
	 * Nome del file delle stringhe localizzate per fpm.
	 */
	public static final String LOCAL_STRINGS_FILE = "loc-" + COUNTRY_P + "-strings.i18n";

	/**
	 * Percorso interno dove trovare le stringhe localizzate in fpm.
	 */
	public static final String LOCAL_STRINGS_PATH = "i18n";

	/**
	 * Lista di percorsi da utilizzare per la ricerca del MAIN_CONF_FILE.<br/>
	 * In maniera gerarchica si trova il percorso di sistema o il percorso
	 * relativo (una risorsa all'interno del jar di fpm, reset to default).<br/>
	 * Se in presenza di un reset to default, il file di configurazione va
	 * scritto sul disco nella directory di sistema.
	 */
	public static final String CONF_PATHS = getSystemConfDir() + SEP_P + REL_P + FS + CONF_DIR + FS + SEP_P + REL_P + FS + LOCAL_STRINGS_PATH + FS;

	private static Constants singleton = null;
	private static boolean hasLoaded = false;

	private String confPath;
	private Properties fpmConf;
	private Properties localizedStrings;
	private Properties log4j;

	private static String getSystemConfDir()
	{
		String sysConf = "";
		if (OS_NAME.toLowerCase().contains("windows"))
		{
			sysConf = (!USER_DIR.endsWith(FS) ? USER_DIR + FS : USER_DIR) + CONF_DIR + FS;
		}
		else
		{
			sysConf = FS + "etc" + FS + FPM_DIR + FS;
			if (!new File(sysConf).canWrite())
			{
				sysConf = USER_HOME + FS + "." + FPM_DIR + FS + CONF_DIR + FS;
			}
		}
		return sysConf;
	}

	@SuppressWarnings("static-access")
	public static MapEntry<String, Properties> loadConf(Class<?> clazz, String fileName, String defaultFileName, boolean writeToDisk, boolean force, boolean vital) throws ConfigurationReadException
	{
		MapEntry<String, Properties> ret = null;

		hasLoaded = (force ? false : hasLoaded);
		Scanner sc = new Scanner(CONF_PATHS).useDelimiter(SEP_P);
		String prev = "", file = fileName;
		while (sc.hasNext() && !hasLoaded)
		{
			Properties conf = null;
			boolean relative = false;
			String path = sc.next();
			if (path.startsWith(PREV_P))
			{
				path = path.replace(PREV_P, prev.substring(0, prev.length() - 1));
			}
			else if (path.startsWith(REL_P))
			{
				path = path.replace(REL_P + FS, "");
				relative = true;
			}
			else if (path.contains(HOME_P))
			{
				path = path.replace(HOME_P, USER_HOME);
			}
			prev = path;

			path = path.concat(file);

			try
			{
				InputStream is = null;
				if (relative)
				{
					is = clazz.getClassLoader().getSystemResourceAsStream(path);

					if (writeToDisk && (is != null))
					{
						path = getSystemConfDir();
						Strings.getOne().createPath(path);
						path = path.concat(file);

						FileOutputStream os = new FileOutputStream(path);
						IOUtils.copy(is, os);
						os.flush();
						os.close();
						os = null;
					}
				}
				else
				{
					is = new FileInputStream(path);
				}
				conf = new Properties();

				if (is != null)
				{
					conf.load(is);
				}
				else
				{
					throw new FileNotFoundException();
				}
				if (conf.isEmpty() && vital) { throw new ConfigurationReadException(); }

				ret = new MapEntry<String, Properties>(path, conf);
				hasLoaded = true;
			}
			catch (FileNotFoundException e)
			{
				conf = null;
				singleton = null;
				hasLoaded = false;
			}
			catch (IOException e)
			{
				throw new ConfigurationReadException();
			}
		}
		if ((ret == null) && !Strings.getOne().isNullOrEmpty(defaultFileName))
		{
			ret = loadConf(clazz, defaultFileName, null, writeToDisk, force, vital);
		}
		return ret;
	}

	public static Constants getOne(Class<?> clazz) throws ConfigurationReadException
	{
		if (!hasLoaded && (singleton == null))
		{
			String localStringsFile = LOCAL_STRINGS_FILE.replace(COUNTRY_P, COUNTRY);
			String localStringsDefault = LOCAL_STRINGS_FILE.replace(COUNTRY_P, "default");

			MapEntry<String, Properties> fpmConf = loadConf(clazz, MAIN_CONF_FILE, null, true, true, true);
			MapEntry<String, Properties> localizedStrings = loadConf(clazz, localStringsFile, localStringsDefault, false, true, false);
			MapEntry<String, Properties> log4j = loadConf(clazz, LOG4J_CONF_FILE, null, true, true, false);

			singleton = new Constants();
			singleton.setDefaultConfPath(fpmConf.getKey());
			singleton.setFpmConf(fpmConf.getValue());
			if (localizedStrings != null)
			{
				singleton.setLocalizedStrings(localizedStrings.getValue());
			}
			if (log4j != null)
			{
				singleton.setLog4j(log4j.getValue());
			}
			hasLoaded = true;
		}
		return singleton;
	}

	public static Constants getOneReset(Class<?> clazz) throws ConfigurationReadException
	{
		hasLoaded = false;
		singleton = null;
		return getOne(clazz);
	}

	public static String getProperty(Properties props, String defaultProp, String propName)
	{
		String ret = defaultProp;
		if (props.containsKey(propName))
		{
			ret = props.getProperty(propName);
		}
		return ret;
	}

	public String getDefaultFpmPath()
	{
		return getDefaultConfPath().substring(0, getDefaultConfPath().indexOf(CONF_DIR)).replace(FS + FS, FS);
	}

	public String getConstant(String name)
	{
		return getFpmConf().getProperty(name);
	}

	public String getConstant(String name, String defaultProp)
	{
		return getProperty(getFpmConf(), name, defaultProp);
	}

	public String getLocalizedString(String name)
	{
		return getLocalizedStrings().getProperty(name);
	}

	public String getLocalizedString(String name, String defaultProp)
	{
		return getProperty(getLocalizedStrings(), name, defaultProp);
	}

	// GETTERS/SETTERS ---------------------------------------------------------

	private void setDefaultConfPath(String confPath)
	{
		this.confPath = confPath;
	}

	public String getDefaultConfPath()
	{
		return confPath;
	}

	private void setFpmConf(Properties fpmConf)
	{
		this.fpmConf = fpmConf;
	}

	public Properties getFpmConf()
	{
		return fpmConf;
	}

	private void setLocalizedStrings(Properties localizedStrings)
	{
		this.localizedStrings = localizedStrings;
	}

	public Properties getLocalizedStrings()
	{
		return localizedStrings;
	}

	public Properties getLog4j()
	{
		return log4j;
	}

	public void setLog4j(Properties log4j)
	{
		this.log4j = log4j;
	}
}
