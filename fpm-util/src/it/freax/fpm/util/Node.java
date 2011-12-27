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
		Childs.add(child);
		return child;
	}

	public Node<T> add(T data)
	{
		return add(new Node<T>(data));
	}

	public void remove(int index)
	{
		Childs.remove(index);
	}

	public void remove(T data)
	{
		Childs.remove(new Node<T>(data));
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
				ret |= child.has(otherData);
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
		// TODO Auto-generated method stub
		return super.toString();
	}
}
