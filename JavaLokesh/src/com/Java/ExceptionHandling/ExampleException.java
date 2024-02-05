package com.Java.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ExampleException {
	
	/*
	 * exceptions are categorized into two main types: checked exceptions unchecked
	 * exceptions.
	 * 
	 * Checked Exceptions (Compile-Time Exceptions):
	 * 
	 * These are exceptions that are checked at compile-time. They must be either
	 * caught using a try-catch block or declared using the throws keyword in the
	 * method signature. Examples include IOException, SQLException,
	 * FileNotFoundException, etc.
	 * 
	 * Unchecked Exceptions (Runtime Exceptions):
	 * 
	 * These are exceptions that are not checked at compile-time. They occur at
	 * runtime and are usually indicative of programming bugs or logical errors.
	 * Unchecked exceptions extend from the RuntimeException class or its
	 * subclasses. Examples include ArithmeticException, NullPointerException,
	 * ArrayIndexOutOfBoundsException, etc.
	 * 
	 */

    public static void main(String[] args) {
        // Checked exception example
        try {
            FileReader fileReader = new FileReader("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }

        // Unchecked exception example
        int[] numbers = {1, 2, 3};
        try {
            int result = numbers[4]; // Accessing an index that doesn't exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Unchecked exception without a try-catch block (program will terminate)
        int result = 10 / 0; // ArithmeticException
    }
}

