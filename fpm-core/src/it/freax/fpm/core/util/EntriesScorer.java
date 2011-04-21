package it.freax.fpm.core.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class EntriesScorer<E>
{
	private HashMap<E, Integer> entries = new HashMap<E, Integer>();
	private boolean maxCounter = true;

	public EntriesScorer(boolean maxCounter)
	{
		this.maxCounter = maxCounter;
	}

	public boolean isMaxCounter()
	{
		return this.maxCounter;
	}

	public void add(E key)
	{
		if ((key != null) && key.toString().isEmpty())
		{
			Integer value = 0;
			if (this.entries.containsKey(key))
			{
				value = this.entries.get(key);
				this.entries.remove(key);
			}
			this.entries.put(key, ++value);
		}
	}

	public Entry<E, Integer> getBestScore()
	{
		MapEntry<E, Integer> ret = null;
		Iterator<Entry<E, Integer>> it = this.entries.entrySet().iterator();
		boolean greater, equals, lesser;
		boolean keyequals;
		while (it.hasNext())
		{
			if (ret == null)
			{
				ret = new MapEntry<E, Integer>(it.next());
			}
			else
			{
				MapEntry<E, Integer> el = new MapEntry<E, Integer>(it.next());
				greater = (el.getValue() > ret.getValue());
				equals = (el.getValue() == ret.getValue());
				lesser = (el.getValue() < ret.getValue());
				keyequals = el.getKey().equals(ret.getKey());
				if (this.maxCounter)
				{
					if (greater)
					{
						ret = el;
					}
					else if (equals)
					{
						if (!keyequals)
						{
							// caso particolare, prendo ret
						}
					}
					else if (lesser)
					{
						// Nothing
					}
				}
				else
				{
					if (lesser)
					{
						ret = el;
					}
					else if (equals)
					{
						if (!keyequals)
						{
							// caso particolare, prendo ret
						}
					}
					else if (greater)
					{
						// Nothing
					}
				}
			}
		}
		return ret;
	}

	public void reset(boolean maxCounter)
	{
		this.maxCounter = maxCounter;
		this.entries.clear();
	}
}
