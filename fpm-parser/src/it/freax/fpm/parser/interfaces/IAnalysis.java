/**
 * 
 */
package it.freax.fpm.parser.interfaces;

/**
 * @author kLeZ-hAcK
 */
public interface IAnalysis<IN, OUT>
{
	public OUT analyse(IN sourceText);
}
