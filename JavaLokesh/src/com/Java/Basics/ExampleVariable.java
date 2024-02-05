package com.Java.Basics;

public class ExampleVariable {
	
	/*
	 * classVariable is a class-level (static) variable. 
	 * instanceVariable is an instance variable. 
	 * Both the staticMethod and instanceMethod have local
	 * variables with the same name as the class-level variable and instance variable. 
	 * Inside the methods, 
	 * you can access the class-level variables using the class name
	 * (ExampleVariableScope.classVariable) for static variables 
	 * and the this keyword (this.instanceVariable) for instance variables.
	 */
	
    // Class-level (static) variable
    private static int classVariable = 10;
    // Instance variable
    private int instanceVariable = 20;

    // Static method with a local variable having the same name as classVariable
    public static void staticMethod() {
        // Local variable with the same name as classVariable and instanceVariable
        int classVariable = 30;
        int instanceVariable = 20;

        // Accessing class-level (static) variable and local variable
        System.out.println("Accessing classVariable from static method: " + ExampleVariable.classVariable);
        System.out.println("Accessing local variable in static method: " + classVariable);

        // Creating an instance of the class to access instance variable
        ExampleVariable instance = new ExampleVariable();
        System.out.println("Accessing instanceVariable from static method: " + instance.instanceVariable);
        
        System.out.println("Accessing local Variable from static method: " + instanceVariable);
    }

    // Instance method with a local variable having the same name as instanceVariable
    public void instanceMethod() {
        // Local variable with the same name as classVariable and instanceVariable
    	int classVariable = 30;
        int instanceVariable = 40;

        // Accessing class-level (static) variable and local variable
        System.out.println("Accessing classVariable from instance method: " + ExampleVariable.classVariable);
        System.out.println("Accessing classVariable from instance method using class name: " + classVariable);
        
        // Using 'this' keyword to access instance variable and local variable
        System.out.println("Accessing instanceVariable from instance method: " + this.instanceVariable);
        System.out.println("Accessing local variable in instance method: " + instanceVariable);
        
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an instance of the class
        ExampleVariable instance = new ExampleVariable();

        // Accessing static method
        staticMethod();

        // Accessing instance method
        instance.instanceMethod();
    }
}

