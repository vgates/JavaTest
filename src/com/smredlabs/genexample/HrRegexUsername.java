package com.smredlabs.genexample;

public class HrRegexUsername {
    public static void main(String[] args) {
        String username = "_Julia007";
        if (username.matches("[a-zA-Z][a-zA-Z0-9_]{7,29}")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
