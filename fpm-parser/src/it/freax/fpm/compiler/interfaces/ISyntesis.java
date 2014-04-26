/**
 * 
 */
package it.freax.fpm.compiler.interfaces;

import it.freax.fpm.compiler.edo.StructureTree;
import it.freax.fpm.compiler.edo.TargetCode;

/**
 * @author klez
 */
public interface ISyntesis<K, V>
{
	public TargetCode synthesise(StructureTree<K, V> structureTree);
}
