package javas.test.DataStructures;

import java.util.LinkedList;

public class HashTables<K, V> {
    private class HashNode<K, V> {
        K key;
        V value;
        HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<HashNode<K, V>>[] chainArray;
    private int M = 11; // tamaño inicial del array
    private int size; // número de elementos en la tabla

    public HashTables() {
        chainArray = new LinkedList[M];
        for (int i = 0; i < M; i++) {
            chainArray[i] = new LinkedList<>();
        }
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % M);
    }

    public void put(K key, V value) {
        int bucketIndex = hash(key);
        for (HashNode<K, V> node : chainArray[bucketIndex]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        chainArray[bucketIndex].add(new HashNode<>(key, value));
        size++;
    }

    public V get(K key) {
        int bucketIndex = hash(key);
        for (HashNode<K, V> node : chainArray[bucketIndex]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        int bucketIndex = hash(key);
        HashNode<K, V> toRemove = null;
        for (HashNode<K, V> node : chainArray[bucketIndex]) {
            if (node.key.equals(key)) {
                toRemove = node;
                break;
            }
        }
        if (toRemove != null) {
            chainArray[bucketIndex].remove(toRemove);
            size--;
            return toRemove.value;
        } else {
            return null;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }