package it.freax.fpm.core.solver.specs;

import it.freax.fpm.core.solver.dto.BasicInfos;

import java.io.File;
import java.util.HashMap;
import java.util.Vector;

public class DummySpec extends Spec
{
	public DummySpec()
	{
		File = null;
		ChangeLog = "";
		Scripts = "";
		Package = new BasicInfos();
		Provides = new Vector<BasicInfos>();
		Requires = new Vector<BasicInfos>();
		ConfigFiles = new HashMap<String, String>();
		DocFiles = new HashMap<String, String>();
	}

	public void setPackageName(String packageName)
	{
		Package.setPackageName(packageName);
	}

	public void setVersion(String version)
	{
		Package.setVersion(version);
	}

	public void setSubPackage(String packageName, String packageVersion)
	{
		Package.setPackageName(packageName);
		Package.setVersion(packageVersion);
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
		DocFiles.put(docName, docContent);
	}

	@Override
	public void Load(File file)
	{
		System.out.println("I'm dummy, boy!");
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("DummySpec [File=");
		builder.append(File);
		builder.append(", Package=");
		builder.append(Package);
		builder.append(", Scripts=");
		builder.append(Scripts);
		builder.append(", ChangeLog=");
		builder.append(ChangeLog);
		builder.append(", Provides=");
		builder.append(Provides);
		builder.append(", Requires=");
		builder.append(Requires);
		builder.append(", ConfigFiles=");
		builder.append(ConfigFiles);
		builder.append(", DocFiles=");
		builder.append(DocFiles);
		builder.append("]");
		return builder.toString();
	}
}
