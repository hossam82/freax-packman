package it.freax.fpm.core.solver.core;

import it.freax.fpm.core.util.FileUtils;
import it.freax.fpm.core.util.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public class EbnfParser
{
	private String ebnf;
	private String ebnfContent;
	private Vector<String> imports;

	public EbnfParser(String ebnf)
	{
		this.ebnf = ebnf;
		ebnfContent = "";
		loadEbnf();
	}

	public String getEbnf()
	{
		return ebnf;
	}

	public void setEbnf(String ebnf)
	{
		this.ebnf = ebnf;
		imports.clear();
		loadEbnf();
	}

	public Vector<String> getImports()
	{
		return imports;
	}

	private void loadEbnf()
	{
		try
		{
			InputStream is = FileUtils.getResource(ebnf);
			if (is != null)
			{
				ebnfContent = FileUtils.read(is);
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
		imports = new Vector<String>();
		ebnfContent = "Dummy text!";
		boolean matches = false;
		matches = ebnfContent.equalsIgnoreCase(fileToMatch);
		Vector<String> incl = StringUtils.grep(fileToMatch, "#include[\\p{Space}\\p{Graph}\\p{Punct}]+", false);
		for (String s : incl)
		{
			s = StringUtils.KeyValue(s, " ");
			imports.add(s);
		}
		return matches;
	}
}
