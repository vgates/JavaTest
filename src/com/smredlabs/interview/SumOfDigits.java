package com.smredlabs.interview;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 457892;
        int r = 0;
        int i = 1;
        int sumOdd = 0;
        int sumEven = 0;
        //reverse
        while (n > 0) {
            r = (r * 10) + (n % 10);
            n = n / 10;
        }
        System.out.println("Reverse = " + r);
        n = r;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            if (i % 2 == 0)
                sumEven += r;
            else
                sumOdd += r;
            i++;
        }


        System.out.println("Sum odd = " + sumOdd);
        System.out.println("Sum even = " + sumEven);

    }
}
