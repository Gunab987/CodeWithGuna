package com.Java.Basics;

public class ExamplePrimitiveDataTypes {
	
	/*
	 * primitive data types represent simple values like 
	 * integers, 
	 * floating-point
	 * numbers, 
	 * characters, and 
	 * booleans.
	 * byte, short, int, and long are integer types representing different sizes of signed integers.
	 * float and double are floating-point types representing single and double-precision floating-point numbers, respectively.
	 * char represents a 16-bit Unicode character.
	 * boolean represents a true or false value.
	 */
	
    public static void main(String[] args) {
        // Integer types
        byte byteVar = 127;         // 8-bit signed integer
        short shortVar = 32767;     // 16-bit signed integer
        int intVar = 2147483647;    // 32-bit signed integer
        long longVar = 9223372036854775807L;  // 64-bit signed integer

        // Floating-point types
        float floatVar = 3.14f;     // 32-bit floating-point
        double doubleVar = 3.14159; // 64-bit floating-point

        // Character type
        char charVar = 'A';         // 16-bit Unicode character

        // Boolean type
        boolean booleanVar = true;  // true or false

        // Displaying values
        System.out.println("Byte Variable: " + byteVar);
        System.out.println("Short Variable: " + shortVar);
        System.out.println("Int Variable: " + intVar);
        System.out.println("Long Variable: " + longVar);
        System.out.println("Float Variable: " + floatVar);
        System.out.println("Double Variable: " + doubleVar);
        System.out.println("Char Variable: " + charVar);
        System.out.println("Boolean Variable: " + booleanVar);
    }
}

