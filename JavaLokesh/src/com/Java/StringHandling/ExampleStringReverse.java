package com.Java.StringHandling;


public class ExampleStringReverse {

    public static void main(String[] args) {
        // Sample string
        String originalString = "admin";

        // Displaying the original string
        System.out.println("Original String: " + originalString);

        // Reversing the string using a for loop
        String reversedString = reverseString(originalString);

        // Displaying the reversed string
        System.out.println("Reversed String: " + reversedString);
    }

    // Method to reverse a string using a for loop
    private static String reverseString(String input) {
        int length = input.length();
        StringBuilder reversed = new StringBuilder(length);

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}

