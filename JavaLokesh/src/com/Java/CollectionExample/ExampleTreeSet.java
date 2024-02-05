package com.Java.CollectionExample;


import java.util.TreeSet;
import java.util.Iterator;

public class ExampleTreeSet {

    public static void main(String[] args) {
        // Creating a TreeSet of integers
        TreeSet<Integer> numbersSet = new TreeSet<>();

        // Adding elements to the TreeSet
        numbersSet.add(10);
        numbersSet.add(5);
        numbersSet.add(20);
        numbersSet.add(15);

        // Displaying elements using an enhanced for loop (for-each)
        System.out.println("Elements of the TreeSet:");
        for (Integer number : numbersSet) {
            System.out.println("Number: " + number);
        }

        // Using Iterator to iterate through the elements
        System.out.println("\nUsing Iterator to iterate through the TreeSet:");
        Iterator<Integer> iterator = numbersSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Number: " + iterator.next());
        }

        // Using DescendingIterator to iterate through the elements in descending order
        System.out.println("\nUsing DescendingIterator to iterate through the TreeSet in descending order:");
        Iterator<Integer> descendingIterator = numbersSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println("Number (descending): " + descendingIterator.next());
        }

       
    }
}
