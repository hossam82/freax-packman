/**
 * 
 */
package it.freax.fpm.parser.interfaces;

/**
 * @author kLeZ-hAcK
 */
public interface IAction<IN, OUT>
{
	OUT run(IN input);
}
