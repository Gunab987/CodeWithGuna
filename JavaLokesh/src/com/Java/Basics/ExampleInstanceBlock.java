package com.Java.Basics;

public class ExampleInstanceBlock {
	
	/*
	 * An instance block (also known as an instance initializer) is a block of code
	 * within a class that is executed each time an instance of the class is
	 * created. It is useful for performing instance-specific initialization that
	 * should be executed regardless of which constructor is used.
	 */
	 
    // Instance variable
    private int instanceVariable;

    // Instance block
    {
        System.out.println("This is an instance block.");
        // Perform instance-specific initialization here
        instanceVariable = 10;
    }

    // Default constructor
    public ExampleInstanceBlock() {
        System.out.println("Default constructor is called.");
    }


    // Main method to test the class
    public static void main(String[] args) {
        // Creating instances of the class
        ExampleInstanceBlock instance1 = new ExampleInstanceBlock();

        // Accessing instance variables
        System.out.println("Value of instanceVariable in instance1: " + instance1.instanceVariable);
    }
}

