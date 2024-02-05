package com.Java.ArrayExample;

public class ExampleArrayDeclaration {

    public static void main(String[] args) {
        // Declaration and initialization of an array with specified size
        int[] numbers1 = new int[5];

        // Declaration, initialization, and assignment of values
        int[] numbers2 = {1, 2, 3, 4, 5};

        // Declaration and initialization of a two-dimensional array
        int[][] matrix = new int[3][3];

        // Declaration and initialization of a two-dimensional array with values
        int[][] matrixValues = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Declaration and initialization of an array of strings
        String[] names = {"Alice", "Bob", "Charlie"};

        // Declaration and initialization of an array of objects
        Person[] persons = new Person[2];
        persons[0] = new Person("John", 25);
        persons[1] = new Person("Jane", 30);

        // Displaying elements of the arrays
        displayArray("numbers1", numbers1);
        displayArray("numbers2", numbers2);
        displayMatrix("matrix", matrix);
        displayMatrix("matrixValues", matrixValues);
        displayArray("names", names);
        displayPersons("persons", persons);
    }

    // Method to display elements of an integer array
    private static void displayArray(String name, int[] array) {
        System.out.print("Elements of " + name + ": ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Method to display elements of a two-dimensional integer array
    private static void displayMatrix(String name, int[][] matrix) {
        System.out.println("Elements of " + name + ":");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Method to display elements of a string array
    private static void displayArray(String name, String[] array) {
        System.out.print("Elements of " + name + ": ");
        for (String value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Method to display elements of an array of Person objects
    private static void displayPersons(String name, Person[] persons) {
        System.out.println("Elements of " + name + ":");
        for (Person person : persons) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}

// Custom Person class
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

