/**
 * 
 */
package it.freax.fpm.util;

import java.util.*;
import java.util.concurrent.*;

/**
 * @author kLeZ-hAcK
 */
public class FpmCollections<E>
{
	public static final int LastIndex = -2;

	private Collection<E> coll;

	public FpmCollections(Collection<E> coll)
	{
		this.coll = coll;
	}

	public FpmCollections(E[] arr)
	{
		coll = Arrays.asList(arr);
	}

	public static <E> FpmCollections<E> getOne(Collection<E> coll)
	{
		return new FpmCollections<E>(coll);
	}

	public static <E> FpmCollections<E> getOne(E[] arr)
	{
		return new FpmCollections<E>(arr);
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

	public E[] toArray(E[] arr)
	{
		return toList().toArray(arr);
	}

	public <T> Collection<T> castAll()
	{
		FpmCollections<T> ret = FpmCollections.getOne(new ArrayList<T>());
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

	public void addAll(Collection<E> c)
	{
		coll.addAll(c);
	}

	public void insert(E e, int position)
	{
		Collection<E> prefix;
		Collection<E> postfix;
		if (position > 0)
		{
			prefix = sublist(0, position - 1);
			postfix = sublist(position, lastIndex());
		}
		else
		{
			prefix = new ArrayList<E>();
			postfix = coll;
		}
		coll = new ArrayList<E>();
		if (position <= size())
		{
			addAll(prefix);
			add(e);
			addAll(postfix);
		}
		else
		{
			add(e);
		}
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
		return (isNullOrEmpty() ? null : get(lastIndex()));
	}

	public E getOrDefault(int index, E defaultArg)
	{
		return (coll.isEmpty() || (get(index) == null) ? defaultArg : get(index));
	}

	public E get(int index)
	{
		return toList().get(index);
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

	public int size()
	{
		return coll.size();
	}

	public int lastIndex()
	{
		return coll.size() - 1;
	}

	public List<E> sublist(int fromIndex, int toIndex)
	{
		if (toIndex <= -2)
		{
			toIndex = (toIndex - LastIndex) * -1;
			toIndex = size() - toIndex;
		}
		return toList().subList(fromIndex, toIndex);
	}

	public E[] subarray(int fromIndex, int toIndex, E[] instance)
	{
		return sublist(fromIndex, toIndex).toArray(instance);
	}

	public void clear()
	{
		coll.clear();
	}

	public Collection<String> diffOfStrings(Collection<String> otherColl, boolean byLeft)
	{
		return FpmCollections.getOne(toStringsList()).diff(otherColl, byLeft);
	}

	public Collection<E> diff(Collection<E> otherColl, boolean byLeft)
	{
		Collection<E> ret = new ArrayList<E>();
		Collection<E> listToIterate = (byLeft ? coll : otherColl);
		Collection<E> listToCheck = (byLeft ? otherColl : coll);

		for (E elem : listToIterate)
		{
			if (!listToCheck.contains(elem))
			{
				ret.add(elem);
			}
		}
		return ret;
	}

	@Override
	public String toString()
	{
		return coll.toString();
	}

	public List<String> toStringsList()
	{
		ArrayList<String> ret = new ArrayList<String>();
		for (E elem : coll)
		{
			ret.add(elem.toString());
		}
		return ret;
	}
}
