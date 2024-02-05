package com.Java.Basics;

public class ExampleObject {
	
	
	/*
	 * you can create objects without assigning them to a variable, and these are
	 * often referred to as "nameless" or "anonymous" objects. On the other hand,
	 * "named" objects are created and assigned to variables.
	 */
	
    // Instance variables
    private int value;

    // Constructor
    public ExampleObject(int value) {
        this.value = value;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Named object: created and assigned to a variable
    	ExampleObject namedObject = new ExampleObject(42);

        // Accessing the named object
        System.out.println("Named Object:");
        namedObject.displayInfo();

        // Nameless (Anonymous) object: created without assigning to a variable
        new ExampleObject(99).displayInfo();

        // Another named object
        ExampleObject anotherNamedObject = new ExampleObject(123);

        // Accessing the another named object
        System.out.println("Another Named Object:");
        anotherNamedObject.displayInfo();
    }
}

