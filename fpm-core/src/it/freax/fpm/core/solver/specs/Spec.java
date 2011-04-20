package it.freax.fpm.core.solver.specs;

import it.freax.fpm.core.solver.dto.SubPackage;

import java.io.File;
import java.util.HashMap;
import java.util.Vector;

/**
 * This is the Spec class, that allows child classes to have same
 * fields and methods so the solvers have a little less difficult job.
 * 
 * @author kLeZ-hAcK
 */
public abstract class Spec
{
	protected File File;
	protected SubPackage Package;
	protected String Scripts;
	protected String ChangeLog;
	protected Vector<SubPackage> Provides;
	protected Vector<SubPackage> Requires;
	protected HashMap<String, String> ConfigFiles;
	protected HashMap<String, String> DocFiles;

	public Spec()
	{
		this.Provides = new Vector<SubPackage>();
		this.Requires = new Vector<SubPackage>();
		this.ConfigFiles = new HashMap<String, String>();
		this.DocFiles = new HashMap<String, String>();
	}

	public File getFile()
	{
		return this.File;
	}

	public SubPackage getPackage()
	{
		return this.Package;
	}

	public String getScripts()
	{
		return this.Scripts;
	}

	public String getChangeLog()
	{
		return this.ChangeLog;
	}

	public Vector<SubPackage> getProvides()
	{
		return this.Provides;
	}

	public Vector<SubPackage> getRequires()
	{
		return this.Requires;
	}

	public HashMap<String, String> getConfigFiles()
	{
		return this.ConfigFiles;
	}

	public HashMap<String, String> getDocFiles()
	{
		return this.DocFiles;
	}

	public abstract void Load(File file);

	@Override
	public abstract String toString();
}
