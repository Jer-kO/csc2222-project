package adapters;

import main.support.SetInterface;

import java.util.concurrent.ConcurrentSkipListMap;

import main.support.KSTNode;
import main.support.OperationListener;
import main.support.Random;

/**
 *
 * @author Jeremy
 */
public class SkipListAdapter<K extends Comparable<? super K>> extends AbstractAdapter<K> implements SetInterface<K> {
	ConcurrentSkipListMap<K, K> skipList = new ConcurrentSkipListMap<K, K>();

	public boolean contains(K key) {
		return skipList.containsKey(key);
	}

	@Override
	public boolean add(K key, Random rng, final int[] metrics) {
		// return tree.putIfAbsent(key, key) == null;
		return skipList.put(key, key) == null;
	}

	public boolean add(K key, Random rng) {
		return add(key, rng, null);
	}

	public K get(K key) {
		return skipList.get(key);
	}

	@Override
	public boolean remove(K key, Random rng, final int[] metrics) {
		return skipList.remove(key) != null;
	}

	public boolean remove(K key, Random rng) {
		return remove(key, rng, null);
	}

	public void addListener(OperationListener l) {
	}

	public int size() {
		return sequentialSize();
	}

	public KSTNode<K> getRoot() {
		return null;
	}

	public int getSumOfDepths() {
		return 0;
	}

	public int sequentialSize() {
		return skipList.size();
	}

}
