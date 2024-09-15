package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ShapePrint shapePrint = new ShapePrint();
        Oval oval =new Oval("овал");
        Ellipse ellipse = new Ellipse("Елипс");
        shapePrint.printName(oval);
        oval.getName();




    }
}
