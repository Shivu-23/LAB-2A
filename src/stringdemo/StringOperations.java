package stringdemo;

import java.util.*;

public class StringOperations {

    // 1. String Creation and Basic Operations
    public static void createStrings() {
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
    }

    // 2. Length and Character Access
    public static void lengthAndAccess(String str) {
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
    }

    // 3. String Comparison
    public static void compareStrings() {
        String a = "Java";
        String b = "java";
        System.out.println("Equals: " + a.equals(b));
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));
    }

    // 4. String Searching
    public static void searchString(String str) {
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Contains 'va': " + str.contains("va"));
    }

    // 5. Substring Operations
    public static void substringOps(String str) {
        System.out.println("Substring (1 to 4): " + str.substring(1, 4));
    }

    // 6. String Modification
    public static void modifyString(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));
    }

    // 7. Whitespace Handling
    public static void whitespaceHandling() {
        String str = "   Hello Java   ";
        System.out.println("Before Trim: '" + str + "'");
        System.out.println("After Trim: '" + str.trim() + "'");
    }

    // 8. String Concatenation
    public static void concatenate() {
        String s1 = "Hello";
        String s2 = "World";
        String result = s1 + " " + s2;
        System.out.println("Concatenated: " + result);
    }

    // 9. String Splitting
    public static void splitString() {
        String str = "Apple,Banana,Orange";
        String[] arr = str.split(",");
        System.out.println("Split Result:");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    // 10. StringBuilder Demo
    public static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.insert(5, " World");
        sb.replace(0, 5, "Hi");
        System.out.println("StringBuilder Result: " + sb);
    }

    // 11. String Formatting
    public static void stringFormatting() {
        String name = "Shiva";
        int age = 20;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formatted);
    }

    // 12. Email Validation
    public static void validateEmail(String email) {
        if (email.contains("@") && email.startsWith("s") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    public static void main(String[] args) {

        createStrings();

        String sample = "JavaProgramming";

        lengthAndAccess(sample);
        compareStrings();
        searchString(sample);
        substringOps(sample);
        modifyString(sample);
        whitespaceHandling();
        concatenate();
        splitString();
        stringBuilderDemo();
        stringFormatting();

        validateEmail("shiva@gmail.com");
    }
}