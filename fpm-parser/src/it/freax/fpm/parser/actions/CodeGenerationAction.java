/**
 * 
 */
package it.freax.fpm.parser.actions;

import it.freax.fpm.parser.edo.StructureTree;
import it.freax.fpm.parser.edo.TargetTree;
import it.freax.fpm.parser.interfaces.IAction;

/**
 * @author kLeZ-hAcK
 */
public class CodeGenerationAction<K, V> implements IAction<StructureTree<K, V>, TargetTree<K, V>>
{
	/* (non-Javadoc)
	 * @see it.freax.fpm.parser.interfaces.IAction#run(java.lang.Object)
	 */
	@Override
	public TargetTree<K, V> run(StructureTree<K, V> input)
	{
		return new CodeSelectionAction<K, V>().run(new TargetMappingAction<K, V>().run(input));
	}
}
