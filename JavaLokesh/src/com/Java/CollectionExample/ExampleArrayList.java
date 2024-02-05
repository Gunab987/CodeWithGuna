package com.Java.CollectionExample;

import java.util.ArrayList;

public class ExampleArrayList {

    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Adding elements to the ArrayList
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);

        // Displaying elements using a for loop
        System.out.println("Elements of the ArrayList:");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbersList.get(i));
        }

        // Adding elements at a specific index
        numbersList.add(1, 15);
        numbersList.add(3, 25);

        // Displaying elements using an enhanced for loop (for-each)
        System.out.println("\nUpdated elements of the ArrayList:");
        for (int number : numbersList) {
            System.out.println("Element: " + number);
        }

        // Removing an element
        numbersList.remove(2);

        // Displaying updated elements
        System.out.println("\nElements after removing an element:");
        for (int number : numbersList) {
            System.out.println("Element: " + number);
        }
    }
}

