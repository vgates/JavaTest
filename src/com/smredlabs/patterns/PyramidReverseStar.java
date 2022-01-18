package com.smredlabs.patterns;

public class PyramidReverseStar {
    public static void main(String[] args) {
        int noOfLines = 4;
        int noOfSpaces = 0;

        for (int i = 1; i <= noOfLines; i++) {
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print("  ");
            }
            for (int j = (noOfLines * 2 - noOfSpaces) - 1; j > noOfSpaces; j--) {
                System.out.print(" *");
            }
            System.out.println("");
            noOfSpaces++;
        }
    }
}
