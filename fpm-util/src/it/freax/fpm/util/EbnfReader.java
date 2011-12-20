/**
 * 
 */
package it.freax.fpm.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

/**
 * @author kLeZ-hAcK
 * 
 */
public class EbnfReader
{
	private final Logger log = LogConfigurator.getOne(getClass()).configure();
	private String content;
	private HashMap<String, String> map;
	private Tree<MapEntry<String, String>> tree;

	public EbnfReader(String content)
	{
		this.content = content;
		buildTree();
	}

	public String getContent()
	{
		return content;
	}

	public HashMap<String, String> getMap()
	{
		return map;
	}

	public Tree<MapEntry<String, String>> getTree()
	{
		return tree;
	}

	public void buildMap()
	{
		map = new HashMap<String, String>();
		Strings sh = Strings.getOne();
		String fs = "::=";
		List<String> lines = sh.getLines(content);
		int count = 0;
		boolean keyok = false;
		String currentline = "";

		try
		{
			for (String line : lines)
			{
				currentline = line;
				keyok = false;
				// If it is not a comment ->
				if (!(line.startsWith("{[\t") && line.endsWith("\t]}")))
				{
					String key = sh.getStringFromKeyValue(line, fs, true);
					keyok = true;
					String value = sh.getStringFromKeyValue(line, fs, false);
					MapEntry<String, String> me;
					me = new MapEntry<String, String>(key, value);
					if (!map.entrySet().contains(me))
					{
						map.put(key.trim(), value.trim());
					}
				}
				count++;
			}
		}
		catch (Exception e)
		{
			StringBuilder sb = new StringBuilder();
			sb.append("Read " + count + " lines of " + lines.size()).append(Constants.LS);
			sb.append("Broken in the value getter: " + keyok);
			sb.append(" at the line (non-blank) " + ++count).append(Constants.LS);
			sb.append("Current line is:").append(Constants.LS);
			sb.append(currentline).append(Constants.LS);
			log.error(sb.toString(), e);
		}
	}

	public void buildTree()
	{
		if ((map == null) || map.isEmpty())
		{
			buildMap();
		}
		tree = new Tree<MapEntry<String, String>>(findroot());
		tree = addnode(tree, null);
	}

	private Tree<MapEntry<String, String>> addnode(Tree<MapEntry<String, String>> root, MapEntry<String, String> entry)
	{
		Tree<MapEntry<String, String>> newroot = null;
		PairList<String, String> childs = null;
		if (entry != null)
		{
			if (!root.contains(entry))
			{
				newroot = root.addLeaf(entry);
			}
		}
		else
		{
			newroot = root;
		}

		if (newroot != null)
		{
			childs = findchilds(newroot.getHead());

			if (!childs.isEmpty())
			{
				for (MapEntry<String, String> child : childs)
				{
					root = addnode(newroot, child);
				}
			}
		}
		log.debug("Printing the temporal status of the tree.");
		log.debug("\n" + root.toString());
		return root;
	}

	private PairList<String, String> findchilds(MapEntry<String, String> entry)
	{
		PairList<String, String> ret = new PairList<String, String>();
		for (Entry<String, String> mapentry : map.entrySet())
		{
			if (entry.getValue().contains(mapentry.getKey()) && !entry.equals(mapentry))
			{
				ret.add(new MapEntry<String, String>(mapentry));
			}
		}
		return ret;
	}

	private MapEntry<String, String> findroot()
	{
		MapEntry<String, String> root = null;
		// è root l'unico elemento chiave che non è anche un valore
		Collections<String> values = Collections.getOne(map.values());
		for (Entry<String, String> entry : map.entrySet())
		{
			boolean breakfor = true;
			String value = "";
			for (int i = 0; i < values.size(); i++)
			{
				value = values.get(i);
				if (value.contains(entry.getKey()))
				{
					breakfor = false;
					break;
				}
			}
			if (breakfor)
			{
				root = new MapEntry<String, String>(entry);
				break;
			}
		}
		return root;
	}
}
