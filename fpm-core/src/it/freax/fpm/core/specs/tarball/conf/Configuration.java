package it.freax.fpm.core.specs.tarball.conf;

import it.freax.fpm.core.specs.tarball.types.ExitCodeControlType;
import it.freax.fpm.core.specs.tarball.types.InfoType;
import it.freax.fpm.core.specs.tarball.types.RootExecutionType;
import it.freax.fpm.core.specs.tarball.types.WhereToParseType;
import it.freax.fpm.util.ErrorHandler;
import it.freax.fpm.util.Streams;
import it.freax.fpm.util.Strings;
import it.freax.fpm.util.exceptions.ConfigurationReadException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class Configuration
{
	private General generalInfo;
	private ArrayList<ConfType> types;

	public Iterator<ConfType> typesIterator()
	{
		return types.iterator();
	}

	public static Configuration load(String conf_path) throws ConfigurationReadException
	{
		Configuration conf = new Configuration();
		conf.types = new ArrayList<ConfType>();
		conf.generalInfo = new General();

		InputStream is;

		try
		{
			is = Streams.getOne(conf_path).getResource();
			if (is != null)
			{
				SAXBuilder builder = new SAXBuilder();
				Document document = null;
				document = builder.build(is);

				Element root = document.getRootElement();
				conf.generalInfo = makeGeneralInfo(root);

				Iterator<Element> iterator = getChildrenIteratorIgnoreCase(root, "type");
				while (iterator.hasNext())
				{
					conf.types.add(makeType(iterator.next()));
				}
			}
		}
		catch (FileNotFoundException e)
		{
			throw ErrorHandler.getOne(conf.getClass()).<ConfigurationReadException> rethrow(e.getMessage(), e);
		}
		catch (JDOMException e)
		{
			throw ErrorHandler.getOne(conf.getClass()).<ConfigurationReadException> rethrow(e.getMessage(), e);
		}
		catch (IOException e)
		{
			throw ErrorHandler.getOne(conf.getClass()).<ConfigurationReadException> rethrow(e.getMessage(), e);
		}
		return conf;
	}

	private static General makeGeneralInfo(Element conf)
	{
		General ret = new General();
		Element genInf = getChildIgnoreCase(conf, "general");
		String re = getAttributeValueIgnoreCase(genInf, "rootExec", "expect");
		String ecc = getAttributeValueIgnoreCase(genInf, "exitCodeControl", "strong");
		ret.setRootExec(RootExecutionType.parseRootExecution(re));
		ret.setExitCodeControl(ExitCodeControlType.parseExitCodeControl(ecc));
		return ret;
	}

	private static ConfType makeType(Element type)
	{
		ConfType ret = new ConfType();
		ret.setSource(getAttributeValueIgnoreCase(type, "src"));
		ret.setGrammar(getAttributeValueIgnoreCase(type, "grammar"));
		ret.setExts(Strings.getOne().split(getAttributeValueIgnoreCase(type, "ext"), ":"));
		ret.setCompiler_opts(getAttributeValueIgnoreCase(type, "opts"));

		Iterator<Element> ntblit = getChildrenIteratorIgnoreCase(getChildIgnoreCase(type, "notevoli"), "file");
		while (ntblit.hasNext())
		{
			ret.addNotable(makeNotable(ntblit.next()));
		}

		Iterator<Element> isit = getChildrenIteratorIgnoreCase(getChildIgnoreCase(type, "instructionSet"), "instruction");
		while (isit.hasNext())
		{
			ret.addInstruction(makeInstruction(isit.next()));
		}

		Iterator<Element> addit = getChildrenIteratorIgnoreCase(getChildIgnoreCase(type, "additives"), "additive");
		while (addit.hasNext())
		{
			ret.addAdditive(makeAdditive(addit.next()));
		}
		return ret;
	}

	private static NotableFile makeNotable(Element notable)
	{
		int id = Integer.parseInt(getAttributeValueIgnoreCase(notable, "id"));
		String name = getAttributeValueIgnoreCase(notable, "name");
		return new NotableFile(id, name);
	}

	private static Instruction makeInstruction(Element instruction)
	{
		int id = Integer.parseInt(getAttributeValueIgnoreCase(instruction, "id"));
		String action = getAttributeValueIgnoreCase(instruction, "action");
		String permissions = getAttributeValueIgnoreCase(instruction, "permissions");
		return new Instruction(id, action, permissions);
	}

	private static Additive makeAdditive(Element additive)
	{
		int id = Integer.parseInt(getAttributeValueIgnoreCase(additive, "id"));
		String infotype = getAttributeValueIgnoreCase(additive, "infotype");
		String wheretoparse = getAttributeValueIgnoreCase(additive, "wheretoparse");
		String whattoparse = getAttributeValueIgnoreCase(additive, "whattoparse");
		String howtoparse = getAttributeValueIgnoreCase(additive, "howtoparse");
		InfoType it = InfoType.valueOf(infotype);
		WhereToParseType wtpt = WhereToParseType.valueOf(wheretoparse);
		return new Additive(id, it, wtpt, whattoparse, howtoparse);
	}

	public ConfType getType(String lang)
	{
		ConfType ret = null;
		Iterator<ConfType> it = typesIterator();
		while (it.hasNext())
		{
			ConfType type = it.next();
			if (type.getSource().equalsIgnoreCase(lang))
			{
				ret = type;
			}
		}
		return ret;
	}

	public General getGeneralInfo()
	{
		return generalInfo;
	}

	public void setGeneralInfo(General generalInfo)
	{
		this.generalInfo = generalInfo;
	}

	private static String getAttributeValueIgnoreCase(Element el, String tag)
	{
		return getAttributeValueIgnoreCase(el, tag, null);
	}

	private static String getAttributeValueIgnoreCase(Element el, String tag, String def)
	{
		String ret = el.getAttributeValue(tag);
		if ((ret == null) || ret.isEmpty())
		{
			ret = el.getAttributeValue(tag.toLowerCase());
		}
		if ((ret == null) || ret.isEmpty())
		{
			ret = el.getAttributeValue(tag.toUpperCase());
		}
		if ((ret == null) || ret.isEmpty())
		{
			ret = def;
		}
		return ret;
	}

	private static Element getChildIgnoreCase(Element parent, String name)
	{
		Element ret = parent.getChild(name);
		if (ret == null)
		{
			ret = parent.getChild(name.toLowerCase());
		}
		if (ret == null)
		{
			ret = parent.getChild(name.toUpperCase());
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	private static Iterator<Element> getChildrenIteratorIgnoreCase(Element parent, String name)
	{
		Iterator<Element> ret = parent.getChildren(name).iterator();
		if (ret == null)
		{
			ret = parent.getChildren(name.toLowerCase()).iterator();
		}
		if (ret == null)
		{
			ret = parent.getChildren(name.toUpperCase()).iterator();
		}
		return ret;
	}
}
