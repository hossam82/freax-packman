package it.freax.fpm.core.solver.specs;

import it.freax.fpm.core.solver.dto.SubPackage;

import java.io.File;
import java.util.HashMap;
import java.util.Vector;

public class DummySpec extends Spec
{
	public DummySpec()
	{
		this.File = null;
		this.ChangeLog = "";
		this.Scripts = "";
		this.Package = new SubPackage();
		this.Provides = new Vector<SubPackage>();
		this.Requires = new Vector<SubPackage>();
		this.ConfigFiles = new HashMap<String, String>();
		this.DocFiles = new HashMap<String, String>();
	}

	public void setPackageName(String packageName)
	{
		this.Package.setPackageName(packageName);
	}

	public void setVersion(String version)
	{
		this.Package.setVersion(version);
	}

	public void setSubPackage(String packageName, String packageVersion)
	{
		this.Package.setPackageName(packageName);
		this.Package.setVersion(packageVersion);
	}

	public void setScripts(String Scripts)
	{
		this.Scripts = Scripts;
	}

	public void setChangeLog(String ChangeLog)
	{
		this.ChangeLog = ChangeLog;
	}

	public void addDocFile(String docName, String docContent)
	{
		this.DocFiles.put(docName, docContent);
	}

	@Override
	public void Load(File file)
	{
		System.out.println("I'm dummy, boy!");
	}

	@Override
	public String toString()
	{
		return "I'm dummy, boy!";
	}

}
