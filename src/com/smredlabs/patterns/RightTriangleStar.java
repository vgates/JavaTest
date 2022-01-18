package com.smredlabs.patterns;

public class RightTriangleStar {
    public static void main(String[] args) {
        int noOfLines = 5;
        int i = 1;
        int noOfColumns = i;
        while (i <= noOfLines) {
            while (noOfColumns <= i) {
                System.out.print("* ");
                noOfColumns++;
            }
            System.out.println("");
            i++;
            noOfColumns = 1;
        }
    }
}
