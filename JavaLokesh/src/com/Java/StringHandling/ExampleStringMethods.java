package com.Java.StringHandling;


public class ExampleStringMethods {

    public static void main(String[] args) {
        // Sample string
        String sampleString = "Hello, Java String Methods";

        // 1. length()
        int length = sampleString.length();
        System.out.println("1. Length of the string: " + length);

        // 2. charAt()
        char charAtIndex = sampleString.charAt(7);
        System.out.println("2. Character at index 7: " + charAtIndex);

        // 3. substring()
        String substring = sampleString.substring(7, 12);
        System.out.println("3. Substring from index 7 to 12: " + substring);

        // 4. indexOf()
        int indexOfJava = sampleString.indexOf("Java");
        System.out.println("4. Index of 'Java': " + indexOfJava);

        // 5. lastIndexOf()
        int lastIndexOfSpace = sampleString.lastIndexOf(" ");
        System.out.println("5. Last index of space: " + lastIndexOfSpace);

        // 6. toLowerCase()
        String lowerCaseString = sampleString.toLowerCase();
        System.out.println("6. Lowercase string: " + lowerCaseString);

        // 7. toUpperCase()
        String upperCaseString = sampleString.toUpperCase();
        System.out.println("7. Uppercase string: " + upperCaseString);

        // 8. trim()
        String stringWithWhitespace = "   Trim me!   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("8. Trimmed string: '" + trimmedString + "'");

        // 9. startsWith()
        boolean startsWithHello = sampleString.startsWith("Hello");
        System.out.println("9. Starts with 'Hello': " + startsWithHello);

        // 10. endsWith()
        boolean endsWithMethods = sampleString.endsWith("Methods");
        System.out.println("10. Ends with 'Methods': " + endsWithMethods);

        // 11. contains()
        boolean containsJava = sampleString.contains("Java");
        System.out.println("11. Contains 'Java': " + containsJava);

        // 12. replace()
        String replacedString = sampleString.replace("Java", "GPT");
        System.out.println("12. Replaced 'Java' with 'GPT': " + replacedString);

        // 13. concat()
        String concatString = sampleString.concat(" - String Concatenation");
        System.out.println("13. Concatenated string: " + concatString);

        // 14. equals()
        String anotherString = "Hello, Java String Methods";
        boolean areEqual = sampleString.equals(anotherString);
        System.out.println("14. Strings are equal: " + areEqual);

        // 15. compareTo()
        int compareToResult = sampleString.compareTo(anotherString);
        System.out.println("15. CompareTo result: " + compareToResult);
        
        // 16. isEmpty()
        boolean isEmpty = sampleString.isEmpty();
        System.out.println("16. Is the string empty? " + isEmpty);

        // 17. toCharArray()
        char[] charArray = sampleString.toCharArray();
        System.out.print("17. Characters in the string: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 18. split()
        String[] splitArray = sampleString.split(" ");
        System.out.print("18. Split string array: ");
        for (String part : splitArray) {
            System.out.print("'" + part + "' ");
        }
        System.out.println();

        // 19. substring() with one argument
        String substringFromIndex = sampleString.substring(7);
        System.out.println("19. Substring from index 7 to the end: " + substringFromIndex);

        // 20. replaceFirst()
        String replacedFirst = sampleString.replaceFirst("Java", "GPT");
        System.out.println("20. Replace the first 'Java' with 'GPT': " + replacedFirst);

        // 21. replaceAll()
        String replacedAll = sampleString.replaceAll("a", "A");
        System.out.println("21. Replace all 'a' with 'A': " + replacedAll);

        // 22. matches()
        boolean matchesRegex = sampleString.matches(".*Java.*");
        System.out.println("22. Matches the regex '.*Java.*': " + matchesRegex);
    }
}
