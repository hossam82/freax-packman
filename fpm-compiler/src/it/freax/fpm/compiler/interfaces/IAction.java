/**
 * 
 */
package it.freax.fpm.compiler.interfaces;

/**
 * @author klez
 */
public interface IAction<IN, OUT>
{
	OUT run(IN input);
}
