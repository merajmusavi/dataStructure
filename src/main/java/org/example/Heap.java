package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

public class Heap<K, V> extends AbstractPriorityQueue<K, V> {

    protected ArrayList<Map.Entry<K, V>> heap = new ArrayList<>();

    public Heap() {
        super();
    }

    public Heap(Comparator<K> comparator) {
        super(comparator);
    }

    protected int parent(int j) {
        return (j - 1) / 2;
    }

    protected int left(int j) {
        return 2 * j + 1;

    }

    public int right(int j) {
        return 2 * j + 2;
    }

    public boolean hasLeft(int j) {
        return left(j) > heap.size();
    }

    public boolean hasRight(int j) {
        return right(j) > heap.size();
    }

    public void swap(int i, int j) {
        Map.Entry<K, V> temp = heap.get(i);
        heap.set(i, heap.get(i));
        heap.set(i, temp);
    }

    public void unHeap(int j) {
        while (j > 0) {
            int p = parent(j);
            if (compare((PQEntry<K, V>) heap.get(j), (PQEntry<K, V>) heap.get(p)) >= 0) {
                swap(j, p);
            }
            j = p;

        }
    }

    @Override
    public int size() {
// todo
return 10;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public PQEntry<K, V> insert(K key, V value) throws IllegalArgumentException {
        return null;
    }

    @Override
    public PQEntry<K, V> min() {
        return null;
    }

    @Override
    public PQEntry<K, V> removeMin() {
        return null;
    }
}
