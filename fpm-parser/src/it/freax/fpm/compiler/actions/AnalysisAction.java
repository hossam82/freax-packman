/**
 * 
 */
package it.freax.fpm.compiler.actions;

import it.freax.fpm.compiler.analysis.SemanticAnalysis;
import it.freax.fpm.compiler.analysis.StructuralAnalysis;
import it.freax.fpm.compiler.edo.StructureTree;
import it.freax.fpm.compiler.interfaces.IAction;

/**
 * @author klez
 */
public class AnalysisAction<K, V> implements IAction<String, StructureTree<K, V>>
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.freax.fpm.compiler.interfaces.IAccessor#performAccessorAction(java
	 * .lang.Object)
	 */
	@Override
	public StructureTree<K, V> run(String input)
	{
		return new SemanticAnalysis<K, V>().analyse(new StructuralAnalysis().analyse(input));
	}
}
