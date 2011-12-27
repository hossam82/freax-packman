/**
 * 
 */
package it.freax.fpm.util;

import java.util.List;

import org.apache.log4j.Logger;

/**
 * @author kLeZ-hAcK
 * 
 */
public class EbnfReader
{
	private final Logger log = LogConfigurator.getOne(getClass()).configure();
	private String content;
	private Dictionary<String, String> dict;
	private Node<MapEntry<String, String>> tree;

	public EbnfReader(String content)
	{
		this.content = content;
	}

	public String getContent()
	{
		return content;
	}

	public Dictionary<String, String> getMap()
	{
		return dict;
	}

	public Node<MapEntry<String, String>> getTree()
	{
		return tree;
	}

	public void buildMap()
	{
		dict = new Dictionary<String, String>();
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
					if (!dict.entrySet().contains(me))
					{
						dict.put(key.trim(), value.trim());
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
		if ((dict == null) || dict.isEmpty())
		{
			buildMap();
		}

		tree = filltree(new Node<MapEntry<String, String>>(findroot()), dict);

	}

	public Node<MapEntry<String, String>> filltree(Node<MapEntry<String, String>> node, Dictionary<String, String> dict)
	{
		for (MapEntry<String, String> entry : dict)
		{
			if (node == null)
			{
				node = new Node<MapEntry<String, String>>(entry);
			}
			else if (!node.has(entry))
			{
				node = filltree(node, findchilds(entry));
			}
		}
		return node;
	}

	//	private Tree<MapEntry<String, String>> addnode(Tree<MapEntry<String, String>> root, MapEntry<String, String> entry)
	//	{
	//		Tree<MapEntry<String, String>> newroot = null;
	//		Dictionary<String, String> childs = null;
	//		if (entry != null)
	//		{
	//			if (!root.contains(entry))
	//			{
	//				newroot = root.addLeaf(entry);
	//			}
	//		}
	//		else
	//		{
	//			newroot = root;
	//		}
	//
	//		if (newroot != null)
	//		{
	//			childs = findchilds(newroot.getHead());
	//
	//			if (!childs.isEmpty())
	//			{
	//				for (MapEntry<String, String> child : childs)
	//				{
	//					root = addnode(newroot, child);
	//				}
	//			}
	//		}
	//		log.debug("Printing the temporal status of the tree.");
	//		log.debug("\n" + root.toString());
	//		return root;
	//	}

	private Dictionary<String, String> findchilds(MapEntry<String, String> entry)
	{
		Dictionary<String, String> ret = new Dictionary<String, String>();
		for (MapEntry<String, String> mapentry : dict)
		{
			if (entry.getValue().contains(mapentry.getKey()) && !entry.equals(mapentry))
			{
				ret.add(mapentry);
			}
		}
		return ret;
	}

	private MapEntry<String, String> findroot()
	{
		MapEntry<String, String> root = null;
		// è root l'unico elemento chiave che non è anche un valore
		Collections<String> values = Collections.getOne(dict.values());
		for (MapEntry<String, String> entry : dict)
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
				root = entry;
				break;
			}
		}
		return root;
	}
}
