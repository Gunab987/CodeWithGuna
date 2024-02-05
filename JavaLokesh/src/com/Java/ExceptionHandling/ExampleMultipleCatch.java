package com.Java.ExceptionHandling;

public class ExampleMultipleCatch {

    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            int[] numbers = {1, 2, 3};
            int result = numbers[4]; // Accessing an index that doesn't exist
            System.out.println("Result: " + result); // This won't be reached due to the exception
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block for ArrayIndexOutOfBoundsException
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Catch block for ArithmeticException
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            // Catch block for any other exceptions (general catch)
            System.out.println("Caught a general Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling exceptions.");
    }
}

