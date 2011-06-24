package it.freax.fpm.core.solver.specs;

import it.freax.fpm.core.solver.dto.BasicInfos;

import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * This is the Spec class, that allows child classes to have same
 * fields and methods so the solvers have a little less difficult job.
 * 
 * @author kLeZ-hAcK
 */
public abstract class Spec
{
	protected boolean mapped;
	protected File File;
	protected BasicInfos Package;
	protected String Scripts;
	protected String ChangeLog;
	protected ArrayList<BasicInfos> Provides;
	protected ArrayList<BasicInfos> Requires;
	protected HashMap<String, String> ConfigFiles;
	protected HashMap<String, String> DocFiles;

	public Spec()
	{
		File = null;
		ChangeLog = "";
		Scripts = "";
		Package = new BasicInfos();

		Provides = new ArrayList<BasicInfos>();
		Requires = new ArrayList<BasicInfos>();
		ConfigFiles = new HashMap<String, String>();
		DocFiles = new HashMap<String, String>();
	}

	public File getFile()
	{
		return File;
	}

	public BasicInfos getPackage()
	{
		return Package;
	}

	public String getScripts()
	{
		return Scripts;
	}

	public String getChangeLog()
	{
		return ChangeLog;
	}

	public ArrayList<BasicInfos> getProvides()
	{
		return Provides;
	}

	public ArrayList<BasicInfos> getRequires()
	{
		return Requires;
	}

	public HashMap<String, String> getConfigFiles()
	{
		return ConfigFiles;
	}

	public HashMap<String, String> getDocFiles()
	{
		return DocFiles;
	}

	public void map(Spec spec)
	{
		File = spec.getFile();
		Package = spec.getPackage();
		Scripts = spec.getScripts();
		ChangeLog = spec.getChangeLog();
		Provides = spec.getProvides();
		Requires = spec.getRequires();
		ConfigFiles = spec.getConfigFiles();
		DocFiles = spec.getDocFiles();
		mapped = true;
	}

	public abstract void Load(File file);

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName() + ":\n");
		builder.append("\n- File --> ");
		builder.append(File);
		builder.append("\n- Package --> ");
		builder.append(Package);
		builder.append("\n- Scripts --> ");
		builder.append(Scripts);
		builder.append("\n- ChangeLog --> ");
		builder.append(ChangeLog);
		builder.append("\n- Provides --> ");
		builder.append(Provides);
		builder.append("\n- Requires --> ");
		builder.append(Requires);
		builder.append("\n- ConfigFiles --> ");
		builder.append(ConfigFiles);
		builder.append("\n- DocFiles --> ");
		builder.append(DocFiles);
		return builder.toString();
	}
}
