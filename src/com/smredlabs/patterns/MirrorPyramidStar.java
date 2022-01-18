package com.smredlabs.patterns;

public class MirrorPyramidStar {
    public static void main(String[] args) {
        int noOfLines = 5;
        int noOfSpaces;

        for (int i = 1; i <= noOfLines; i++) {
            noOfSpaces = noOfLines - i;
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i + i - 1; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }

        //mirror part
        for (int i = 1; i <= noOfLines; i++) {
            noOfSpaces = i;
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (noOfLines * 2 - noOfSpaces * 2) - 1; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
