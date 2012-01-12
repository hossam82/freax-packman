/**
 * 
 */
package it.freax.fpm.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author kLeZ-hAcK
 * 
 */
public class PairNode<K, V> implements Iterable<PairNode<K, V>>
{
	private PairNode<K, V> parent = null;
	private List<PairNode<K, V>> childs = new ArrayList<PairNode<K, V>>();
	private MapEntry<K, V> data = null;

	public PairNode(K key, V value)
	{
		this(key, value, null);
	}

	public PairNode(MapEntry<K, V> Data)
	{
		this(Data, null);
	}

	public PairNode(K key, V value, PairNode<K, V> Parent)
	{
		this(new MapEntry<K, V>(key, value), Parent);
	}

	public PairNode(MapEntry<K, V> Data, PairNode<K, V> Parent)
	{
		data = Data;
		parent = Parent;
	}

	public MapEntry<K, V> getData()
	{
		return data;
	}

	public PairNode<K, V> getParent()
	{
		return parent;
	}

	public PairNode<K, V> add(PairNode<K, V> child)
	{
		child.parent = this;
		childs.add(child);
		return child;
	}

	public PairNode<K, V> add(K key, V value)
	{
		return add(new PairNode<K, V>(key, value, this));
	}

	public void remove(int index)
	{
		childs.remove(index);
	}

	public void remove(K key)
	{
		for (int i = 0; i < childs.size(); i++)
		{
			PairNode<K, V> child = childs.get(i);
			if (child.data.getKey().equals(key))
			{
				childs.remove(i);
				break;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<PairNode<K, V>> iterator()
	{
		return childs.iterator();
	}

	public boolean hasKey(K otherKey)
	{
		boolean ret = false;
		if (!childs.isEmpty())
		{
			for (PairNode<K, V> child : childs)
			{
				ret |= child.data.getKey().equals(otherKey);
			}
		}
		else if (data != null)
		{
			ret = data.getKey().equals(otherKey);
		}
		return ret;
	}

	public boolean hasValue(V otherValue)
	{
		boolean ret = false;
		if (!childs.isEmpty())
		{
			for (PairNode<K, V> child : childs)
			{
				ret |= child.data.getValue().equals(otherValue);
			}
		}
		else if (data != null)
		{
			ret = data.getValue().equals(otherValue);
		}
		return ret;
	}

	public boolean isEmpty()
	{
		boolean ret = false;
		ret = (parent == null) && ((childs == null) || childs.isEmpty());
		for (PairNode<K, V> child : childs) ret &= child.isEmpty();
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		String LF = System.getProperty("line.separator");
		StringBuilder sb = new StringBuilder();
		sb.append("{").append(LF);
		sb.append("|-->(").append(data).append(")");

		if (!childs.isEmpty())
		{
			sb.append("|-->[");
			for (int i = 0; i < childs.size(); i++)
			{
				PairNode<K, V> child = childs.get(i);
				sb.append("\t|-->").append(child);
				if (i + 1 < childs.size())
				{
					sb.append(',');
				}
			}
			sb.append(']');
		}
		sb.append(" }");
		return sb.toString();
	}
}
