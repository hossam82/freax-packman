/**
 * 
 */
package it.freax.fpm.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author kLeZ-hAcK
 * 
 */
public class EbnfReader
{
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
		for (String line : lines)
		{
			// If it is not a comment ->
			if (!(line.startsWith("{[\t") && line.endsWith("\t]}")))
			{
				String key = sh.getStringFromKeyValue(line, fs, true);
				String value = sh.getStringFromKeyValue(line, fs, false);
				map.put(key, value);
			}
		}
	}

	public void buildTree()
	{
		if ((map == null) || map.isEmpty())
		{
			buildMap();
		}

		findroot();

		for (Entry<String, String> entry : map.entrySet())
		{
			addnode(entry);
		}
	}

	private void addnode(Entry<String, String> entry)
	{
		// inserire un nodo significa inserire l'elemento nell'albero,
		// come foglia di un elemento padre, da rintracciare nella mappa

		// l'unico modo per vedere se una chiave è figlia di un'altra chiave è
		// trovare la chiave all'interno di un valore tra i nodi già presenti
		// se viene trovata, impostare la foglia altrimenti impostare una
		// foglia sulla root corrente
	}

	private void findroot()
	{
		if (tree != null) { return; }
		MapEntry<String, String> root = null;
		// è root l'unico elemento chiave che non è anche un valore
		Collections<String> values = Collections.getOne(map.values());
		for (String key : map.keySet())
		{
			boolean breakfor = true;
			String value = "";
			for (int i = 0; i < values.size(); i++)
			{
				value = values.get(i);
				if (value.contains(key))
				{
					breakfor = false;
					break;
				}
			}
			if (breakfor)
			{
				root = new MapEntry<String, String>(key, value);
				break;
			}
		}
		tree = new Tree<MapEntry<String, String>>(root);
	}
}
