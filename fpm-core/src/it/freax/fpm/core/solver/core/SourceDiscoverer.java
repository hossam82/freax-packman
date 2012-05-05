package it.freax.fpm.core.solver.core;

import it.freax.fpm.core.archives.ArchiveReader;
import it.freax.fpm.core.solver.antlr.AntlrEngine;
import it.freax.fpm.core.solver.conf.*;
import it.freax.fpm.core.solver.dto.CompilationUnit;
import it.freax.fpm.core.solver.dto.SrcFile;
import it.freax.fpm.core.solver.dto.Treenode;
import it.freax.fpm.core.solver.specs.DummySpec;
import it.freax.fpm.core.solver.specs.TarballSpec;
import it.freax.fpm.core.types.ExitCodeControl;
import it.freax.fpm.core.types.InfoType;
import it.freax.fpm.core.types.RootExecution;
import it.freax.fpm.util.*;
import it.freax.fpm.util.exceptions.ConfigurationReadException;
import it.freax.fpm.util.exceptions.ExtensionDecodingException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.*;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

public class SourceDiscoverer
{
	private List<String> entries;
	private ArchiveReader reader;
	private TarballSpec spec;
	private Configuration conf;
	private Logger log = LogConfigurator.getOne(this.getClass()).configure(true);

	public SourceDiscoverer(ArchiveReader reader, TarballSpec spec) throws ConfigurationReadException
	{
		this.reader = reader;
		this.spec = spec;
		entries = reader.getEntries();
		Constants c = Constants.getOne();
		conf = Configuration.load(Strings.getOne().safeConcatPaths(c.getConstant("conf.path"), c.getConstant("conf.sourcediscover")));
	}

	public void setPackageName(String packageName)
	{
		spec.setPackageName(packageName);
	}

	public void setVersion(String version)
	{
		spec.setVersion(version);
	}

	public TreeSet<Treenode> discover() throws IOException
	{
		long start = time();
		TreeSet<Treenode> ret;

		if (!reader.hasRead())
		{
			start = time();
			reader.readEntries();
			log.debug("Read all entries: " + TimeSpan.format(time() - start, TimeSpan.MILLISECOND));
		}
		log.debug("Inizializzo il treeset");
		ret = initTreeSet();

		start = time();

		Iterator<Treenode> it = ret.iterator();
		log.debug("Itero tutti i treenode");
		while (it.hasNext())
		{
			Treenode tn = it.next();
			log.debug("Tento di riempire il nodo " + tn.getName());
			ArrayList<SrcFile> srcfiles = makeSrcFileList(tn, getFiles(tn.getName()));
			makeInstructionSet(tn, cleanSrcFiles(srcfiles));
			CompilationUnit cu = tn.getAssociatedCU();
			setCompilationUnit(cu, srcfiles);
			log.debug("Dopo aver fatto tutto questo aggiorno la Compilation Unit che ho appena settato sul treenode padre");
			tn.updateCU(cu);
			log.debug("Emerge che il nome della Compilation Unit e la sua versione sono:");
			log.debug(tn.getAssociatedCU().getDummySpec().getPackage().getPackageName());
			log.debug(tn.getAssociatedCU().getDummySpec().getPackage().getVersion());
		}
		log.debug("Una volta processati tutti i nodi setto il DummySpec");
		spec.map(getGlobalDummySpec(ret));
		log.debug(spec);
		log.debug("Tempo impiegato: " + TimeSpan.format(time() - start, TimeSpan.MILLISECOND));
		return ret;
	}

	private long time()
	{
		return Calendar.getInstance().getTimeInMillis();
	}

	private ArrayList<String> getFiles(String directory)
	{
		ArrayList<String> ret = new ArrayList<String>();
		TreeSet<String> files = new TreeSet<String>(entries);
		int dirsplitlen = directory.split("/").length;
		Iterator<String> it = files.iterator();
		while (it.hasNext())
		{
			String entry = it.next();
			if (entry.startsWith(directory) && !entry.equalsIgnoreCase(directory) && ((dirsplitlen + 1) == entry.split("/").length) && !isDirectory(entry))
			{
				ret.add(entry);
			}
		}
		return ret;
	}

	private TreeSet<Treenode> initTreeSet()
	{
		TreeSet<Treenode> ret = new TreeSet<Treenode>();
		for (String entry : entries)
		{
			if (isDirectory(entry))
			{
				ret.add(new Treenode(entry));
			}
		}
		if ((entries.size() > 0) && (ret.size() <= 0))
		{
			String dir = entries.get(0);
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
		Iterator<ConfType> it = conf.typesIterator();
		while (it.hasNext())
		{
			ret = it.next().containsNotevole(Strings.getOne().trimDir(file));
			if (ret)
			{
				break;
			}
		}
		return ret;
	}

	private ArrayList<String> getNotableFileLangs(String notablefile)
	{
		ArrayList<String> ret = new ArrayList<String>();
		Iterator<ConfType> it = conf.typesIterator();
		while (it.hasNext())
		{
			ConfType ct = it.next();
			if (ct.containsNotevole(Strings.getOne().trimDir(notablefile)))
			{
				ret.add(ct.getSource());
			}
		}
		return ret;
	}

	private void makeInstructionSet(Treenode tn, ArrayList<SrcFile> files)
	{
		TreeSet<Instruction> instructions = new TreeSet<Instruction>();
		for (SrcFile file : files)
		{
			for (String lang : file.getLangs())
			{
				log.debug("Cicli annidati: Per ogni file su tutti i linguaggi associati for (files) { for (files.linguaggi) { \"" + lang + "\" } }");
				ConfType type = conf.getType(lang);
				if (file.isNotable())
				{
					NotableFile notable = type.getNotableFile(Strings.getOne().trimDir(file.getName()));
					instructions.addAll(type.getInstructionsById(notable.getId()));
					log.debug("Dato che è notevole prendo l'instruction set " + notable.getId() + " dalla configurazione");
				}
				else
				{
					log.debug("Dato che non è notevole prendo l'instruction set 0 dalla configurazione");
					instructions.addAll(type.getInstructionsById(0));
				}
				log.debug("A prescindere prendo l'instruction set -1 dalla configurazione");
				instructions.addAll(type.getInstructionsById(-1));
			}
		}
		General genInfo = conf.getGeneralInfo();
		ArrayList<String> command = new ArrayList<String>();
		String delimiter = ExitCodeControl.getDelimiter(genInfo.getExitCodeControl());
		Iterator<Instruction> it = instructions.descendingIterator();
		log.debug("Aggiungo i comandi di Privilege Excalation quando necessari nell'instruction set");
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
		log.debug("Aggiungo l'istruzione alla Compilation Unit facendo un merge dinamico di tutto l'instruction set");
		tn.getAssociatedCU().addInstruction(Strings.getOne().merge(command, " "), null);
	}

	private ArrayList<SrcFile> makeSrcFileList(Treenode tn, ArrayList<String> files)
	{
		log.debug("Costruisco la lista di SrcFile");
		ArrayList<SrcFile> srcfiles = new ArrayList<SrcFile>();
		for (String file : files)
		{
			SrcFile srcfile = makeSrcFile(file);
			if (srcfile.isNotable() || (srcfile.getLangs().size() > 0))
			{
				log.debug("Il file è buono quindi setto la Compilation Unit");
				tn.setIsCU(true);
				tn.getAssociatedCU().addCUFile(srcfile);
				tn.getAssociatedCU().addAllLangs(srcfile.getLangs());
				srcfiles.add(srcfile);
			}
		}
		return srcfiles;
	}

	private ArrayList<SrcFile> cleanSrcFiles(ArrayList<SrcFile> srcfiles)
	{
		log.debug("Pulisco la lista di SrcFiles dagli oggetti inutili (non-notevoli e non-linguaggi)");
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
		log.debug("Creo e valorizzo il SrcFile con nome \"" + file + "\"");
		SrcFile srcfile = new SrcFile();
		srcfile.setName(file);
		srcfile.setNotable(isFileParticolare(file));
		log.debug("Il file" + (srcfile.isNotable() ? " " : " non ") + "è notevole");
		String content = reader.getEntryContent(file);
		log.debug("Setto il contenuto del file");
		srcfile.setContent(content);
		if (srcfile.isNotable())
		{
			log.debug("Dato che è notevole trovo tutti i linguaggi per i quali è notevole");
			srcfile.addAllLangs(getNotableFileLangs(file));
			log.debug("che sono:\n" + srcfile.getLangs());
		}
		else
		{
			//TODO: Change this code to implement the parse engine
			log.debug("Dato che non è notevole devo usare altri metodi per verificare che file è");
			Iterator<ConfType> typeit = conf.typesIterator();
			AntlrEngine parser;
			while (typeit.hasNext())
			{
				ConfType type = typeit.next();
				log.debug("Provo col tipo " + type.getSource());
				try
				{
					if (Strings.getOne().checkExtensions(file, type.getExts()))
					{
						log.debug("Il file ricade nelle estensioni del tipo, quindi posso provare il parsing con l'ebnf " + type.getGrammar());
						parser = new AntlrEngine(type.getGrammar(), type.getSource());
						if (parser.process(content))
						{
							log.debug("Sono riuscito a parsare il contenuto! Il file è di tipo \"" + type.getSource() + "\" e i suoi imports sono:\n" + parser.getImports());
							srcfile.addLang(type.getSource());
							srcfile.addAllIncludes(parser.getImports());
						}
					}
				}
				catch (ExtensionDecodingException e)
				{
					ErrorHandler.getOne(getClass()).handle(e);
				}
				catch (MalformedURLException e)
				{
					ErrorHandler.getOne(getClass()).handle(e);
				}
				catch (FileNotFoundException e)
				{
					ErrorHandler.getOne(getClass()).handle(e);
				}
				catch (ConfigurationReadException e)
				{
					ErrorHandler.getOne(getClass()).handle(e);
				}
				catch (IOException e)
				{
					ErrorHandler.getOne(getClass()).handle(e);
				}
			}
		}
		return srcfile;
	}

	private void setCompilationUnit(CompilationUnit cu, ArrayList<SrcFile> files)
	{
		log.debug("Setto la Compilation Unit con " + files.size() + " SrcFile(s), di questi scelgo solo quelli notevoli");
		for (SrcFile file : files)
		{
			if (file.isNotable())
			{
				for (String lang : file.getLangs())
				{
					log.debug("Controllo se il file notevole contiene informazioni additive nel linguaggio " + lang);
					ConfType type = conf.getType(lang);
					ArrayList<Additive> additives = new ArrayList<Additive>();
					NotableFile notable = type.getNotableFile(Strings.getOne().trimDir(file.getName()));
					additives = type.getAdditivesById(notable.getId());

					log.debug("A questo punto devo fare una cosa particolare: dato che gli additives sono categorizzati, devo intanto dividerli per categoria");
					Iterator<Entry<InfoType, ArrayList<Additive>>> it;
					it = getTypedAdditives(additives).entrySet().iterator();
					while (it.hasNext())
					{
						Entry<InfoType, ArrayList<Additive>> elem = it.next();
						log.debug("Poi per ogni tipo di additive prendo tutti quelli della categoria " + elem.getKey() + " e trovo quale risulta essere il migliore");
						String best = getBestScore(elem.getValue(), file);
						log.debug("La parte importante arriva qui: setto il payload nell'attributo specifico a seconda del tipo di additive che ho processato");
						switch (elem.getKey())
						{
							case PackageName:
							{
								log.debug("Setto " + elem.getKey() + " come " + best);
								cu.getDummySpec().setPackageName(best);
								break;
							}
							case Version:
							{
								log.debug("Setto " + elem.getKey() + " come " + best);
								cu.getDummySpec().setVersion(best);
								break;
							}
							case Changelog:
							{
								log.debug("Setto " + elem.getKey());
								cu.getDummySpec().setChangeLog(best);
							}
							case InfoPage:
							case ManPage:
							case Readme:
							{
								log.debug("Setto " + elem.getKey() + " come " + file.getName());
								cu.getDummySpec().addDocFile(file.getName(), best);
								break;
							}
						}
					}
				}
			}
		}
	}

	private String getBestScore(ArrayList<Additive> additives, SrcFile file)
	{
		String ret = "";
		log.debug("Istanzio un EntriesScorer, cioè un oggetto che sa trovare il più (o meno) presente tra gli elementi che gli vengono passati");
		EntriesScorer<String> es = new EntriesScorer<String>(true);
		log.debug("L'algoritmo lavora in modo da ottenere l'output del metodo che l'additive deve eseguire sul file per trovare il suo payload");
		log.debug("Poi il payload viene inserito nell'EntriesScorer che analizza quale payload sia più presente, e lo segnala come più plausibile");
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

	private HashMap<InfoType, ArrayList<Additive>> getTypedAdditives(ArrayList<Additive> additives)
	{
		HashMap<InfoType, ArrayList<Additive>> typedAdditives;
		typedAdditives = new HashMap<InfoType, ArrayList<Additive>>();
		log.debug("Riempio un HashMap<InfoType, ArrayList<Additive>> che divida i set di Additive in categorie");
		for (Additive additive : additives)
		{
			if (!typedAdditives.containsKey(additive.getInfoType()))
			{
				typedAdditives.put(additive.getInfoType(), new ArrayList<Additive>());
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
		log.warn("PORK AROUND!!!");
		log.debug("Ciclo nuovamente il treeset, sta volta controllo che il treenode sia una CU, visto che ho trovato il dato");
		log.debug("Se è una CU prendo il suo DummySpec e da quello prendo il packageName e la versione");
		log.debug("Passo questi dati a due EntriesScorer settati apposta per poter capire qual'è il nome del software, tra tutte le CU");
		while (it.hasNext())
		{
			Treenode tn = it.next();
			if (tn.isCU())
			{
				DummySpec ds = tn.getAssociatedCU().getDummySpec();
				namesEs.add(ds.getPackage().getPackageName());
				versEs.add(ds.getPackage().getVersion());
				ret.setChangeLog(((ds.getChangeLog() == null ? "" : ds.getChangeLog()).isEmpty() ? ret.getChangeLog() : ds.getChangeLog()));
			}
		}
		log.debug("E in fine setto il best dei due EntriesScorer");
		ret.setPackageName(namesEs.getBestScore().getKey());
		ret.setVersion(versEs.getBestScore().getKey());
		return ret;
	}
}
