package org.example;

import java.util.Arrays;

public class MyQueue<V> {

    private MyQueue[] queues = new MyQueue[0];

    public void add(Object value) {
        queues = Arrays.copyOf(queues, queues.length + 1);
        queues[queues.length - 1] = (MyQueue) value;
    }

    public void clear() {
        queues = Arrays.copyOf(queues, 0);
    }

    public int size() {
        return queues.length;
    }

    public MyQueue peek() {
        if (queues == null) {
            System.out.println("В массиве нет элементов");
            return null;
        } else {
            return queues[0];
        }
    }

    public MyQueue pool() {
        if (queues == null) {
            System.out.println("В массиве нет элементов");
            return null;
        } else {
            MyQueue[] answer = Arrays.copyOf(queues, 1);
            MyQueue[] temp = new MyQueue[queues.length - 1];
            for (int i = 1; i < queues.length; i++) {
                temp[i - 1] = queues[i];
            }
            queues = Arrays.copyOf(temp, temp.length);
            return answer[0];
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

