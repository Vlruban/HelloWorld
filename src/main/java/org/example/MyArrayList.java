package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {

    private MyArrayList[] array = new MyArrayList[0];

    public void add(Object value) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = (MyArrayList) value;
    }

    public void remove(int index) {
        array = Arrays.copyOf(array, array.length - 1);
    }

    public void clear() {
        array = Arrays.copyOf(array, 0);
    }

    public int size() {
        return array.length;
    }

    public MyArrayList get(int index) {
        return array[index];
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


