package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayLists = new MyArrayList();
        myArrayLists.add("первый");
        System.out.println("myArrayLists size = " + myArrayLists.size());
        myArrayLists.add("второй");
        System.out.println("myArrayLists size = " + myArrayLists.size());
        myArrayLists.add("третий");
        System.out.println("Элемент под номером 2 = " + myArrayLists.get(2));
        System.out.println("myArrayLists size = " + myArrayLists.size());
        myArrayLists.remove(1);
        System.out.println("myArrayLists size = " + myArrayLists.size());
        myArrayLists.clear();
        System.out.println("myArrayLists size = " + myArrayLists.size());
        System.out.println("Test MyArrayList completed");
        System.out.println("___________________________");
        // __________________________________________________________________
        MyQueue<String> myQueus = new MyQueue<>();
        myQueus.add("La-la-la");
        myQueus.add("получилось");
        System.out.println(myQueus.peek());
        System.out.println(myQueus.pool());
        System.out.println(myQueus.pool());
        System.out.println("Test MyQueue completed");
        System.out.println("___________________________");
        // __________________________________________________________________
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Go");
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        myLinkedList.add("Go2");
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        myLinkedList.add("Go3");
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println(myLinkedList.get(1));
        myLinkedList.remove(0);
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("Test MyLinkedList completed");
        System.out.println("___________________________");
        // __________________________________________________________________
        HashMap <Integer,String> map = new HashMap<>();
        map.put(22,"First");
        System.out.println(map.size());
        map.put(1,"Second");
        System.out.println(map.size());
        System.out.println(map.get(1));
        map.clear();
        System.out.println(map.size());
        map.put(12,"Third");
        map.put(21,"Second");
        System.out.println(map.size());
        map.put(12,"Second");
        System.out.println(map.size());
        map.remove(12);
        System.out.println(map.size());
        System.out.println("Значение ключа 21 = " + map.get(21));
        System.out.println("Test MyHashMap completed");
        System.out.println("___________________________");
        // __________________________________________________________________








    }
}
