/**
 * 
 */
package it.freax.fpm.compiler.interfaces;

/**
 * @author kLeZ-hAcK
 */
public interface IAnalysis<IN, OUT>
{
	public OUT analyse(IN sourceText);
}
