package com.Java.OOPs.Inheritance;

public class ExampleMultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating an instance of the Labrador class
		Labrador myLabrador = new Labrador();

		// Calling methods from all three classes
		myLabrador.eat();       // Inherited method from Animal class
		myLabrador.bark();      // Inherited method from Dog class
		myLabrador.playFetch(); // Method from Labrador class
	}

}
