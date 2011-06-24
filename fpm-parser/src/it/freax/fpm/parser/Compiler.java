/**
 * 
 */
package it.freax.fpm.parser;

import it.freax.fpm.core.util.Collections;
import it.freax.fpm.core.util.Constants;
import it.freax.fpm.core.util.Streams;
import it.freax.fpm.core.util.Strings;
import it.freax.fpm.parser.actions.CompilationAction;
import it.freax.fpm.parser.edo.ErrorReport;
import it.freax.fpm.parser.edo.TargetCode;

import java.io.IOException;

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
		TargetCode targetCode = compilationAction.run(Streams.getOne(args[0]).read());
		Collections<ErrorReport> reports = null;
		reports = Collections.getOne(targetCode.getErrorReports());
		System.out.println(Strings.getOne().getLines(reports.<String> castAll()));
		if (reports.isNullOrEmpty())
		{
			String path = Constants.getOne().getDirPrefix() + args[1];
			Streams.getOne(path).write(targetCode.getOutputPayload(), true).setExecutable(true);
		}
	}
}
