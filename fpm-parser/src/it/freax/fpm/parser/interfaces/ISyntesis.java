/**
 * 
 */
package it.freax.fpm.parser.interfaces;

import it.freax.fpm.parser.edo.StructureTree;
import it.freax.fpm.parser.edo.TargetCode;

/**
 * @author kLeZ-hAcK
 */
public interface ISyntesis<K, V>
{
	public TargetCode performSynthesis(StructureTree<K, V> structureTree);
}
