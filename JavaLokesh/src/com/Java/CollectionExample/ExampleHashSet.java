package com.Java.CollectionExample;


import java.util.HashSet;
import java.util.Iterator;

public class ExampleHashSet {

    public static void main(String[] args) {
        // Creating a HashSet of strings
        HashSet<String> fruitsSet = new HashSet<>();

        // Adding elements to the HashSet
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Orange");

        // Displaying elements using an enhanced for loop (for-each)
        System.out.println("Elements of the HashSet:");
        for (String fruit : fruitsSet) {
            System.out.println("Fruit: " + fruit);
        }

        // Adding a duplicate element (will not be added)
        fruitsSet.add("Apple");

        // Displaying updated elements
        System.out.println("\nUpdated elements of the HashSet:");
        for (String fruit : fruitsSet) {
            System.out.println("Fruit: " + fruit);
        }

        // Removing an element
        fruitsSet.remove("Banana");

        // Displaying updated elements
        System.out.println("\nElements after removing an element:");
        for (String fruit : fruitsSet) {
            System.out.println("Fruit: " + fruit);
        }

        // Using Iterator to iterate through the elements
        System.out.println("\nUsing Iterator to iterate through the HashSet:");
        Iterator<String> iterator = fruitsSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Fruit: " + iterator.next());
        }
    }
}
