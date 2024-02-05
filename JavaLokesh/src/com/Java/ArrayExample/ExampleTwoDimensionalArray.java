package com.Java.ArrayExample;

public class ExampleTwoDimensionalArray {

    public static void main(String[] args) {
        // Declaration and initialization of a two-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing and printing elements of the array
        System.out.println("Elements of the two-dimensional array:");

        // Using nested for loops to iterate through the array
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

