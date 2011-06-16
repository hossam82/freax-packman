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
		CompilationAction<String, String> compilationAction = new CompilationAction<String, String>();
		TargetCode targetCode = compilationAction.run(read(new File(args[0])));
		for (ErrorReport report : targetCode.getErrorReports())
		{
			System.out.println(report);
		}
		if (targetCode.getErrorReports().isEmpty())
		{
			String path = System.getProperty("user.dir") + System.getProperty("file.separator");
			File file = new File(path + args[1]);
			if (file.createNewFile())
			{
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				fileOutputStream.write(targetCode.getOutputPayload());
				fileOutputStream.close();
				file.setExecutable(true);
			}
		}
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
