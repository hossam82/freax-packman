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

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class ebnf
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
		ebnf parser = new ebnf(null);
		parser.dotrace = (args.length > 0) && args[0].equals("-v");
		parser.S();
		System.out.println("// parsing was successful");
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
		if (!this.dotrace) { return; }
		while (lev-- > 0)
		{
			System.out.print("  ");
		}
		System.out.println(s);
	}

	public int getToken()
	{
		if (this.lasttok >= 0)
		{
			int t = this.lasttok;
			this.lasttok = -1;
			return t;
		}
		try
		{
			this.ident = "";
			while (true)
			{
				int c = this.is.read();
				switch (c)
				{
					case -1:
						return EOF;
					case '\r':
					case '\n':
						this.lineno++;
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
						c = this.is.read();
						if ((c < '!') || (c > '~'))
						{
							this.error("expected quoted char");
						}
						this.ident += (char) c;
						if (this.is.read() != '\"')
						{
							this.error("expected double quote");
						}
						return QUOTEDCHAR;
					default:
						while ((c >= 'A') && (c <= 'Z'))
						{
							this.ident += (char) c;
							c = this.is.read();
						}
						if (this.ident.length() != 0)
						{
							this.is.unread(c);
							return IDENT;
						}
						this.ident += (char) c;
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
		this.lasttok = t;
	}

	public void error(String s)
	{
		System.out.println("EBNF error at line " + this.lineno + ": " + s);
		System.exit(-1);
	}

	public void S()
	{
		this.trace(this.lev++, "==> S");
		while (true)
		{
			this.P();
			int t = this.getToken();
			if (t == HASH)
			{
				break;
			}
			this.ungetToken(t);
		}
		if (this.getToken() != EOF)
		{
			this.error("expected EOF");
		}
		this.trace(--this.lev, "<== S");
	}

	public void P()
	{
		this.trace(this.lev++, "==> P");
		if (this.getToken() != IDENT)
		{
			this.error("expected an identifier");
		}
		if (this.getToken() != EQUAL)
		{
			this.error("expected an equal sign");
		}
		this.A();
		if (this.getToken() != DOT)
		{
			this.error("expected a dot");
		}
		this.trace(--this.lev, "<== P");
	}

	public void A()
	{
		this.trace(this.lev++, "==> A");
		while (true)
		{
			this.T();
			int t = this.getToken();
			if (t != BAR)
			{
				this.ungetToken(t);
				break;
			}
		}
		this.trace(--this.lev, "<== A");
	}

	public void T()
	{
		this.trace(this.lev++, "==> T");
		if (!this.F())
		{
			this.error("expected a factor");
		}
		while (this.F())
		{
			;
		}
		this.trace(--this.lev, "<== T");
	}

	public boolean F()
	{
		this.trace(this.lev, "F");
		int t = this.getToken();

		switch (t)
		{
			case IDENT:
				this.trace(this.lev + 1, "ident: " + this.ident);
				return true;
			case QUOTEDCHAR:
				return true;
			case LPARENT:
			case LBRACKET:
			case LBRACE:
				this.A();
				if ((t + 1) != this.getToken())
				{
					this.error("missmatch with opening parenthesis/bracket/brace");
				}
				return true;
			default:
				this.ungetToken(t);
				break;
		}
		return false;
	}
}
