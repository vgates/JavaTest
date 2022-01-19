package com.smredlabs.strings;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacter {
    public static void main(String[] args) {
        String input = "Helllllooo!!";
        System.out.println(findMostRepeatedCharacterASCII(input));
    }

    private static Character findMostRepeatedCharacterASCII(String input) {
        final int ASCII_SIZE = 256;
        int[] count = new int[ASCII_SIZE];
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;
        }
        int maxValue = -1;
        int maxIndex = -1;
        for (int i = 0; i < ASCII_SIZE; i++) {
            if (count[i] > maxValue) {
                maxValue = count[i];
                maxIndex = i;
            }
        }
        return (char) maxIndex;
    }

    private static Character findMostRepeatedCharacter(String input) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if (hashMap.containsKey(ch))
                hashMap.put(ch, hashMap.get(ch) + 1);
            else
                hashMap.put(ch, 1);
        }
        int maxValue = -1;
        Character mostRepeatedCharacter = null;
        for (Map.Entry mapElement : hashMap.entrySet()) {
            Character key = (Character) mapElement.getKey();
            Integer value = (Integer) mapElement.getValue();
            if (value > maxValue) {
                maxValue = value;
                mostRepeatedCharacter = key;
            }
        }
        return mostRepeatedCharacter;
    }
}
