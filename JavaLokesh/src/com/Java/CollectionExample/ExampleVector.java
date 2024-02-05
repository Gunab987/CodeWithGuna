package com.Java.CollectionExample;


import java.util.Vector;
import java.util.Enumeration;

public class ExampleVector {

    public static void main(String[] args) {
        // Creating a Vector of integers
        Vector<Integer> numbersVector = new Vector<>();

        // Adding elements to the Vector
        numbersVector.add(10);
        numbersVector.add(20);
        numbersVector.add(30);

        // Displaying elements using an enhanced for loop (for-each)
        System.out.println("Elements of the Vector:");
        for (int number : numbersVector) {
            System.out.println("Number: " + number);
        }

        // Adding elements at specific indices
        numbersVector.add(1, 15);
        numbersVector.add(3, 25);

        // Displaying updated elements
        System.out.println("\nUpdated elements of the Vector:");
        for (int number : numbersVector) {
            System.out.println("Number: " + number);
        }

        // Removing an element from the Vector
        numbersVector.removeElement(20);

        // Displaying updated elements
        System.out.println("\nElements after removing an element:");
        for (int number : numbersVector) {
            System.out.println("Number: " + number);
        }

        // Using Enumeration to iterate through the Vector
        System.out.println("\nUsing Enumeration to iterate through the Vector:");
        Enumeration<Integer> enumeration = numbersVector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println("Number: " + enumeration.nextElement());
        }
    }
}
