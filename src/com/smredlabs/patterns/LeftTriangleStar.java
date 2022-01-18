package com.smredlabs.patterns;

public class LeftTriangleStar {
    public static void main(String[] args) {
        int noOfLines = 5;
        int noOfColumns = 5;
        int noOfSpaces = 0;
        int i = 1, j = 1;

        while (i <= noOfLines) {
            noOfSpaces = noOfColumns - i;
            while (j <= noOfColumns) {
                if (j <= noOfSpaces)
                    System.out.print("  ");
                else
                    System.out.print("* ");
                j++;
            }
            System.out.println("");
            i++;
            j = 1;
        }
    }
}
