package com.Java.Basics;

public class ExampleStaticBlock {
	
	/*
	 * A static block is a block of code that is executed only once when the
	 * class is loaded into memory. It is used to initialize static variables 
	 * or to perform any one-time initialization for the class.
	 */
	
    // Static variable
    private static int staticVariable;

    // Static block
    static {
        System.out.println("This is a static block.");
        // Perform any one-time initialization here
        staticVariable = 42;
    }

    // Main method to test the class
    public static void main(String[] args) {
        
    	System.out.println(staticVariable);
    }
}

