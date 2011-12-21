/**
 * 
 */
package it.freax.fpm.compiler.interfaces;

/**
 * @author kLeZ-hAcK
 */
public interface IAction<IN, OUT>
{
	OUT run(IN input);
}
