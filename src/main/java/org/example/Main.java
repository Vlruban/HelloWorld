package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Olala");
        System.out.println("shape = " + shape.getValue());
        Oval oval = new Oval("овальчик");
        System.out.println("oval=" + oval.getValue());

    }
}
