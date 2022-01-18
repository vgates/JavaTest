package com.smredlabs.genexample;

public class HrSubstringSmallestLargest {
    public static void main(String[] args) {
        String A = "welcometojava";
        String smallest = "";
        String largest = "";
        String subString = "";
        int lengthOfSubstring = 3;
        int i = 0;
        while ((i + lengthOfSubstring) <= A.length()) {
            subString = A.substring(i, i + lengthOfSubstring);
            if (smallest == "") {
                smallest = subString;
            }
            if (smallest.compareTo(subString) > 0) {
                smallest = subString;
            }
            if (largest.compareTo(subString) < 0) {
                largest = subString;
            }
            i++;
        }
        System.out.println("Smallest: " + smallest + "\nLargest: " + largest);


    }
}
