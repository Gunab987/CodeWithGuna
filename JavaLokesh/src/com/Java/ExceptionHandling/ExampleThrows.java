package com.Java.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ExampleThrows {

    // Method with 'throws' declaration
    public static void readFile(String fileName) throws IOException {
        // Code that may throw IOException
        FileReader fileReader = new FileReader(fileName);

        // Additional code...

        // Closing the resource
        fileReader.close();
    }

    public static void main(String[] args) {
        try {
            // Calling a method that declares 'throws'
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }
}

