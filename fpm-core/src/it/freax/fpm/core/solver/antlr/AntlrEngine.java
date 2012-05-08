/**
 * 
 */
package it.freax.fpm.core.solver.antlr;

import it.freax.fpm.util.*;
import it.freax.fpm.util.exceptions.ConfigurationReadException;
import it.freax.fpm.util.exceptions.ExtensionDecodingException;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.tools.*;
import javax.tools.JavaCompiler.CompilationTask;

import org.antlr.Tool;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.apache.log4j.Logger;

/**
 * @author kLeZ-hAcK
 */
public class AntlrEngine
{
	private final Logger log = LogConfigurator.getOne(this.getClass()).configure(true);
	private final String grammarName;
	private final String langName;
	private final Constants consts;
	private final File antlrOutput;
	private final String antlrPlainArgs;
	private final ArrayList<String> antlrArgs;
	private final String lexerSuffix;
	private final String parserSuffix;
	private final File grammarsFolder;
	private final File grammar;
	private final Language lang;
	private final String classPrefix;
	private int importStmt = -1;
	private int eos = -1;
	private ParserRuleReturnScope parserRetVal;
	private final File classpath;

	public AntlrEngine(String grammarName, String langName) throws ConfigurationReadException, MalformedURLException, ExtensionDecodingException, FileNotFoundException
	{
		this.grammarName = grammarName;
		this.langName = langName;
		consts = Constants.getOneReset(getClass());
		antlrOutput = new File(Strings.getOne().safeConcatPaths(consts.getDefaultFpmPath(), consts.getConstant("generated.output.directory")));
		if (!antlrOutput.exists())
		{
			antlrOutput.mkdirs();
		}
		antlrPlainArgs = consts.getConstant("antlr.cmdline.options").replace(Constants.ANTLR_OUT_P, antlrOutput.getAbsolutePath());
		antlrArgs = new ArrayList<String>(Arrays.asList(antlrPlainArgs.split(" ")));
		lexerSuffix = consts.getConstant("lexer.suffix");
		parserSuffix = consts.getConstant("parser.suffix");

		FpmCollections<String> pakDirs = FpmCollections.getOne(Arrays.asList(Constants.ENGINE_PACKAGE.split("\\.")));
		pakDirs.insert(antlrOutput.getAbsolutePath(), 0);
		pakDirs.add(Constants.FS);
		String path = Strings.getOne().safeConcatPaths(pakDirs.toArray(new String[] {}));
		classpath = new File(path);

		grammarsFolder = getGrammarsFolder();
		if (!grammarsFolder.exists())
		{
			grammarsFolder.mkdirs();
			fillGrammarsFolder(grammarsFolder);
		}
		else if (grammarsFolder.listFiles(new FileNameRegexFilter(".*\\.g")) == null)
		{
			fillGrammarsFolder(grammarsFolder);
		}
		grammar = getGrammarFile(grammarsFolder);
		lang = Language.create(grammar, langName);
		classPrefix = Constants.ENGINE_PACKAGE + lang.getLanguageName();
	}

	public boolean process(String sourceFileName, String sourceContents) throws ExtensionDecodingException, IOException, ConfigurationReadException
	{
		boolean ret = false;
		String fmt = "Trying to build a parser for the grammar %s, in order to parse '%s'";
		log.debug(String.format(fmt, grammarName, sourceFileName));
		if (grammarsFolder.exists())
		{
			if (isAlreadyBuilt())
			{
				ret = runParser(sourceFileName, sourceContents);
			}
			else if (isAlreadyGenerated())
			{
				if (build())
				{
					ret = runParser(sourceFileName, sourceContents);
				}
			}
			else
			{
				generateParser(grammar);
				if (build())
				{
					ret = runParser(sourceFileName, sourceContents);
				}
			}
		}
		return ret;
	}

	public ArrayList<String> getImports()
	{
		CommonTree t = (CommonTree) parserRetVal.getTree();
		ArrayList<String> ret = new ArrayList<String>();
		if (t != null)
		{
			for (int i = 0; i < t.getChildCount(); i++)
			{
				if (t.getChild(i).getType() == importStmt)
				{
					int j = i + 1;
					StringBuilder sb = new StringBuilder();
					String current;
					Tree child = t.getChild(j);
					while ((child != null) && (child.getType() != eos))
					{
						current = child.toString();
						sb.append(current);
						child = t.getChild(++j);
					}
					ret.add(sb.toString());
				}
			}
		}
		return ret;
	}

	/**
	 * @param grammarsFolder
	 * @return
	 * @throws FileNotFoundException
	 */
	public File getGrammarFile(File grammarsFolder) throws FileNotFoundException
	{
		File[] grammars = grammarsFolder.listFiles(new FileNameRegexFilter(langName + ".*\\.g"));
		File grammar = (grammars != null) && (grammars.length > 0) ? grammars[0] : null;
		if ((grammar == null) || !grammar.exists())
		{
			String msg = "Grammar file not found. Check grammars folder.";
			throw ErrorHandler.getOne(getClass()).<FileNotFoundException> rethrow(new FileNotFoundException(msg));
		}
		return grammar;
	}

	/**
	 * @param grammar
	 */
	public void generateParser(File grammar)
	{
		Tool antlr;
		antlrArgs.add(grammar.getAbsolutePath());
		antlr = new Tool(antlrArgs.toArray(new String[] {}));
		antlr.process();
	}

	public boolean isAlreadyGenerated()
	{
		Strings s = Strings.getOne();

		String lexerSourceName = lang.getLanguageName().concat(lexerSuffix).concat(".java");
		String parserSourceName = lang.getLanguageName().concat(parserSuffix).concat(".java");

		File lexerSource = new File(s.safeConcatPaths(antlrOutput.getAbsolutePath(), lexerSourceName));
		File parserSource = new File(s.safeConcatPaths(antlrOutput.getAbsolutePath(), parserSourceName));
		return lexerSource.exists() && parserSource.exists();
	}

	public boolean isAlreadyBuilt()
	{
		String regexPattern = "%s(%s|%s)?.*\\.class";
		String regex = String.format(regexPattern, lang.getLanguageName(), parserSuffix, lexerSuffix);

		File[] generatedClasses = classpath.listFiles(new FileNameRegexFilter(regex));
		return (generatedClasses != null) && (generatedClasses.length > 0);
	}

	/**
	 * @param grammarsFolder
	 */
	private void fillGrammarsFolder(File grammarsFolder)
	{
		try
		{
			String[] grammars = Streams.getResourceListing(getClass(), Constants.GRAMMARS_DIR, ".*\\.g");
			InputStream is;
			for (String grammar : grammars)
			{
				Streams s = Streams.getOne(Strings.getOne().safeConcatPaths(Constants.GRAMMARS_DIR, grammar));
				is = s.getResource();
				s.dump(is, Strings.getOne().safeConcatPaths(grammarsFolder.getAbsolutePath(), grammar));
			}
		}
		catch (URISyntaxException e)
		{
			ErrorHandler.getOne(getClass()).handle("Errore in enumerazione risorse di grammatiche.", e);
		}
		catch (IOException e)
		{
			ErrorHandler.getOne(getClass()).handle("Errore in dump delle grammatiche.", e);
		}
	}

	/**
	 * @param writer
	 * @param loader
	 * @param lang
	 * @return
	 */
	public boolean runParser(String sourceFileName, String sourceContents)
	{
		boolean ret = false;
		try
		{
			Lexer lexer = (Lexer) Class.forName(classPrefix + lexerSuffix, true, getAntlrClassLoader()).newInstance();
			lexer.setCharStream(new ANTLRStringStream(sourceContents));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			Class<?> parserClass = Class.forName(classPrefix + parserSuffix, true, getAntlrClassLoader());

			importStmt = parserClass.getField(lang.getImportStmt()).getInt(null);
			eos = parserClass.getField(lang.getEos()).getInt(null);

			Constructor<?> parserCTor = parserClass.getConstructor(TokenStream.class);
			Parser parser = (Parser) parserCTor.newInstance(tokens);
			Method entryPointMethod = parserClass.getMethod(lang.getEntryPoint());
			parserRetVal = (ParserRuleReturnScope) entryPointMethod.invoke(parser);
			ret = true;
		}
		catch (SecurityException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
		}
		catch (IllegalArgumentException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
		}
		catch (InstantiationException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
		}
		catch (IllegalAccessException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
		}
		catch (ClassNotFoundException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
		}
		catch (NoSuchMethodException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
		}
		catch (InvocationTargetException e)
		{
			String fmt = "Error in parsing source file '%s' with the grammar %s!";
			log.warn(String.format(fmt, sourceFileName, grammarName));
		}
		catch (NoSuchFieldException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
		}
		catch (MalformedURLException e)
		{
			ErrorHandler.getOne(getClass()).handle(e);
		}
		return ret;
	}

	/**
	 * @return
	 * @throws MalformedURLException
	 */
	private URLClassLoader getAntlrClassLoader() throws MalformedURLException
	{
		URL[] urlclasspath = new URL[] { antlrOutput.toURI().toURL() };
		ClassLoader sysCL = ClassLoader.getSystemClassLoader();
		URLClassLoader loader = URLClassLoader.newInstance(urlclasspath, sysCL);
		return loader;
	}

	/**
	 * @return
	 * @throws ExtensionDecodingException
	 */
	public File getGrammarsFolder() throws ExtensionDecodingException
	{
		String grammarsFolderPath;
		String fpmFolder = consts.getDefaultFpmPath();
		String grammars = consts.getConstant("antlr.grammars.directory");
		grammarsFolderPath = Strings.getOne().concatPaths(fpmFolder, grammars);
		return new File(grammarsFolderPath);
	}

	public boolean build() throws IOException, ConfigurationReadException
	{
		boolean success;
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();

		try
		{
			JavaFileObject lexer = getFileObject(antlrOutput.getAbsolutePath(), langName, lexerSuffix);
			JavaFileObject parser = getFileObject(antlrOutput.getAbsolutePath(), langName, parserSuffix);

			Iterable<? extends JavaFileObject> compilationUnits = Arrays.asList(lexer, parser);
			String[] args = consts.getConstant("java.compiler.cmdline.options").replace(Constants.ANTLR_OUT_P, antlrOutput.getAbsolutePath()).split(" ");
			Iterable<String> options = Arrays.asList(args);
			CompilationTask task = compiler.getTask(null, null, diagnostics, options, null, compilationUnits);

			success = task.call();
			StringBuilder sb = new StringBuilder();
			for (Diagnostic<?> diagnostic : diagnostics.getDiagnostics())
			{
				sb.delete(0, sb.length());
				sb.append("Code: ").append(diagnostic.getCode()).append("; ");
				sb.append("Kind: ").append(diagnostic.getKind()).append("; ");
				sb.append("Position: ").append(diagnostic.getPosition()).append("; ");
				sb.append("StartPosition: ").append(diagnostic.getStartPosition()).append("; ");
				sb.append("EndPosition: ").append(diagnostic.getEndPosition()).append("; ");
				sb.append("Source: ").append(diagnostic.getSource()).append("; ");
				sb.append(diagnostic.getMessage(null)).append(Constants.LS);
				log.warn(sb);
			}
		}
		catch (FileNotFoundException fnfe)
		{
			String msg = "";
			msg = String.format("There was an error in building %s: Source files not found, maybe antlr is not woring", grammarName);
			ErrorHandler.getOne(getClass()).handle(msg, fnfe);
			success = false;
		}
		log.info(String.format("Building grammar %s... %s", grammarName, (success ? "Ok" : "Ko")));
		return success;
	}

	private JavaFileObject getFileObject(String antlrOutput, String grammarName, String type) throws FileNotFoundException
	{
		StringWriter writer = new StringWriter();
		String className = grammarName + type;
		Scanner scanner = new Scanner(new File(antlrOutput, String.format("%s.java", className)));
		while (scanner.hasNextLine())
		{
			writer.append(scanner.nextLine()).append(Constants.LS);
		}
		return new SourceObject(className, writer.toString());
	}

	/**
	 * @return the parserRetVal
	 */
	public ParserRuleReturnScope getParserRetVal()
	{
		return parserRetVal;
	}
}
