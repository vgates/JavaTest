package com.smredlabs.strings;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String string2 = scanner.nextLine();

        //compareStringsEquals(string1, string2);
        compareStrings(string1, string2);
    }

    static void compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("Strings are not equal");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println("Strings are not equal");
                return;
            }
        }
        System.out.println("Strings are equal");
    }

    static void compareStringsEquals(String s1, String s2) {
        System.out.println(s1 + " and " + s2 + " are equal: " + s1.equals(s2));
    }
}
