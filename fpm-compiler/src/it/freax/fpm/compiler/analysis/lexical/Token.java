/**
 * 
 */
package it.freax.fpm.compiler.analysis.lexical;

/**
 * @author klez
 * 
 */
public class Token
{
	protected long line;
	protected long col;

	public Token(long line, long col)
	{
		this.line = line;
		this.col = col;
	}

	public long getLine()
	{
		return line;
	}

	public long getCol()
	{
		return col;
	}
}
