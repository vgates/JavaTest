package com.smredlabs.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDulpicates {
    public static void main(String[] args) {
        String input = "hellooo!!";
        System.out.println(removeDuplicates(input));
    }

    private static String removeDuplicates(String input) {
        Set<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : input.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

}
