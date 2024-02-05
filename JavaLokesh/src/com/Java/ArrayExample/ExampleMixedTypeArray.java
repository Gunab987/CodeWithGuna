package com.Java.ArrayExample;

public class ExampleMixedTypeArray {

    public static void main(String[] args) {
        // Creating an array of objects to support different data types
        Object[] mixedArray = new Object[5];

        // Assigning values of different data types
        mixedArray[0] = 10;              // Integer
        mixedArray[1] = 3.14;            // Double
        mixedArray[2] = "Hello, Java!";  // String
        mixedArray[3] = true;             // Boolean
        mixedArray[4] = new PersonDemo("John", 25);  // Custom Object

        // Displaying elements of the mixed array
        displayArray("mixedArray", mixedArray);
    }

    // Method to display elements of an array of objects
    private static void displayArray(String name, Object[] array) {
        System.out.println("Elements of " + name + ":");
        for (Object value : array) {
            System.out.println(value);
        }
    }
}

// Custom Person class
class PersonDemo {
    private String name;
    private int age;

    public PersonDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "PersonDemo{name=" + name + ", age=" + age +" }";
    }
}

