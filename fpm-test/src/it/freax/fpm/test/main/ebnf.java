package it.freax.fpm.test.main;

/* ebnf.java
*
* Recursive descent parser for EBNF, cft 2004-05-08
*
* usage: java ebnf [-v] <grammar.txt
*
* Test data (EBNF grammar for EBNF):

	S = P { P } "#" .
	P = VARSYM "=" A "." .
	A = T { "|" T } .
	T = F { F } .
	F = VARSYM | """TERMSYM""" | "(" A ")" |
	    "[" A "]" | "{" A "}" .
	#

*
*/

import it.freax.fpm.util.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class ebnf extends Constants
{
	PushbackInputStream is;
	String ident;
	int lasttok = -1;
	int lineno = 1;
	int lev = 0;
	boolean dotrace = true;

	static final int EOF = 0;
	static final int IDENT = 1;
	static final int HASH = 2;
	static final int EQUAL = 3;
	static final int DOT = 4;
	static final int BAR = 5;
	static final int QUOTEDCHAR = 6;
	static final int LPARENT = 7;
	static final int RPARENT = 8;
	static final int LBRACKET = 9;
	static final int RBRACKET = 10;
	static final int LBRACE = 11;
	static final int RBRACE = 12;
	static final int OTHERSYM = 13;

	public static void main(String args[])
	{
		Constants consts = Constants.getOne();
		try
		{
			consts.setSystemResource(false);
			String path = consts.getFullConfPath() + "java.ebnf";
			ebnf parser = new ebnf(new FileInputStream(path));
			parser.dotrace = (args.length > 0) && args[0].equals("-v");
			parser.S();
			System.out.println("// parsing was successful");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public ebnf(InputStream is)
	{
		if (is == null)
		{
			is = System.in;
		}
		this.is = new PushbackInputStream(is);
	}

	public void trace(int lev, String s)
	{
		if (!dotrace) { return; }
		while (lev-- > 0)
		{
			System.out.print("  ");
		}
		System.out.println(s);
	}

	public int getToken()
	{
		if (lasttok >= 0)
		{
			int t = lasttok;
			lasttok = -1;
			return t;
		}
		try
		{
			ident = "";
			while (true)
			{
				int c = is.read();
				switch (c)
				{
					case -1:
						return EOF;
					case '\r':
					case '\n':
						lineno++;
						break;
					case ' ':
					case '\t':
						break;
					case '#':
						return HASH;
					case '=':
						return EQUAL;
					case '.':
						return DOT;
					case '|':
						return BAR;
					case '(':
						return LPARENT;
					case ')':
						return RPARENT;
					case '[':
						return LBRACKET;
					case ']':
						return RBRACKET;
					case '{':
						return LBRACE;
					case '}':
						return RBRACE;
					case '\"':
						c = is.read();
						if ((c < '!') || (c > '~'))
						{
							error("expected quoted char");
						}
						ident += (char) c;
						if (is.read() != '\"')
						{
							error("expected double quote");
						}
						return QUOTEDCHAR;
					default:
						while (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')))
						{
							ident += (char) c;
							c = is.read();
						}
						if (ident.length() != 0)
						{
							is.unread(c);
							return IDENT;
						}
						ident += (char) c;
						return OTHERSYM;
				}
			}
		}
		catch (IOException e)
		{
			return EOF;
		}
	}

	public void ungetToken(int t)
	{
		lasttok = t;
	}

	public void error(String s)
	{
		System.out.println("EBNF error at line " + lineno + ": " + s);
		System.exit(-1);
	}

	public void S()
	{
		trace(lev++, "==> S");
		while (true)
		{
			P();
			int t = getToken();
			if (t == HASH)
			{
				break;
			}
			ungetToken(t);
		}
		if (getToken() != EOF)
		{
			error("expected EOF");
		}
		trace(--lev, "<== S");
	}

	public void P()
	{
		trace(lev++, "==> P");
		if (getToken() != IDENT)
		{
			error("expected an identifier");
		}
		if (getToken() != EQUAL)
		{
			error("expected an equal sign");
		}
		A();
		if (getToken() != DOT)
		{
			error("expected a dot");
		}
		trace(--lev, "<== P");
	}

	public void A()
	{
		trace(lev++, "==> A");
		while (true)
		{
			T();
			int t = getToken();
			if (t != BAR)
			{
				ungetToken(t);
				break;
			}
		}
		trace(--lev, "<== A");
	}

	public void T()
	{
		trace(lev++, "==> T");
		if (!F())
		{
			error("expected a factor");
		}
		while (F())
		{
			;
		}
		trace(--lev, "<== T");
	}

	public boolean F()
	{
		trace(lev, "F");
		int t = getToken();

		switch (t)
		{
			case IDENT:
				trace(lev + 1, "ident: " + ident);
				return true;
			case QUOTEDCHAR:
				return true;
			case LPARENT:
			case LBRACKET:
			case LBRACE:
				A();
				if ((t + 1) != getToken())
				{
					error("missmatch with opening parenthesis/bracket/brace");
				}
				return true;
			default:
				ungetToken(t);
				break;
		}
		return false;
	}
}
