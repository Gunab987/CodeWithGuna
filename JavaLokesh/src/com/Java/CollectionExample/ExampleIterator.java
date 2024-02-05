package com.Java.CollectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleIterator {
    public static void main(String[] args) {
        // Create a list
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Using Iterator to iterate over the elements
        Iterator<String> iterator = fruits.iterator();

        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}

