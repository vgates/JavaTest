package com.smredlabs.patterns;

public class PyramidNumber {
    public static void main(String[] args) {
        int noOfLines = 4;
        int noOfSpace = 0;

        for (int i = 1; i <= noOfLines; i++) {
            noOfSpace = noOfLines - i;
            for (int j = 1; j <= noOfSpace; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
