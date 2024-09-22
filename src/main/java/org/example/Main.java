package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList o = new MyArrayList();
        MyArrayList o2 = new MyArrayList();
        MyArrayList o3 = new MyArrayList();
        MyArrayList  myArrayLists = new MyArrayList();
        myArrayLists.add(o);
        System.out.println("myArrayLists size = " +  myArrayLists.size());
        myArrayLists.add(o2);
        System.out.println("myArrayLists size = " +  myArrayLists.size());
        myArrayLists.add(o3);
        System.out.println("myArrayLists size = " +  myArrayLists.size());
        myArrayLists.remove(1);
        System.out.println("myArrayLists size = " +  myArrayLists.size());
        myArrayLists.clear();
        System.out.println("myArrayLists size = " +  myArrayLists.size());



    }
}
