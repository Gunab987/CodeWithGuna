package com.Java.ConditionalStatement;

public class ExampleIfStatement {

    public static void main(String[] args) {
        int number = 15;

        // Simple if statement
        if (number > 10) {
            System.out.println("The number is greater than 10.");
        }

        // if-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Nested if statement
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("The number is a positive even number.");
            } else {
                System.out.println("The number is a positive odd number.");
            }
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}

