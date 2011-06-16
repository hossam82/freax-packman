/**
 * 
 */
package it.freax.fpm.parser.analysis;

import it.freax.fpm.parser.edo.ConnectionSequence;
import it.freax.fpm.parser.edo.StructureTree;
import it.freax.fpm.parser.interfaces.IAnalysis;

/**
 * @author kLeZ-hAcK
 */
public class SemanticAnalysis<K, V> implements IAnalysis<ConnectionSequence, StructureTree<K, V>>
{
	/* (non-Javadoc)
	 * @see it.freax.fpm.parser.interfaces.IAnalysis#performAnalysis(java.lang.Object)
	 */
	@Override
	public StructureTree<K, V> analyse(ConnectionSequence sourceText)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
