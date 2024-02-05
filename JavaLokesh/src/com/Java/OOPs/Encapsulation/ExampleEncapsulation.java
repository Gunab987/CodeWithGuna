package com.Java.OOPs.Encapsulation;

public class ExampleEncapsulation {

    // Private fields (data) of the class
    private String name;
    private int age;

    // Public getter method for the 'name' field
    public String getName() {
        return name;
    }

    // Public setter method for the 'name' field
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for the 'age' field
    public int getAge() {
        return age;
    }

    // Public setter method for the 'age' field
    public void setAge(int age) {
        // Validation logic can be added here if needed
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be a positive number.");
        }
    }

    public static void main(String[] args) {
        
    }
}

