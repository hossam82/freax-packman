package it.freax.fpm.compiler;

import it.freax.fpm.compiler.actions.CompilationAction;
import it.freax.fpm.compiler.edo.ErrorReport;
import it.freax.fpm.compiler.edo.TargetCode;
import it.freax.fpm.util.FpmCollections;
import it.freax.fpm.util.Constants;
import it.freax.fpm.util.Streams;
import it.freax.fpm.util.Strings;

import java.io.IOException;

/**
 * @author klez
 */
public class Compiler
{
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		CompilationAction compilationAction = new CompilationAction();
		TargetCode targetCode = compilationAction.run(Streams.getOne(args[0]).read());
		FpmCollections<ErrorReport> reports = null;
		reports = FpmCollections.getOne(targetCode.getErrorReports());
		System.out.println(Strings.getOne().getLines(reports.<String> castAll()));
		if (reports.isNullOrEmpty())
		{
			String path = "";
			if (Strings.getOne().isRelativePath(args[1]))
			{
				path = Constants.USER_DIR + args[1];
			}
			else
			{
				path = args[1];
			}
			Streams.getOne(path).write(targetCode.getOutputPayload(), true).setExecutable(true);
		}
	}
}
