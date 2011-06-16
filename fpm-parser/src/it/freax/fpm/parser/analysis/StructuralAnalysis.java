/**
 * 
 */
package it.freax.fpm.parser.analysis;

import it.freax.fpm.parser.actions.ParsingAction;
import it.freax.fpm.parser.edo.ConnectionSequence;
import it.freax.fpm.parser.interfaces.IAnalysis;

/**
 * @author kLeZ-hAcK
 */
public class StructuralAnalysis implements IAnalysis<String, ConnectionSequence>
{
	/* (non-Javadoc)
	 * @see it.freax.fpm.parser.interfaces.IAnalysis#performAnalysis(java.lang.String)
	 */
	@Override
	public ConnectionSequence analyse(String sourceText)
	{
		return new ParsingAction().run(new LexicalAnalysis().analyse(sourceText));
	}
}
