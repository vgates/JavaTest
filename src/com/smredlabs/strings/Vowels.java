package com.smredlabs.strings;

import java.util.*;

public class Vowels {
    public static void main(String[] args) {
        String input = "hello";
        getCountOfVowelsSet(input);
    }

    private static void getCountOfVowelsSet(String input) {
        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
        //membership test is faster for sets hence performance wise set is better
        Set<Character> vowelSet = new HashSet<>(Arrays.asList(vowels));
        int countOfVowels = 0;
        for (int i = 0; i < input.length(); i++)
            if (vowelSet.contains(input.charAt(i)))
                countOfVowels++;
        System.out.println("Count of Vowels = " + countOfVowels);
    }


    private static void getCountOfVowels(String input) {
        String vowels = "aeiou";
        int countOfVowels = 0;
        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) != -1)
                countOfVowels++;
        }
        System.out.println("Count of Vowels = " + countOfVowels);
    }

    private static void getCountOfVowelsArrayList(String input) {
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int countOfVowels = 0;
        for (int i = 0; i < input.length(); i++)
            if (vowels.contains(input.charAt(i)))
                countOfVowels++;
        System.out.println("Count of Vowels = " + countOfVowels);
    }
}
