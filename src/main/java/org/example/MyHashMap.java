package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class MyHashMap<K, V> {
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> node;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    Node[] array;
    int size = 0;


    public void put(K key, V value) {
        if (key == null) {
            throw new IndexOutOfBoundsException("Значение ключя не может быть null");
        }
        for (int i = 0; i < size; i++) {
            if (array[0] == key) {
                throw new IndexOutOfBoundsException("Значение ключ занято");
            }
        }
        Node<K, V> node = new MyHashMap.Node(key, value);
        size++;
        array[0] = (Node) key;
        array[1] = (Node) value;
    }

    public void clear() {
        size = 0;
        array = null;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (key == null || key != array[0]) {
                throw new IllegalArgumentException("Ключ не обнаружен");
            }
            if (key == array[0]) {
                break;
            }
        }
        return (V) array[1];
    }

    public void remove(K key) {
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (key == null || key != array[0]) {
                throw new IllegalArgumentException("Ключ не обнаружен");
            } else {
                if (key == array[0]) {
                    break;
                }
                array = null;
            }
        }
    }
}


//    Написать свой класс MyHashMap как аналог классу HashMap.
//
//    Нужно делать с помощью односвязной Node.
//
//    Не может хранить две ноды с одинаковых ключами одновременно.
//
//            Методы
//
//    put(Object key, Object value) добавляет пару ключ + значение
//    remove(Object key) удаляет пару по ключу
//    clear() очищает коллекцию
//    size() возвращает размер коллекции
//    get(Object key) возвращает значение(Object value) по ключу



