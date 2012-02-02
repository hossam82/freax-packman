/**
 * 
 */
package it.freax.fpm.util;

import java.util.*;

/**
 * @author kLeZ-hAcK
 * 
 */
public class LinearDictionary<K, V> implements Map<K, V>, Iterable<MapEntry<K, V>>
{
	private ArrayList<MapEntry<K, V>> _map = new ArrayList<MapEntry<K, V>>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#size()
	 */
	@Override
	public int size()
	{
		return _map.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#isEmpty()
	 */
	@Override
	public boolean isEmpty()
	{
		return _map.isEmpty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#containsKey(java.lang.Object)
	 */
	@Override
	public boolean containsKey(Object key)
	{
		boolean ret = false;
		if (key != null)
		{
			for (MapEntry<K, V> entry : _map)
			{
				if (ret = entry.getKey().equals(key))
				{
					break;
				}
			}
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#containsValue(java.lang.Object)
	 */
	@Override
	public boolean containsValue(Object value)
	{
		boolean ret = false;
		for (MapEntry<K, V> entry : _map)
		{
			if (ret = entry.getValue().equals(value))
			{
				break;
			}
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#get(java.lang.Object)
	 */
	@Override
	public V get(Object key)
	{
		V ret = null;
		if (containsKey(key))
		{
			for (int i = 0; i < size(); i++)
			{
				if (_map.get(i).getKey().equals(key))
				{
					ret = _map.get(i).getValue();
					break;
				}
			}
		}
		return ret;
	}

	public MapEntry<K, V> getPair(Object key)
	{
		MapEntry<K, V> ret = null;
		if (containsKey(key))
		{
			for (int i = 0; i < size(); i++)
			{
				if (_map.get(i).getKey().equals(key))
				{
					ret = _map.get(i);
					break;
				}
			}
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#put(java.lang.Object, java.lang.Object)
	 */
	@Override
	public V put(K key, V value)
	{
		if (!containsKey(key))
		{
			_map.add(new MapEntry<K, V>(key, value));
			return value;
		}
		else
		{
			return get(key);
		}
	}

	public V add(MapEntry<K, V> entry)
	{
		return put(entry.getKey(), entry.getValue());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#remove(java.lang.Object)
	 */
	@Override
	public V remove(Object key)
	{
		V ret = null;
		for (int i = 0; i < size(); i++)
		{
			if (_map.get(i).getKey().equals(key))
			{
				ret = _map.remove(i).getValue();
				break;
			}
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#putAll(java.util.Map)
	 */
	@Override
	public void putAll(Map<? extends K, ? extends V> m)
	{
		for (Entry<? extends K, ? extends V> entry : m.entrySet())
		{
			put(entry.getKey(), entry.getValue());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#clear()
	 */
	@Override
	public void clear()
	{
		_map.clear();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#keySet()
	 */
	@Override
	public Set<K> keySet()
	{
		Set<K> ret = new HashSet<K>();
		for (int i = 0; i < size(); i++)
		{
			ret.add(_map.get(i).getKey());
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#values()
	 */
	@Override
	public Collection<V> values()
	{
		Collection<V> ret = new ArrayList<V>();
		for (int i = 0; i < size(); i++)
		{
			ret.add(_map.get(i).getValue());
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#entrySet()
	 */
	@Override
	public Set<Entry<K, V>> entrySet()
	{
		Set<Entry<K, V>> ret = new HashSet<Entry<K, V>>();
		for (int i = 0; i < size(); i++)
		{
			ret.add(_map.get(i));
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<MapEntry<K, V>> iterator()
	{
		return _map.iterator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for (MapEntry<K, V> entry : _map)
		{
			sb.append(entry.getKey()).append(" = ").append(entry.getValue());
			sb.append(System.getProperty("line.separator"));
		}
		return sb.toString();
	}
}
