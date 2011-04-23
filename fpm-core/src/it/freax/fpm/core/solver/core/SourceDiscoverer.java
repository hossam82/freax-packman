package it.freax.fpm.core.solver.core;

import it.freax.fpm.core.archives.ArchiveReader;
import it.freax.fpm.core.solver.conf.*;
import it.freax.fpm.core.solver.dto.CompilationUnit;
import it.freax.fpm.core.solver.dto.PackageInfos;
import it.freax.fpm.core.solver.dto.SrcFile;
import it.freax.fpm.core.solver.dto.Treenode;
import it.freax.fpm.core.solver.specs.DummySpec;
import it.freax.fpm.core.types.InfoType;
import it.freax.fpm.core.types.RootExecution;
import it.freax.fpm.core.util.CoreUtils;
import it.freax.fpm.core.util.EntriesScorer;
import it.freax.fpm.core.util.LogConfigurator;
import it.freax.fpm.core.util.StringUtils;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

public class SourceDiscoverer
{
	private Vector<String> entries;
	private ArchiveReader reader;
	private Configuration conf;
	private String packageName;
	private String version;
	private Logger log = LogConfigurator.configure(this.getClass());

	public SourceDiscoverer(ArchiveReader reader)
	{
		this.reader = reader;
		this.entries = reader.getEntries();
		this.conf = Configuration.load("conf/source-detect.xml");
	}

	public void setPackageName(String packageName)
	{
		this.packageName = packageName;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}

	public PackageInfos discover() throws IOException
	{
		long start = this.time();
		PackageInfos ret = this.initPackInfo();

		// Per problemi di performance devo leggere tutte le entry in un colpo solo
		start = this.time();
		this.reader.readEntries();
		this.log.debug("Read all entries: " + (this.time() - start));
		ret.setArchiveSpecification(this.initTreeSet());

		start = this.time();

		Iterator<Treenode> it = ret.getArchiveSpecification().iterator();
		while (it.hasNext())
		{
			Treenode tn = it.next();
			Vector<SrcFile> srcfiles = this.makeSrcFileList(tn, this.getFiles(tn.getName()));
			this.makeInstructionSet(tn, this.cleanSrcFiles(srcfiles));
			CompilationUnit cu = tn.getAssociatedCU();
			this.setCompilationUnit(cu, srcfiles);
			tn.updateCU(cu);
			this.log.debug(cu.getDummySpec().getPackage().getPackageName());
			this.log.debug(cu.getDummySpec().getPackage().getVersion());
		}
		ret.setDummy(this.getGlobalDummySpec(ret.getArchiveSpecification()));
		this.log.debug("Tempo impiegato: " + (this.time() - start));
		return ret;
	}

	private long time()
	{
		return Calendar.getInstance().getTimeInMillis();
	}

	private Vector<String> getFiles(String directory)
	{
		Vector<String> ret = new Vector<String>();
		TreeSet<String> files = new TreeSet<String>(this.entries);
		int dirsplitlen = directory.split("/").length;
		Iterator<String> it = files.iterator();
		while (it.hasNext())
		{
			String entry = it.next();
			if (entry.startsWith(directory) && !entry.equalsIgnoreCase(directory) && (dirsplitlen + 1 == entry.split("/").length) && !this.isDirectory(entry))
			{
				ret.add(entry);
			}
		}
		return ret;
	}

	private TreeSet<Treenode> initTreeSet()
	{
		TreeSet<Treenode> ret = new TreeSet<Treenode>();
		for (String entry : this.entries)
		{
			if (this.isDirectory(entry))
			{
				ret.add(new Treenode(entry));
			}
		}
		if ((this.entries.size() > 0) && (ret.size() <= 0))
		{
			String dir = this.entries.get(0);
			dir = dir.substring(0, dir.indexOf('/') + 1);
			ret.add(new Treenode(dir));
		}
		return ret;
	}

	private boolean isDirectory(String path)
	{
		boolean ret = false;
		if (path.endsWith(System.getProperty("file.separator")))
		{
			ret = true;
		}
		return ret;
	}

	private boolean isFileParticolare(String file)
	{
		boolean ret = false;
		Iterator<ConfType> it = this.conf.typesIterator();
		while (it.hasNext())
		{
			ret = it.next().containsNotevole(StringUtils.trimDir(file));
			if (ret)
			{
				break;
			}
		}
		return ret;
	}

	private Vector<String> getNotableFileLangs(String notablefile)
	{
		Vector<String> ret = new Vector<String>();
		Iterator<ConfType> it = this.conf.typesIterator();
		while (it.hasNext())
		{
			ConfType ct = it.next();
			if (ct.containsNotevole(StringUtils.trimDir(notablefile)))
			{
				ret.add(ct.getSource());
			}
		}
		return ret;
	}

	private static EbnfParser getEbnfParser(EbnfParser parser, String ebnf, boolean asResourceStream)
	{
		if (ebnf == null)
		{
			parser = null;
		}
		else if (parser == null)
		{
			parser = new EbnfParser(ebnf, asResourceStream);
		}
		else
		{
			parser.setEbnf(ebnf, asResourceStream);
		}
		return parser;
	}

	private void makeInstructionSet(Treenode tn, Vector<SrcFile> files)
	{
		TreeSet<Instruction> instructions = new TreeSet<Instruction>();
		for (SrcFile file : files)
		{
			for (String lang : file.getLangs())
			{
				ConfType type = this.conf.getType(lang);
				if (file.isNotable())
				{
					NotableFile notable = type.getNotableFile(StringUtils.trimDir(file.getName()));
					instructions.addAll(type.getInstructionsById(notable.getId()));
				}
				else
				{
					instructions.addAll(type.getInstructionsById(0));
				}
				instructions.addAll(type.getInstructionsById(-1));
			}
		}
		General genInfo = this.conf.getGeneralInfo();
		Vector<String> command = new Vector<String>();
		String delimiter = CoreUtils.getDelimiter(genInfo.getExitCodeControl());
		Iterator<Instruction> it = instructions.descendingIterator();
		while (it.hasNext())
		{
			Instruction instruction = it.next();
			if (instruction.getPermissions().equalsIgnoreCase("root"))
			{
				if (genInfo.getRootExec() == RootExecution.Sudo)
				{
					command.add(RootExecution.getPrivileges(RootExecution.Sudo));
				}
			}
			command.add(instruction.getAction());
			if (it.hasNext())
			{
				command.add(delimiter);
			}
		}
		tn.getAssociatedCU().addInstruction(CoreUtils.merge(command, " "), null);
	}

	private Vector<SrcFile> makeSrcFileList(Treenode tn, Vector<String> files)
	{
		Vector<SrcFile> srcfiles = new Vector<SrcFile>();
		for (String file : files)
		{
			this.log.debug("Processo il file " + file);
			SrcFile srcfile = this.makeSrcFile(file);
			if (srcfile.isNotable() || (srcfile.getLangs().size() > 0))
			{
				tn.setIsCU(true);
				tn.getAssociatedCU().addCUFile(srcfile);
				tn.getAssociatedCU().addAllLangs(srcfile.getLangs());
				srcfiles.add(srcfile);
			}
		}
		return srcfiles;
	}

	private Vector<SrcFile> cleanSrcFiles(Vector<SrcFile> srcfiles)
	{
		for (int i = 0; i < srcfiles.size(); i++)
		{
			SrcFile file = srcfiles.get(i);
			if (!file.isNotable() && (file.getLangs().size() <= 0))
			{
				srcfiles.remove(i);
			}
		}
		return srcfiles;
	}

	private SrcFile makeSrcFile(String file)
	{
		SrcFile srcfile = new SrcFile();
		srcfile.setName(file);
		srcfile.setNotable(this.isFileParticolare(file));
		Iterator<ConfType> typeit = this.conf.typesIterator();
		String content = this.reader.getEntryContent(file);
		srcfile.setContent(content);

		if (srcfile.isNotable())
		{
			srcfile.addAllLangs(this.getNotableFileLangs(file));
		}
		else
		{
			EbnfParser parser = getEbnfParser(null, null, false);
			while (typeit.hasNext())
			{
				ConfType type = typeit.next();
				if (StringUtils.checkExtensions(file, type.getExts()))
				{
					parser = getEbnfParser(parser, type.getEbnf(), true);
					if (parser.parse(content))
					{
						srcfile.addLang(type.getSource());
						srcfile.addAllIncludes(parser.getImports());
					}
				}
			}
		}
		return srcfile;
	}

	private PackageInfos initPackInfo()
	{
		PackageInfos ret = new PackageInfos();
		if ((this.packageName != null) && !this.packageName.isEmpty())
		{
			ret.getDummy().setPackageName(this.packageName);
		}
		if ((this.version != null) && !this.version.isEmpty())
		{
			ret.getDummy().setVersion(this.version);
		}
		return ret;
	}

	private void setCompilationUnit(CompilationUnit cu, Vector<SrcFile> files)
	{
		this.log.debug(files.size());
		for (SrcFile file : files)
		{
			if (file.isNotable())
			{
				for (String lang : file.getLangs())
				{
					ConfType type = this.conf.getType(lang);
					Vector<Additive> additives = new Vector<Additive>();
					NotableFile notable = type.getNotableFile(StringUtils.trimDir(file.getName()));
					additives = type.getAdditivesById(notable.getId());

					Iterator<Entry<InfoType, Vector<Additive>>> it;
					it = this.getTypedAdditives(additives).entrySet().iterator();
					while (it.hasNext())
					{
						Entry<InfoType, Vector<Additive>> elem = it.next();
						String best = this.getBestScore(elem.getValue(), file);
						switch (elem.getKey())
						{
							case PackageName:
							{
								cu.getDummySpec().setPackageName(best);
								break;
							}
							case Version:
							{
								cu.getDummySpec().setVersion(best);
								break;
							}
							case Changelog:
							{
								cu.getDummySpec().setChangeLog(best);
							}
							case InfoPage:
							case ManPage:
							case Readme:
							{
								cu.getDummySpec().addDocFile(file.getName(), best);
								break;
							}
						}
					}
				}
			}
		}
	}

	private String getBestScore(Vector<Additive> additives, SrcFile file)
	{
		String ret = "";
		EntriesScorer<String> es = new EntriesScorer<String>(true);
		for (Additive additive : additives)
		{
			es.add(additive.execMethod(file));
		}
		Entry<String, Integer> en = es.getBestScore();
		if (en != null)
		{
			ret = en.getKey();
		}
		return ret;
	}

	private HashMap<InfoType, Vector<Additive>> getTypedAdditives(Vector<Additive> additives)
	{
		HashMap<InfoType, Vector<Additive>> typedAdditives;
		typedAdditives = new HashMap<InfoType, Vector<Additive>>();
		for (Additive additive : additives)
		{
			if (!typedAdditives.containsKey(additive.getInfoType()))
			{
				typedAdditives.put(additive.getInfoType(), new Vector<Additive>());
			}
			typedAdditives.get(additive.getInfoType()).add(additive);
		}
		return typedAdditives;
	}

	private DummySpec getGlobalDummySpec(TreeSet<Treenode> set)
	{
		DummySpec ret = new DummySpec();
		Iterator<Treenode> it = set.descendingIterator();
		EntriesScorer<String> namesEs = new EntriesScorer<String>(true);
		EntriesScorer<String> versEs = new EntriesScorer<String>(true);
		while (it.hasNext())
		{
			Treenode tn = it.next();
			if (tn.isCU())
			{
				DummySpec ds = tn.getAssociatedCU().getDummySpec();
				namesEs.add(ds.getPackage().getPackageName());
				versEs.add(ds.getPackage().getVersion());
				ret.setChangeLog(ds.getChangeLog());
			}
		}
		ret.setPackageName(namesEs.getBestScore().getKey());
		ret.setVersion(versEs.getBestScore().getKey());
		return ret;
	}
}
