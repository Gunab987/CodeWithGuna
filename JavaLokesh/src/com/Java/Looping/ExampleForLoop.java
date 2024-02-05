package com.Java.Looping;

public class ExampleForLoop {

    public static void main(String[] args) {
        // Example 1: Looping through numbers from 1 to 5
        System.out.println("Example 1:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Example 2: Looping through an array
        System.out.println("\nExample 2:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int j = 0; j < numbers.length; j++) {
            System.out.println("Element at index " + j + ": " + numbers[j]);
        }

        // Example 3: Looping through a string
        System.out.println("\nExample 4:");
        String message = "Hello, Java!";
        for (int k = 0; k < message.length(); k++) {
            char character = message.charAt(k);
            System.out.println("Character at index " + k + ": " + character);
        }
    }
}

