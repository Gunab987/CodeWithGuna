package com.Java.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ExampleFinallyBlock {

    public static void main(String[] args) {
    	
        FileReader fileReader = null;

        try {
            // Code that may throw exceptions
            fileReader = new FileReader("example.txt");
            // Additional code...

            // Simulating an exception
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (IOException e) {
            // Catch block for IOException
            System.out.println("Caught an IOException: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Catch block for ArithmeticException
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            // Finally block (cleanup code)
            System.out.println("Finally block is executed.");

            // Closing resources in the finally block
            try {
                if (fileReader != null) {
                    fileReader.close();
                    System.out.println("FileReader closed in finally block.");
                }
            } catch (IOException e) {
                System.out.println("Error closing fileReader: " + e.getMessage());
            }
        }

        System.out.println("Program continues after handling exceptions.");
    }
}

