package com.Java.OOPs.Polymorphism;

public class ExampleRuntimePolymorphism {

    public static void main(String[] args) {
        // Creating instances of Animal, Dog, and Cat
        Animal genericAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the makeSound method on different objects
        genericAnimal.makeSound(); // Calls the method from Animal class
        myDog.makeSound();         // Calls the overridden method in Dog class
        myCat.makeSound();         // Calls the overridden method in Cat class
    }
}
