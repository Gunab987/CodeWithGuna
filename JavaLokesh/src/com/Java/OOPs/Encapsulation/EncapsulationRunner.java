package com.Java.OOPs.Encapsulation;

public class EncapsulationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating an instance of the EncapsulationExample class
    	ExampleEncapsulation person = new ExampleEncapsulation();

        // Accessing the fields through getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying the fields through setter methods
        person.setName("Jane Doe");
        person.setAge(30);

        // Accessing the modified fields
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
	}

}
