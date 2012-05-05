package it.freax.fpm.core.solver.conf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConfType
{
	private String source;
	private String grammar;
	private String compiler_opts;
	private List<String> exts;
	private List<NotableFile> notevoli;
	private LinkedList<Instruction> instr_set;
	private List<Additive> additives;

	public ConfType()
	{
		notevoli = new ArrayList<NotableFile>();
		instr_set = new LinkedList<Instruction>();
		additives = new ArrayList<Additive>();
	}

	public String getSource()
	{
		return source;
	}

	public void setSource(String source)
	{
		this.source = source;
	}

	public String getGrammar()
	{
		return grammar;
	}

	public void setGrammar(String grammar)
	{
		this.grammar = grammar;
	}

	public String getCompiler_opts()
	{
		return compiler_opts;
	}

	public void setCompiler_opts(String compiler_opts)
	{
		this.compiler_opts = compiler_opts;
	}

	public List<String> getExts()
	{
		return exts;
	}

	public void setExts(List<String> list)
	{
		exts = list;
	}

	public boolean containsNotevole(String notablefile)
	{
		boolean ret = false;
		String notable = notablefile.substring(notablefile.indexOf('/') + 1);
		Iterator<NotableFile> it = notevoli.iterator();
		while (it.hasNext())
		{
			if (ret = it.next().getName().equalsIgnoreCase(notable))
			{
				break;
			}
		}
		return ret;
	}

	public void addNotable(NotableFile ntbl)
	{
		notevoli.add(ntbl);
	}

	public void addInstruction(Instruction instr)
	{
		instr_set.add(instr);
	}

	public void addAdditive(Additive add)
	{
		additives.add(add);
	}

	public ArrayList<Instruction> getInstructionsById(int id)
	{
		ArrayList<Instruction> ret = new ArrayList<Instruction>();
		for (Instruction instr : instr_set)
		{
			if (instr.getId() == id)
			{
				ret.add(instr);
			}
		}
		return ret;
	}

	public ArrayList<Additive> getAdditivesById(int id)
	{
		ArrayList<Additive> ret = new ArrayList<Additive>();
		for (Additive add : additives)
		{
			if (add.getId() == id)
			{
				ret.add(add);
			}
		}
		return ret;
	}

	public NotableFile getNotableFile(String name)
	{
		NotableFile ret = null;
		for (NotableFile notable : notevoli)
		{
			if (notable.getName().equalsIgnoreCase(name))
			{
				ret = notable;
			}
		}
		return ret;
	}

	public List<Additive> getAdditives()
	{
		return additives;
	}
}
