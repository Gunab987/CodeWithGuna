package com.Java.CollectionExample;


import java.util.Iterator;
import java.util.LinkedList;

public class ExampleLinkedList {

    public static void main(String[] args) {
        // Creating a LinkedList of strings
        LinkedList<String> fruitsList = new LinkedList<>();

        // Adding elements to the LinkedList
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");

        // Displaying elements using an enhanced for loop (for-each)
        System.out.println("Elements of the LinkedList:");
        for (String fruit : fruitsList) {
            System.out.println("Fruit: " + fruit);
        }

        // Adding elements at the beginning and end of the LinkedList
        fruitsList.addFirst("Mango");
        fruitsList.addLast("Grapes");

        // Displaying updated elements
        System.out.println("\nUpdated elements of the LinkedList:");
        for (String fruit : fruitsList) {
            System.out.println("Fruit: " + fruit);
        }

        // Removing an element from the LinkedList
        fruitsList.remove("Banana");

        // Displaying updated elements
        System.out.println("\nElements after removing an element:");
        for (String fruit : fruitsList) {
            System.out.println("Fruit: " + fruit);
        }
        
     // Using DescendingIterator to iterate through the elements in descending order
        System.out.println("\nUsing DescendingIterator to iterate through the LinkedList in descending order:");
        Iterator<String> descendingIterator = fruitsList.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println("Number (descending): " + descendingIterator.next());
        }
    }
}
