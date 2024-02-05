package com.Java.StringHandling;


public class ExampleStringBuffer {

    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, Java StringBuffer");

        // Displaying the initial content
        System.out.println("Initial Content: " + stringBuffer);

        // 1. append()
        stringBuffer.append(" - Adding more content");
        System.out.println("1. After appending: " + stringBuffer);

        // 2. insert()
        stringBuffer.insert(6, "Inserted ");
        System.out.println("2. After inserting at index 6: " + stringBuffer);

        // 3. delete()
        stringBuffer.delete(6, 15);
        System.out.println("3. After deleting from index 6 to 14: " + stringBuffer);

        // 4. reverse()
        stringBuffer.reverse();
        System.out.println("4. After reversing: " + stringBuffer);

        // 5. setCharAt()
        stringBuffer.setCharAt(0, 'h');
        System.out.println("5. After setting character at index 0: " + stringBuffer);

        // 6. length()
        int length = stringBuffer.length();
        System.out.println("6. Length of the StringBuffer: " + length);

        // 7. capacity()
        int capacity = stringBuffer.capacity();
        System.out.println("7. Capacity of the StringBuffer: " + capacity);

        // 8. substring()
        String substring = stringBuffer.substring(7, 11);
        System.out.println("8. Substring from index 7 to 10: " + substring);

        // 9. deleteCharAt()
        stringBuffer.deleteCharAt(5);
        System.out.println("9. After deleting character at index 5: " + stringBuffer);

        // 10. replace()
        stringBuffer.replace(0, 5, "Replaced");
        System.out.println("10. After replacing from index 0 to 4: " + stringBuffer);
    }
}
