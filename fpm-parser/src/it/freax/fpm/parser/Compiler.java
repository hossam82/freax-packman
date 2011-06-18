/**
 * 
 */
package it.freax.fpm.parser;

import it.freax.fpm.parser.actions.CompilationAction;
import it.freax.fpm.parser.edo.ErrorReport;
import it.freax.fpm.parser.edo.TargetCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author kLeZ-hAcK
 */
public class Compiler
{
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		CompilationAction compilationAction = new CompilationAction();
		TargetCode targetCode = compilationAction.run(read(new File(args[0])));
		for (ErrorReport report : targetCode.getErrorReports())
		{
			System.out.println(report);
		}
		if (targetCode.getErrorReports().isEmpty())
		{
			String path = System.getProperty("user.dir") + args[1];
			write(path, targetCode.getOutputPayload()).setExecutable(true);
		}
	}

	public static File write(String path, byte[] toWrite) throws IOException
	{
		File file = new File(path);
		if (file.exists() || file.createNewFile())
		{
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(toWrite);
			fileOutputStream.close();
		}
		else
		{
			throw new IOException("File not exists and cannot be created, aborting");
		}
		return file;
	}

	public static String read(File file) throws FileNotFoundException
	{
		StringBuilder ret = new StringBuilder();
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext())
		{
			ret.append(scanner.nextLine());
			ret.append(System.getProperty("line.separator"));
		}
		scanner.close();
		return ret.toString();
	}
}
