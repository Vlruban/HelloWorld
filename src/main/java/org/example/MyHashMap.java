package org.example;

class MyHashMap<K, V> {
    class Node<K, V> {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    Node[] array = new Node[10];
    int maxSize = 10;
    int size = 0;


    public void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Значение ключя не может быть null");
        }
        Node<K, V> node = new Node(key, value);
        if (array[node.key.hashCode() % array.length] != null) {
            throw new IllegalArgumentException("Key is used more than once");
        }
        array[node.key.hashCode() % array.length] = node;
        size++;
        increaseSizeOfArrayIfNeed();
    }

    private void increaseSizeOfArrayIfNeed() {
        if (size == maxSize) {
            Node[] newArray = new Node[array.length * 2];
            maxSize *= 2;
            for (Node item : array) {
                newArray[maxSize % item.key.hashCode()] = item;
            }
        }
    }

    public void clear() {
        size = 0;
        array = new Node[10];
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (array[i] == null) {
                continue;
            }
            if (key.equals(array[i].key)) {
                return (V) array[i].value;
            }
        }
        return null;
    }

    public void remove(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key is null");
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == null) {
                continue;
            }


            if (key.equals(array[i].key)) {
                array[i] = null;
                break;
            }
        }
    }
}