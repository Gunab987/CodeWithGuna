package com.Java.OOPs.Abstraction;

public class Circle implements Shape{

	private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
	public void draw() {
        System.out.println("Drawing a Circle");
    }

    // Overriding the displayArea method
    @Override
	public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
