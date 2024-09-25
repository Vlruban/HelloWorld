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
        MyHashMap<Integer, String> map = new MyHashMap<>();
        map.put(22, "First");
        System.out.println(map.size);
        map.put(2, "Second");
        System.out.println(map.size);
//        map.put(22,"First2");
        System.out.println(map.size);
        map.put(11, "First");
        System.out.println(map.size);

        // __________________________________________________________________


    }
}
