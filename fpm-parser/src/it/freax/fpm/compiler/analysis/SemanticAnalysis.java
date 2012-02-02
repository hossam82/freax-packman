/**
 * 
 */
package it.freax.fpm.compiler.analysis;

import it.freax.fpm.compiler.edo.ConnectionSequence;
import it.freax.fpm.compiler.edo.StructureTree;
import it.freax.fpm.compiler.interfaces.IAnalysis;

/**
 * @author kLeZ-hAcK
 */
public class SemanticAnalysis<K, V> implements IAnalysis<ConnectionSequence, StructureTree<K, V>>
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.freax.fpm.compiler.interfaces.IAnalysis#performAnalysis(java.lang.Object
	 * )
	 */
	@Override
	public StructureTree<K, V> analyse(ConnectionSequence sourceText)
	{
		// TODO Semantic analysis implementation
		return null;
	}
}
