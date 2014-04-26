/**
 * 
 */
package it.freax.fpm.compiler.analysis;

import it.freax.fpm.compiler.edo.TokenSequence;
import it.freax.fpm.compiler.interfaces.IAnalysis;

/**
 * @author klez
 */
public class LexicalAnalysis implements IAnalysis<String, TokenSequence>
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * it.freax.fpm.compiler.interfaces.IAnalysis#performAnalysis(java.lang.Object
	 * )
	 */
	@Override
	public TokenSequence analyse(String sourceText)
	{
		// TODO Lexical analysis implemetation

		return null;
	}
}
