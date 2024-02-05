package com.Java.OOPs.Polymorphism;

public class ExampleCompileTimePolymorphism {

    // Method with two int parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the overloaded methods
        int result1 = add(2, 3);
        int result2 = add(2, 3, 5);
        double result3 = add(2.5, 3.5);

        // Displaying the results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }
}

