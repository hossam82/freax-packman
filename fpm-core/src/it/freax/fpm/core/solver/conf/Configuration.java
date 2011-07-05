package it.freax.fpm.core.solver.conf;

import it.freax.fpm.core.types.ExitCodeControl;
import it.freax.fpm.core.types.InfoType;
import it.freax.fpm.core.types.RootExecution;
import it.freax.fpm.core.types.WhereToParseType;
import it.freax.fpm.util.Streams;
import it.freax.fpm.util.Strings;

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

	public static Configuration load(String conf_path) throws FileNotFoundException
	{
		Configuration conf = new Configuration();
		conf.types = new ArrayList<ConfType>();
		conf.generalInfo = new General();

		InputStream is = Streams.getOne(conf_path).getResource();
		if (is != null)
		{
			SAXBuilder builder = new SAXBuilder();
			Document document = null;
			try
			{
				document = builder.build(is);
			}
			catch (JDOMException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}

			Element root = document.getRootElement();
			conf.generalInfo = makeGeneralInfo(root);

			Iterator<Element> iterator = getChildrenIteratorIgnoreCase(root, "type");
			while (iterator.hasNext())
			{
				conf.types.add(makeType(iterator.next()));
			}
		}
		return conf;
	}

	private static General makeGeneralInfo(Element conf)
	{
		General ret = new General();
		Element genInf = getChildIgnoreCase(conf, "general");
		String re = getAttributeValueIgnoreCase(genInf, "rootExec", "expect");
		String ecc = getAttributeValueIgnoreCase(genInf, "exitCodeControl", "strong");
		ret.setRootExec(RootExecution.parseRootExecution(re));
		ret.setExitCodeControl(ExitCodeControl.parseExitCodeControl(ecc));
		return ret;
	}

	private static ConfType makeType(Element type)
	{
		ConfType ret = new ConfType();
		ret.setSource(getAttributeValueIgnoreCase(type, "src"));
		ret.setEbnf(getAttributeValueIgnoreCase(type, "ebnf"));
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
