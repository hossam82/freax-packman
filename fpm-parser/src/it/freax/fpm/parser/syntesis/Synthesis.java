/**
 * 
 */
package it.freax.fpm.parser.syntesis;

import it.freax.fpm.parser.actions.AssemblyAction;
import it.freax.fpm.parser.actions.CodeGenerationAction;
import it.freax.fpm.parser.edo.StructureTree;
import it.freax.fpm.parser.edo.TargetCode;
import it.freax.fpm.parser.interfaces.ISyntesis;

/**
 * @author kLeZ-hAcK
 */
public class Synthesis<K, V> implements ISyntesis<K, V>
{
	/* (non-Javadoc)
	 * @see it.freax.fpm.parser.interfaces.IAccessor#performAccessorAction(java.lang.Object)
	 */
	@Override
	public TargetCode synthesise(StructureTree<K, V> input)
	{
		return new AssemblyAction<K, V>().run(new CodeGenerationAction<K, V>().run(input));
	}
}
