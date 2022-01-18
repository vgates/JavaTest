package com.smredlabs.genexample;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HrRegex {
    public static void main(String[] args) {
        String A = "([A-Z])(.+)";
        try {
            Pattern pattern = Pattern.compile(A);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }

    }
}
