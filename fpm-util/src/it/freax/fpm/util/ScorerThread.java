package it.freax.fpm.util;

import java.util.Map.Entry;
import java.util.ArrayList;

public class ScorerThread<K, V> implements Runnable
{
	private Entry<K, ArrayList<V>> entry;
	private EntriesScorer<V> scorer;
	private Entry<K, V> best;
	private Integer bestScore;

	public ScorerThread(Entry<K, ArrayList<V>> entry, boolean maxCounter)
	{
		this.entry = entry;
		this.scorer = new EntriesScorer<V>(maxCounter);
	}

	public void executeAsync()
	{
		Thread t = new Thread(this);
		t.start();
	}

	public void executeSync()
	{
		this.run();
	}

	@Override
	public void run()
	{
		for (V v : this.entry.getValue())
		{
			this.scorer.add(v);
		}
		Entry<V, Integer> bestScore = this.scorer.getBestScore();
		this.best = new MapEntry<K, V>(this.entry.getKey(), bestScore.getKey());
		this.bestScore = bestScore.getValue();
	}

	public Entry<K, V> getBest()
	{
		return this.best;
	}

	public Integer getBestScore()
	{
		return this.bestScore;
	}
}
