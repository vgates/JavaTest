package com.smredlabs.strings;

import java.util.Arrays;
import java.util.Collections;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "I AM BEAUTIFUL";
        reverseSentenceCollections(sentence);
    }

    private static void reverseSentenceCollections(String sentence) {
        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        System.out.println(String.join(" ", words));
    }

    private static void reverseSentence(String sentence) {
        String[] words = sentence.trim().split(" ");
        StringBuilder reverse = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
            reverse.append(words[i] + " ");
        System.out.print(reverse.toString().trim());
    }


}
