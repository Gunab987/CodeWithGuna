package com.Java.Basics;

//A class with different access modifiers
public class ExampleAccessModifiers {
	
	/*
	 * Access modifiers control the visibility of classes, fields, methods, and
	 * constructors. There are four access modifiers: 
	 * private, 
	 * default(package-private), 
	 * protected,
	 * public.
	 * publicField is a public field that can be accessed from anywhere.
	 * defaultField is a default (package-private) field that can be accessed within the same package.
	 * privateField is a private field that can only be accessed within the same class.
	 * protectedField is a protected field that can be accessed within the same package and by subclasses.
	 */

 // Public field can be accessed from anywhere
 public int publicField = 10;

 // Default (package-private) field can be accessed within the same package
 int defaultField = 20;

 // Private field can only be accessed within the same class
 private int privateField = 30;

 // Protected field can be accessed within the same package and by subclasses
 protected int protectedField = 40;

 // Default constructor (package-private)
 ExampleAccessModifiers() {
     System.out.println("Default constructor is called.");
 }

 // Public method can be accessed from anywhere
 public void publicMethod() {
     System.out.println("Public method is called.");
 }

 // Default (package-private) method can be accessed within the same package
 void defaultMethod() {
     System.out.println("Default method is called.");
 }

 // Private method can only be accessed within the same class
 private void privateMethod() {
     System.out.println("Private method is called.");
 }

 // Protected method can be accessed within the same package and by subclasses
 protected void protectedMethod() {
     System.out.println("Protected method is called.");
 }

 // Main method to test the class
 public static void main(String[] args) {
	 ExampleAccessModifiers example = new ExampleAccessModifiers();

     // Accessing fields and methods with different access modifiers
     System.out.println("Public field: " + example.publicField);
     System.out.println("Default field: " + example.defaultField);
     System.out.println("Private field: " + example.privateField); 
     System.out.println("Protected field: " + example.protectedField);

     example.publicMethod();
     example.defaultMethod();
     example.privateMethod(); 
     example.protectedMethod();
 }
}

