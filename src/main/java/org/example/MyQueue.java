package org.example;

import java.util.Arrays;

public class MyQueue<V> {

    private V[] queues = (V[]) new Object[0];

    public void add(V value) {
        queues = Arrays.copyOf(queues, queues.length + 1);
        queues[queues.length - 1] = (V) value;
    }

    public void clear() {
        queues = Arrays.copyOf(queues, 0);
    }

    public int size() {
        return queues.length;
    }

    public V peek() {
        if (queues == null) {
            throw new IndexOutOfBoundsException("В массиве нет элементов");
        } else {
            return queues[0];
        }
    }


    public V pool() {
        if (queues.length==0){
            throw new IndexOutOfBoundsException("В массиве нет элементов");
        } else {
            V[] answer = Arrays.copyOf(queues, 1);
            V[] temp = ( V []) new Object[queues.length - 1];
            for (int i = 1; i < queues.length; i++) {
                temp[i - 1] = queues[i];
            }
            queues = Arrays.copyOf(temp, temp.length);
            return  answer[0];
        }
    }

}


//    Написать свой класс MyQueue как аналог классу Queue, который будет работать по принципу FIFO (first-in-first-out).
//
//    Можно делать либо с помощью Node либо с помощью массива.
//
//    Методы
//
//    add(Object value) добавляет элемент в конец
//    clear() очищает коллекцию
//    size() возвращает размер коллекции
//    peek() возвращает первый элемент в очереди (FIFO)
//    poll() возвращает первый элемент в очереди и удаляет его из коллекции

