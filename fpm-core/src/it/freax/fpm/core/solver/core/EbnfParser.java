package it.freax.fpm.core.solver.core;

import it.freax.fpm.util.ErrorHandler;
import it.freax.fpm.util.Streams;
import it.freax.fpm.util.Strings;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class EbnfParser
{
	private String ebnf;
	private String ebnfContent;
	private ArrayList<String> imports;

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

	public ArrayList<String> getImports()
	{
		return imports;
	}

	private void loadEbnf()
	{
		Streams streams = Streams.getOne(ebnf);
		try
		{
			InputStream is = streams.getResource();
			if (is != null)
			{
				ebnfContent = streams.read();
			}
		}
		catch (IOException e)
		{
			ErrorHandler.getOne(getClass(), true).handle("Error loading Ebnf.", e);
		}
	}

	public boolean parse(String fileToMatch)
	{
		//TODO: Implementare metodo di parsing!!!
		imports = new ArrayList<String>();
		ebnfContent = "Dummy text!";
		Strings strings = Strings.getOne();
		boolean matches = false;
		matches = ebnfContent.equalsIgnoreCase(fileToMatch);
		List<String> incl = strings.grep(fileToMatch, "#include[\\p{Space}\\p{Graph}\\p{Punct}]+", false);
		for (String s : incl)
		{
			s = strings.KeyValue(s, " ");
			imports.add(s);
		}
		return matches;
	}
}
