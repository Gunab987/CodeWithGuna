package com.Java.OOPs.Abstraction;

public class Rectangle implements Shape{

	private double length;
    private double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    // Overriding the displayArea method
    @Override
    public void displayArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
