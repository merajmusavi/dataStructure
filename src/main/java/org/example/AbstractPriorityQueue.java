package org.example;

import java.util.Comparator;

public abstract class AbstractPriorityQueue <K,V>{
    // Nested class for entries in the priority queue
    protected static class PQEntry<K, V> {
        private K key;
        private V value;

        public PQEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        // Accessor methods
        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        // Mutator methods
        protected void setKey(K key) {
            this.key = key;
        }

        protected void setValue(V value) {
            this.value = value;
        }
    }

    // Comparator used to order keys in the priority queue
    private Comparator<K> comp;

    // Constructor
    protected AbstractPriorityQueue(Comparator<K> c) {
        comp = c;
    }

    // Default constructor
    protected AbstractPriorityQueue() {
        this(new DefaultComparator<K>());
    }

    // Compares two entries according to their keys
    protected int compare(PQEntry<K, V> a, PQEntry<K, V> b) {
        return comp.compare(a.getKey(), b.getKey());
    }

    // Checks if a key is valid
    protected boolean checkKey(K key) throws IllegalArgumentException {
        try {
            return (comp.compare(key, key) == 0);  // Check if key is comparable
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Incompatible key");
        }
    }

    // Abstract methods to be implemented by concrete subclasses
    public abstract int size();

    public abstract boolean isEmpty();

    public abstract PQEntry<K, V> insert(K key, V value) throws IllegalArgumentException;

    public abstract PQEntry<K, V> min();

    public abstract PQEntry<K, V> removeMin();
}

// Default comparator class
class DefaultComparator<E> implements Comparator<E> {
    @SuppressWarnings("unchecked")
    public int compare(E a, E b) throws ClassCastException {
        return ((Comparable<E>) a).compareTo(b);
    }
}
