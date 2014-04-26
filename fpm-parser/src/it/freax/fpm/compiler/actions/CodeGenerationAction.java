/**
 * 
 */
package it.freax.fpm.compiler.actions;

import it.freax.fpm.compiler.edo.StructureTree;
import it.freax.fpm.compiler.edo.TargetTree;
import it.freax.fpm.compiler.interfaces.IAction;

/**
 * @author klez
 */
public class CodeGenerationAction<K, V> implements IAction<StructureTree<K, V>, TargetTree<K, V>>
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see it.freax.fpm.compiler.interfaces.IAction#run(java.lang.Object)
	 */
	@Override
	public TargetTree<K, V> run(StructureTree<K, V> input)
	{
		return new CodeSelectionAction<K, V>().run(new TargetMappingAction<K, V>().run(input));
	}
}
