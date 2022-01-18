package com.smredlabs.genexample;

import java.util.Arrays;

public class HrAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagramm", "marganaa"));
    }

    public static boolean isAnagram(String a, String b) {
        char tempA[] = a.toLowerCase().toCharArray();
        char tempB[] = b.toLowerCase().toCharArray();
        Arrays.sort(tempA);
        Arrays.sort(tempB);
        String C = new String(tempA);
        String D = new String(tempB);
        if (C.compareTo(D) == 0) {
            return true;
        }
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        return false;
    }
}
