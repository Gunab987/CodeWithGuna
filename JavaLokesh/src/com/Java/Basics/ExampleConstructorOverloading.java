package com.Java.Basics;

public class ExampleConstructorOverloading {
	
	/*
	 * Constructor overloading in Java allows a class to have multiple constructors
	 * with different parameter lists. Each constructor provides a different way to
	 * initialize objects of the class.
	 */
	
    // Instance variables
    private int id;
    private String name;
    private double salary;

    // Default constructor
    public ExampleConstructorOverloading() {
        System.out.println("Default constructor is called.");
        id = 0;
        name = "Default";
        salary = 0.0;
    }

    // Constructor with parameters
    public ExampleConstructorOverloading(int id, String name, double salary) {
        System.out.println("Parameterized constructor is called.");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Constructor with fewer parameters
    public ExampleConstructorOverloading(int id, String name) {
        System.out.println("Constructor with fewer parameters is called.");
        this.id = id;
        this.name = name;
        this.salary = 0.0; // Default salary
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating instances of the class using different constructors
    	ExampleConstructorOverloading employee1 = new ExampleConstructorOverloading();
    	ExampleConstructorOverloading employee2 = new ExampleConstructorOverloading(1, "John Doe");
    	ExampleConstructorOverloading employee3 = new ExampleConstructorOverloading(2, "Jane Smith", 50000.0);

        // Displaying information for each employee
        System.out.println("Employee 1:");
        employee1.displayInfo();

        System.out.println("Employee 2:");
        employee2.displayInfo();

        System.out.println("Employee 3:");
        employee3.displayInfo();
    }
}

