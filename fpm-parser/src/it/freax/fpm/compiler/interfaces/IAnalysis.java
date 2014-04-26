/**
 * 
 */
package it.freax.fpm.compiler.interfaces;

/**
 * @author klez
 */
public interface IAnalysis<IN, OUT>
{
	public OUT analyse(IN sourceText);
}
