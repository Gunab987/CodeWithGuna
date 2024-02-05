package com.Java.Basics;


//Custom Class
class Person {
 private String name;
 private int age;

 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getter methods
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }
}

public class ExampleNonPrimitiveDataTypes {

    public static void main(String[] args) {
    	
		/*
		 * Non-primitive data types in Java include objects, arrays, and strings.
		 * String is an object representing a sequence of characters. 
		 * Arrays (intArray and charArray) are non-primitive data types representing collections of elements.
		 * Person is a custom class representing an object with name and age attributes.
		 */
    	
        // Object - String
        String stringVar = "Hello, Java!";

        // Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};

        // Object - Custom Class
        Person personObj = new Person("John Doe", 25);

        // Displaying values
        System.out.println("String Variable: " + stringVar);

        System.out.print("Int Array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Char Array: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println("Person Object: " + personObj.getName() + ", Age: " + personObj.getAge());
    }
}



