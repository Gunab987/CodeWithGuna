package com.Java.CollectionExample;

import java.util.ArrayList;
import java.util.ListIterator;

public class ExampleListIterator {
    public static void main(String[] args) {
        // Create a list
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Using ListIterator to iterate over the elements
        ListIterator<String> listIterator = colors.listIterator();

        System.out.println("Using ListIterator (Forward Direction):");
        while (listIterator.hasNext()) {
            String color = listIterator.next();
            System.out.println(color);
        }

        // Using ListIterator to iterate in reverse order
        System.out.println("\nUsing ListIterator (Reverse Direction):");
        while (listIterator.hasPrevious()) {
            String color = listIterator.previous();
            System.out.println(color);
        }
    }
}

