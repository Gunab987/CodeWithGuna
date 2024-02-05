package com.Java.CollectionExample;


import java.util.LinkedHashSet;
import java.util.Iterator;

public class ExampleLinkedHashSet {

    public static void main(String[] args) {
        // Creating a LinkedHashSet of strings
        LinkedHashSet<String> colorsSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");

        // Displaying elements using an enhanced for loop (for-each)
        System.out.println("Elements of the LinkedHashSet:");
        for (String color : colorsSet) {
            System.out.println("Color: " + color);
        }

        // Adding a duplicate element (will not be added)
        colorsSet.add("Red");

        // Displaying updated elements
        System.out.println("\nUpdated elements of the LinkedHashSet:");
        for (String color : colorsSet) {
            System.out.println("Color: " + color);
        }

        // Removing an element
        colorsSet.remove("Green");

        // Displaying updated elements
        System.out.println("\nElements after removing an element:");
        for (String color : colorsSet) {
            System.out.println("Color: " + color);
        }

        // Using Iterator to iterate through the elements
        System.out.println("\nUsing Iterator to iterate through the LinkedHashSet:");
        Iterator<String> iterator = colorsSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Color: " + iterator.next());
        }
    }
}
