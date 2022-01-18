package com.smredlabs.genexample;

import java.util.HashMap;
import java.util.Map;

public class HrAnagramHashmap {
    public static void main(String[] args) {
        System.out.println(isAnagram("cat", "ACT"));
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;
        if (a == null || b == null || a.equals("") || b.equals(""))
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> amap = new HashMap<>();
        char letter = '-';
        Integer frequency = 0;
        for (int i = 0; i < a.length(); i++) {
            letter = a.charAt(i);
            if (amap.containsKey(letter)) {
                frequency = amap.get(letter);
                amap.put(letter, ++frequency);
            } else {
                amap.put(letter, 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            letter = b.charAt(i);
            if (amap.containsKey(letter)) {
                frequency = amap.get(letter);
                if (frequency == 0)
                    return false;
                else
                    amap.put(letter, --frequency);
            } else {
                return false;
            }
        }

        return true;
    }
}
