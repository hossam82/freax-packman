package it.freax.fpm.core.solver.core;

import it.freax.fpm.core.util.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public class EbnfParser
{
	private String ebnf;
	private String ebnfContent;
	private Vector<String> imports;

	public EbnfParser(String ebnf, boolean asResourceStream)
	{
		this.ebnf = ebnf;
		this.ebnfContent = "";
		this.loadEbnf(asResourceStream);
	}

	public String getEbnf()
	{
		return this.ebnf;
	}

	public void setEbnf(String ebnf)
	{
		this.ebnf = ebnf;
		this.loadEbnf(true);
	}

	public void setEbnf(String ebnf, boolean asResourceStream)
	{
		this.ebnf = ebnf;
		this.imports.clear();
		this.loadEbnf(asResourceStream);
	}

	public Vector<String> getImports()
	{
		return this.imports;
	}

	private void loadEbnf(boolean asResourceStream)
	{
		try
		{
			if (asResourceStream)
			{
				InputStream is = ClassLoader.getSystemResourceAsStream(this.ebnf);
				if (is != null)
				{
					this.ebnfContent = FileUtils.read(is);
				}
			}
			else
			{
				File f = new File(this.ebnf);
				if (f.exists() && f.isFile())
				{
					this.ebnfContent = FileUtils.read(f);
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public boolean parse(String fileToMatch)
	{
		//TODO: Implementare metodo di parsing!!!
		this.imports = new Vector<String>();
		this.ebnfContent = "Dummy text!";
		boolean matches = false;
		matches = this.ebnfContent.equalsIgnoreCase(fileToMatch);
		/*		Vector<String> incl = StringUtils.grep(fileToMatch, "#include[\\p{Space}\\p{Graph}\\p{Punct}]+", false);
				for (String s : incl)
				{
					s = StringUtils.KeyValue(s, "");
					this.imports.add(s);
				}*/
		return matches;
	}
}
