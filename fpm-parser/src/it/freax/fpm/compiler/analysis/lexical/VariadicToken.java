/**
 * 
 */
package it.freax.fpm.compiler.analysis.lexical;

/**
 * @author klez
 * 
 */
public class VariadicToken extends Token
{
	protected String lexeme;

	public VariadicToken(long line, long col, String lexeme)
	{
		super(line, col);
		this.lexeme = lexeme;
	}

	public String getLexeme()
	{
		return lexeme;
	}
}
