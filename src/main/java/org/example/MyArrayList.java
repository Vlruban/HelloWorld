package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList <V>{

    private V[] array = (V[]) new Object[0];

    public void add(V value) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = (V) value;
    }

    public void remove(int index) {
        if (index>=array.length){
            throw new IndexOutOfBoundsException("Элемент под номером"+index+ "отсутствует");
        }
        array = Arrays.copyOf(array, array.length - 1);
    }

    public void clear() {
        array = Arrays.copyOf(array, 0);
    }

    public int size() {
        return array.length;
    }

    public V get(int index) {
        if (index>=array.length){
            throw new IndexOutOfBoundsException("Элемент под номером"+index+ "отсутствует");
        }
        return (V) array[index].toString();
    }
    public String toString(){
        return ""+array;
    }
}


//    Написать свой класс MyArrayList как аналог классу ArrayList.
//
//    Можно использовать 1 массив для хранения данных.
//
//    Методы
//
//    add(Object value) добавляет элемент в конец
//    remove(int index) удаляет элемент под индексом
//    clear() очищает коллекцию
//    size() возвращает размер коллекции
//    get(int index) возвращает элемент под индексом


