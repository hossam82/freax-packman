package it.freax.fpm.core.solver.dto;

import it.freax.fpm.core.executor.Instruction;
import it.freax.fpm.core.solver.specs.DummySpec;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class CompilationUnit
{
	private String Name;
	private DummySpec dummySpec;
	private String PrincipalLang;
	private HashSet<String> Langs;
	private Vector<CUFile> ContainedFiles;
	private LinkedList<Instruction> InstructionSet;

	public CompilationUnit(String Name)
	{
		this.Name = Name;
		this.dummySpec = new DummySpec();
		this.Langs = new HashSet<String>();
		this.ContainedFiles = new Vector<CUFile>();
		this.InstructionSet = new LinkedList<Instruction>();
	}

	public String getName()
	{
		return this.Name;
	}

	public void setName(String value)
	{
		this.Name = value;
	}

	public DummySpec getDummySpec()
	{
		return this.dummySpec;
	}

	public void setDummySpec(DummySpec dummySpec)
	{
		this.dummySpec = dummySpec;
	}

	public String getPrincipalLang()
	{
		return this.PrincipalLang;
	}

	public void setPrincipalLang(String value)
	{
		this.PrincipalLang = value;
	}

	public void addCUFile(SrcFile file)
	{
		CUFile e = new CUFile(file.getName());
		e.setNotable(file.isNotable());
		for (String lang : file.getLangs())
		{
			e.addLang(lang);
		}
		for (String include : file.getIncludes())
		{
			e.addImport(include);
		}
		this.ContainedFiles.add(e);
	}

	public void addInstruction(String command, String workingDir)
	{
		this.InstructionSet.add(new Instruction(command, workingDir));
	}

	public void addLang(String lang)
	{
		this.Langs.add(lang);
	}

	public void addAllLangs(Collection<String> langs)
	{
		for (String lang : langs)
		{
			this.addLang(lang);
		}
	}

	public HashSet<String> getLangs()
	{
		return this.Langs;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("CompilationUnit [Name=");
		builder.append(this.Name);
		builder.append(", dummySpec=");
		builder.append(this.dummySpec);
		builder.append(", PrincipalLang=");
		builder.append(this.PrincipalLang);
		builder.append(", Langs=");
		builder.append(this.Langs);
		builder.append(", ContainedFiles=");
		builder.append(this.ContainedFiles);
		builder.append(", InstructionSet=");
		builder.append(this.InstructionSet);
		builder.append("]");
		return builder.toString();
	}
}
