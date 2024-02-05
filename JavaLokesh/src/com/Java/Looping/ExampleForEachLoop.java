package com.Java.Looping;

public class ExampleForEachLoop {

    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {1, 2, 3, 4, 5};

        // Using foreach loop to iterate through the array
        System.out.println("Using foreach loop to iterate through the array:");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }
    }
}

