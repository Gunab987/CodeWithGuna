package com.Java.OOPs.Polymorphism;

//Base class
public class Animal {
	// Method to make a sound
	void makeSound() {
		System.out.println("Animal makes a generic sound");
	}

}


//Subclass 1
class Dog extends Animal {
	// Overriding the makeSound method
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}

//Subclass 2
class Cat extends Animal {
	// Overriding the makeSound method
	@Override
	void makeSound() {
		System.out.println("Cat meows");
	}
}
