/**
 * 
 */
package it.freax.fpm.compiler.syntesis;

import it.freax.fpm.compiler.actions.AssemblyAction;
import it.freax.fpm.compiler.actions.CodeGenerationAction;
import it.freax.fpm.compiler.edo.StructureTree;
import it.freax.fpm.compiler.edo.TargetCode;
import it.freax.fpm.compiler.interfaces.ISyntesis;

/**
 * @author kLeZ-hAcK
 */
public class Synthesis<K, V> implements ISyntesis<K, V>
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.freax.fpm.compiler.interfaces.IAccessor#performAccessorAction(java
	 * .lang.Object)
	 */
	@Override
	public TargetCode synthesise(StructureTree<K, V> input)
	{
		return new AssemblyAction<K, V>().run(new CodeGenerationAction<K, V>().run(input));
	}
}
