package com.smredlabs.genexample;

public class HrPalindrome {
    public static void main(String[] args) {
        String A = "vinod";
        String B = "";

        StringBuilder C = new StringBuilder(A);

        for (int i = 0; i < A.length(); i++) {
            B = A.charAt(i) + B;
        }

        System.out.println(B);

        if (A.compareTo(B) == 0) {
            System.out.println("String is a palindrome...");
        } else {
            System.out.println("Not a palindrome.");
        }


        StringBuilder D = new StringBuilder(C.reverse());
        System.out.println("\n\nC: " + C);
        System.out.println("D: " + D);
        System.out.println("A: " + A);
        if (C.compareTo(D) == 0) {
            System.out.println("String C is a palindrome...");
        } else {
            System.out.println("C is not a palindrome.");
        }


    }
}
