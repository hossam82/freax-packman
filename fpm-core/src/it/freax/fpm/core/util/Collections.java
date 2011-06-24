/**
 * 
 */
package it.freax.fpm.core.util;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author kLeZ-hAcK
 */
public class Collections<E>
{
	private Collection<E> coll;

	public Collections(Collection<E> coll)
	{
		this.coll = coll;
	}

	public Collections(E[] arr)
	{
		coll = Arrays.asList(arr);
	}

	public static <E> Collections<E> getOne(Collection<E> coll)
	{
		return new Collections<E>(coll);
	}

	public static <E> Collections<E> getOne(E[] arr)
	{
		return new Collections<E>(arr);
	}

	public Collection<E> getCollection()
	{
		return coll;
	}

	@SuppressWarnings("unchecked")
	public <T extends Collection<E>> T cast()
	{
		return (T) coll;
	}

	private <T extends Collection<E>> T fill(T instance)
	{
		Iterator<E> it = coll.iterator();
		while (it.hasNext())
		{
			instance.add(it.next());
		}
		return instance;
	}

	public List<E> toList()
	{
		return fill(new ArrayList<E>());
	}

	public Set<E> toSet()
	{
		return fill(new HashSet<E>());
	}

	public Queue<E> toQueue()
	{
		return fill(new ConcurrentLinkedQueue<E>());
	}

	@SuppressWarnings("unchecked")
	public E[] toArray()
	{
		return (E[]) ((ArrayList<E>) toList()).toArray();
	}

	public <T> Collection<T> castAll()
	{
		Collections<T> ret = Collections.getOne(new ArrayList<T>());
		Generics<E> g = Generics.getOne();
		for (E element : coll)
		{
			ret.add(g.<T> cast(element));
		}
		return ret.getCollection();
	}

	public void add(E e)
	{
		coll.add(e);
	}

	public E first()
	{
		return get(0);
	}

	public E firstOrDefault(E defaultArg)
	{
		return (coll.isEmpty() || (first() == null) ? defaultArg : first());
	}

	public E firstOrDefault()
	{
		return firstOrDefault(Generics.<E> getOne().getInstance());
	}

	public E lastOrDefault(E defaultArg)
	{
		return (coll.isEmpty() ? defaultArg : last());
	}

	public E lastOrDefault()
	{
		return lastOrDefault(Generics.<E> getOne().getInstance());
	}

	public E last()
	{
		return get(coll.size() - 1);
	}

	public E getOrDefault(int index, E defaultArg)
	{
		return (coll.isEmpty() || (get(index) == null) ? defaultArg : get(index));
	}

	public E get(int index)
	{
		int counter = 0;
		E ret = null;
		Iterator<E> it = coll.iterator();
		if (it.hasNext())
		{
			do
			{
				ret = it.next();
			}
			while ((counter != index) || it.hasNext());
		}
		return ret;
	}

	public boolean isNullOrEmpty()
	{
		boolean ret = true;
		if ((coll != null) && !coll.isEmpty())
		{
			ret = false;
		}
		return ret;
	}
}
