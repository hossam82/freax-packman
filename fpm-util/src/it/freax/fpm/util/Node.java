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
public class Node<T> implements Iterable<Node<T>>
{
	private Node<T> Parent = null;
	private List<Node<T>> Childs = new ArrayList<Node<T>>();
	private T data = null;

	public Node(T data)
	{
		this(data, null);
	}

	public Node(T data, Node<T> parent)
	{
		this.data = data;
		Parent = parent;
	}

	public T getData()
	{
		return data;
	}

	public Node<T> getParent()
	{
		return Parent;
	}

	public Node<T> add(Node<T> child)
	{
		child.Parent = this;
		Childs.add(child);
		return child;
	}

	public Node<T> add(T data)
	{
		return add(new Node<T>(data, this));
	}

	public void remove(int index)
	{
		Childs.remove(index);
	}

	public void remove(T data)
	{
		Childs.remove(new Node<T>(data, this));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Node<T>> iterator()
	{
		return Childs.iterator();
	}

	public boolean has(T otherData)
	{
		boolean ret = false;
		if (!Childs.isEmpty())
		{
			for (Node<T> child : Childs)
			{
				ret |= child.data.equals(otherData);
			}
		}
		else if (data != null)
		{
			ret = data.equals(otherData);
		}
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
		sb.append("{ ");
		sb.append(data);

		if (Parent != null)
		{
			sb.append(LF);
			sb.append("Parent: < ").append(Parent.data).append(" >");
		}
		if (!Childs.isEmpty())
		{
			sb.append(LF);
			sb.append('[');
			for (int i = 0; i < Childs.size(); i++)
			{
				Node<T> child = Childs.get(i);
				sb.append(child);
				if (i + 1 < Childs.size())
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
