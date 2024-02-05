package com.Java.OOPs.Inheritance;

public class ExampleSingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating an instance of the Dog class
        Dog myDog = new Dog();

        // Calling methods from both Animal and Dog classes
        myDog.eat();  // Inherited method from Animal class
        myDog.bark(); // Method from Dog class
	}

}
