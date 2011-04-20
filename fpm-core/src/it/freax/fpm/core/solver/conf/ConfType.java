package it.freax.fpm.core.solver.conf;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ConfType
{
	private String source;
	private String ebnf;
	private String compiler_opts;
	private Vector<String> exts;
	private Vector<NotableFile> notevoli;
	private LinkedList<Instruction> instr_set;
	private Vector<Additive> additives;

	public ConfType()
	{
		this.notevoli = new Vector<NotableFile>();
		this.instr_set = new LinkedList<Instruction>();
		this.additives = new Vector<Additive>();
	}

	public String getSource()
	{
		return this.source;
	}

	public void setSource(String source)
	{
		this.source = source;
	}

	public String getEbnf()
	{
		return this.ebnf;
	}

	public void setEbnf(String ebnf)
	{
		this.ebnf = ebnf;
	}

	public String getCompiler_opts()
	{
		return this.compiler_opts;
	}

	public void setCompiler_opts(String compiler_opts)
	{
		this.compiler_opts = compiler_opts;
	}

	public Vector<String> getExts()
	{
		return this.exts;
	}

	public void setExts(Vector<String> exts)
	{
		this.exts = exts;
	}

	public boolean containsNotevole(String notablefile)
	{
		boolean ret = false;
		String notable = notablefile.substring(notablefile.indexOf('/') + 1);
		for (Iterator<NotableFile> it = this.notevoli.iterator(); it.hasNext();)
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
		this.notevoli.add(ntbl);
	}

	public void addInstruction(Instruction instr)
	{
		this.instr_set.add(instr);
	}

	public void addAdditive(Additive add)
	{
		this.additives.add(add);
	}

	public Vector<Instruction> getInstructionsById(int id)
	{
		Vector<Instruction> ret = new Vector<Instruction>();
		for (Instruction instr : this.instr_set)
		{
			if (instr.getId() == id)
			{
				ret.add(instr);
			}
		}
		return ret;
	}

	public Vector<Additive> getAdditivesById(int id)
	{
		Vector<Additive> ret = new Vector<Additive>();
		for (Additive add : this.additives)
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
		for (NotableFile notable : this.notevoli)
		{
			if (notable.getName().equalsIgnoreCase(name))
			{
				ret = notable;
			}
		}
		return ret;
	}

	public Vector<Additive> getAdditives()
	{
		return this.additives;
	}
}
