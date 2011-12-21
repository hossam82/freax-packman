/**
 * Parser package, that describes a container for the common interfaces to the
 * parsing task to be concerned in this library
 */
package it.freax.fpm.compiler.actions;

import it.freax.fpm.compiler.edo.TargetCode;
import it.freax.fpm.compiler.interfaces.IAction;
import it.freax.fpm.compiler.interfaces.IElement;
import it.freax.fpm.compiler.syntesis.Synthesis;

/**
 * @author kLeZ-hAcK
 */
public class CompilationAction implements IAction<String, TargetCode>
{
	@Override
	public TargetCode run(String sourceText)
	{
		return new Synthesis<Integer, IElement>().synthesise(new AnalysisAction<Integer, IElement>().run(sourceText));
	}
}
