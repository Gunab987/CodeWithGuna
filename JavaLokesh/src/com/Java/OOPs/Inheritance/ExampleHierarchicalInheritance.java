package com.Java.OOPs.Inheritance;

public class ExampleHierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating instances of Dog and Cat classes
		Dog myDog = new Dog();
		Cat myCat = new Cat();

		// Calling methods from Animal class through both Dog and Cat classes
		myDog.eat();  // Inherited method from Animal class
		myCat.eat();  // Inherited method from Animal class

		// Calling methods specific to Dog and Cat classes
		myDog.bark(); // Method from Dog class
		myCat.meow(); // Method from Cat class
	}

}
