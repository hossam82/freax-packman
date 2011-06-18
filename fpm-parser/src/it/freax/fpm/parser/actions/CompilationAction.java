/**
 * Parser package, that describes a container for the common interfaces to the
 * parsing task to be concerned in this library
 */
package it.freax.fpm.parser.actions;

import it.freax.fpm.parser.edo.TargetCode;
import it.freax.fpm.parser.interfaces.IAction;
import it.freax.fpm.parser.interfaces.IElement;
import it.freax.fpm.parser.syntesis.Synthesis;

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
