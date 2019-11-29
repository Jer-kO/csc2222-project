package adapters;

import main.support.SetInterface;
import trees.KLazyBST;
import main.support.KSTNode;
import main.support.OperationListener;
import main.support.Random;

/**
 *
 * @author Jeremy
 */
public class KLazyBSTAdapter<K extends Comparable<? super K>> extends AbstractAdapter<K> implements SetInterface<K> {
	KLazyBST<K, K> tree = new KLazyBST<K, K>();

	public boolean contains(K key) {
		return tree.containsKey(key);
	}

	@Override
	public boolean add(K key, Random rng, final int[] metrics) {
		// return tree.putIfAbsent(key, key) == null;
		return tree.put(key, key) == null;
	}

	public boolean add(K key, Random rng) {
		return add(key, rng, null);
	}

	public K get(K key) {
		return tree.get(key);
	}

	@Override
	public boolean remove(K key, Random rng, final int[] metrics) {
		return tree.remove(key) != null;
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
		return tree.getSumOfDepths();
	}

	public int sequentialSize() {
		return tree.size();
	}

}
