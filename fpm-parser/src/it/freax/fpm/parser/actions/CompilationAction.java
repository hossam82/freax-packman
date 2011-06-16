/**
 * Parser package, that describes a container for the common interfaces to the
 * parsing task to be concerned in this library
 */
package it.freax.fpm.parser.actions;

import it.freax.fpm.parser.edo.TargetCode;
import it.freax.fpm.parser.interfaces.IAction;

/**
 * @author kLeZ-hAcK
 */
public class CompilationAction<K, V> implements IAction<String, TargetCode>
{
	@Override
	public TargetCode run(String sourceText)
	{
		return new SynthesisAction<K, V>().run(new AnalysisAction<K, V>().run(sourceText));
	}
}
