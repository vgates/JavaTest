package com.smredlabs.strings;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String input = "abcd";
        String checkWith = "adcb";
        System.out.println(checkAnagrams(input, checkWith));
    }

    private static boolean checkAnagrams(String input, String checkWith) {
        if (input.length() != checkWith.length())
            return false;
        char[] inputA = input.toCharArray();
        char[] checkWithA = checkWith.toCharArray();
        Arrays.sort(inputA);
        Arrays.sort(checkWithA);
        return Arrays.equals(inputA, checkWithA);
    }
}
