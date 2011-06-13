/**
 * 
 */
package it.freax.fpm.test.bnf;

import bnf.BNFException;
import bnf.terminals.Source;

/**
 * @author kLeZ-hAcK
 *
 */
public class EBNFSource implements Source
{

	/**
	 * 
	 */
	public EBNFSource()
	{
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see bnf.terminals.Source#getCurrentRowAndColumn()
	 */
	@Override
	public RowAndColumn getCurrentRowAndColumn()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see bnf.terminals.Source#getName()
	 */
	@Override
	public String getName()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see bnf.terminals.Source#getText()
	 */
	@Override
	public String getText()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see bnf.terminals.Source#getUltimateRowAndColumn()
	 */
	@Override
	public RowAndColumn getUltimateRowAndColumn()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see bnf.terminals.Source#isEOF()
	 */
	@Override
	public boolean isEOF()
	{
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see bnf.terminals.Source#mark()
	 */
	@Override
	public Cursor mark()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see bnf.terminals.Source#read()
	 */
	@Override
	public char read() throws BNFException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see bnf.terminals.Source#reset(bnf.terminals.Source.Cursor)
	 */
	@Override
	public void reset(Cursor arg0) throws BNFException
	{
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see bnf.terminals.Source#unread()
	 */
	@Override
	public void unread() throws BNFException
	{
		// TODO Auto-generated method stub

	}

}
