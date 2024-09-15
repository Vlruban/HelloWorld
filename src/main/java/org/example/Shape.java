package org.example;

public abstract class Shape  {
    protected String name;

     Shape(String name){
        this.name=name;
    }

    public void getName (){
        System.out.println("name = " + name);
    }

    //Этот класс должен иметь метод для вывода имени фигуры.
}
