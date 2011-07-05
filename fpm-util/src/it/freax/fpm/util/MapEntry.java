package it.freax.fpm.util;

import java.util.Map.Entry;

public class MapEntry<K, V> implements Entry<K, V>
{
	private K key;
	private V value;

	public MapEntry(K key, V value)
	{
		this.key = key;
		this.value = value;
	}

	public MapEntry(Entry<K, V> entry)
	{
		this.key = entry.getKey();
		this.value = entry.getValue();
	}

	@Override
	public K getKey()
	{
		return this.key;
	}

	@Override
	public V getValue()
	{
		return this.value;
	}

	@Override
	public V setValue(V value)
	{
		this.value = value;
		return this.value;
	}

}
