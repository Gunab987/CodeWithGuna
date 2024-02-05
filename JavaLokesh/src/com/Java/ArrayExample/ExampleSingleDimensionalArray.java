package com.Java.ArrayExample;

public class ExampleSingleDimensionalArray {

    public static void main(String[] args) {
        // Declaration and initialization of a single-dimensional array
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing and printing elements of the array
        System.out.println("Elements of the array:");

        // Using a for loop to iterate through the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Alternatively, using the enhanced for loop (for-each) for arrays
        System.out.println("\nUsing enhanced for loop:");

        for (int number : numbers) {
            System.out.println("Element: " + number);
        }
    }
}
