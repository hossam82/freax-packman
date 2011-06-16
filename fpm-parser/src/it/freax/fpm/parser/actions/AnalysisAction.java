/**
 * 
 */
package it.freax.fpm.parser.actions;

import it.freax.fpm.parser.analysis.SemanticAnalysis;
import it.freax.fpm.parser.analysis.StructuralAnalysis;
import it.freax.fpm.parser.edo.StructureTree;
import it.freax.fpm.parser.interfaces.IAction;

/**
 * @author kLeZ-hAcK
 */
public class AnalysisAction<K, V> implements IAction<String, StructureTree<K, V>>
{
	/* (non-Javadoc)
	 * @see it.freax.fpm.parser.interfaces.IAccessor#performAccessorAction(java.lang.Object)
	 */
	@Override
	public StructureTree<K, V> run(String input)
	{
		return new SemanticAnalysis<K, V>().analyse(new StructuralAnalysis().analyse(input));
	}
}
