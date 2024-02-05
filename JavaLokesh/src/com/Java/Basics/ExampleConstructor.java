package com.Java.Basics;

public class ExampleConstructor {

	/*
	 * A constructor is a special method that is used to initialize objects. 
	 * It has the same name as the class and is called when an instance of the 
	 * class is created.
	 */
	
    // Instance variable
    private int value;

    // Parameterized constructor
    public ExampleConstructor(int initialValue) {
        System.out.println("Parameterized constructor is called with value: " + initialValue);
        // Set the value based on the parameter
        value = initialValue;
    }

    // Method to get the value
    public int getValue() {
        return value;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating instances of the class using constructor
        ExampleConstructor instance2 = new ExampleConstructor(42);

        // Accessing instance variables using methods
        System.out.println("Value of instance2: " + instance2.getValue());
    }
}

