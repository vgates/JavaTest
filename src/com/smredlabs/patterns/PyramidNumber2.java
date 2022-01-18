package com.smredlabs.patterns;

public class PyramidNumber2 {
    public static void main(String[] args) {
        int noOfLines = 5;
        int noOfSpace = 0;
        int x = 0;
        for (int i = 1; i <= noOfLines; i++) {
            noOfSpace = noOfLines - i;
            for (int j = 1; j <= noOfSpace; j++) {
                System.out.print("  ");
            }

            for (int j = i, k = j; j >= 1; j--) {
                System.out.print(k++ + " ");
            }

            for (int j = i - 1, k = x + i; j > 0; j--) {
                System.out.print(--k + " ");
            }

            System.out.println(" ");
            x++;
        }
    }
}
