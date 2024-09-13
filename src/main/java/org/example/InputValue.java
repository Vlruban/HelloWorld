package org.example;

abstract class InputValue {
String value;
    InputValue(String value) {
        this.value=value;
    }
   String getValue(){
        return value;
    }

    public void getShapeValue (Shape shape){
        System.out.println("shape = " + shape.getValue());
    }


}
