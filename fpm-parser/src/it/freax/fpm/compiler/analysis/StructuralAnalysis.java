/**
 * 
 */
package it.freax.fpm.compiler.analysis;

import it.freax.fpm.compiler.actions.ParsingAction;
import it.freax.fpm.compiler.edo.ConnectionSequence;
import it.freax.fpm.compiler.interfaces.IAnalysis;

/**
 * @author kLeZ-hAcK
 */
public class StructuralAnalysis implements IAnalysis<String, ConnectionSequence>
{
	/* (non-Javadoc)
	 * @see it.freax.fpm.compiler.interfaces.IAnalysis#performAnalysis(java.lang.String)
	 */
	@Override
	public ConnectionSequence analyse(String sourceText)
	{
		return new ParsingAction().run(new LexicalAnalysis().analyse(sourceText));
	}
}
