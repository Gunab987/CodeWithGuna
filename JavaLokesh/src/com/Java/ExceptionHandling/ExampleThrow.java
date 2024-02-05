package com.Java.ExceptionHandling;

public class ExampleThrow {

    // Method to check if a number is positive and throw an exception if not
    public static void checkPositive(int number) {
        if (number <= 0) {
            // Creating and throwing a custom exception
            throw new IllegalArgumentException("Number must be positive.");
        }
        System.out.println("Number is positive: " + number);
    }

    public static void main(String[] args) {
        try {
            // Calling a method that may throw an exception
            checkPositive(-5);
        } catch (IllegalArgumentException e) {
            // Catching the custom exception
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
