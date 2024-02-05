package com.Java.OOPs.Abstraction;

public class ExampleAbstraction {

    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calling abstract and concrete methods
        circle.draw();
        circle.displayArea();

        System.out.println(); // Adding a line break for clarity

        rectangle.draw();
        rectangle.displayArea();
    }
}
