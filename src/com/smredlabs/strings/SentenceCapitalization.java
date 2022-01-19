package com.smredlabs.strings;


public class SentenceCapitalization {
    public static void main(String[] args) {
        String sentence = "trees are            beautiful";
        System.out.println(capitalizeFirstLetter(sentence));
    }

    private static String capitalizeFirstLetter(String sentence) {
        sentence = sentence.trim().replaceAll(" +", " ").toLowerCase();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
        return String.join(" ", words);
    }
}
