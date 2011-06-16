/**
 * 
 */
package it.freax.fpm.parser.actions;

import it.freax.fpm.parser.edo.StructureTree;
import it.freax.fpm.parser.edo.TargetCode;
import it.freax.fpm.parser.interfaces.IAction;

/**
 * @author kLeZ-hAcK
 */
public class SynthesisAction<K, V> implements IAction<StructureTree<K, V>, TargetCode>
{
	/* (non-Javadoc)
	 * @see it.freax.fpm.parser.interfaces.IAccessor#performAccessorAction(java.lang.Object)
	 */
	@Override
	public TargetCode run(StructureTree<K, V> input)
	{
		return new AssemblyAction<K, V>().run(new CodeGenerationAction<K, V>().run(input));
	}
}
