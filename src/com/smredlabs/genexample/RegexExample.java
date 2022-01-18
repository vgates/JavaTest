package com.smredlabs.genexample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Pattern.matches(".s", "as"));
        System.out.println(Pattern.matches(".s", "mk"));
        System.out.println(Pattern.matches("[abc][abc]", "ab"));
        System.out.println(Pattern.matches("[^abc]", "a"));
        System.out.println(Pattern.matches("[abc]+", "abbbb"));
        System.out.println(Pattern.matches("[\\d]+", "119797")); //one or more digits
        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//phone number
        System.out.println(Pattern.matches("[789]{1}[\\d]{9}", "9953038949"));//phone

        System.out.println("Enter the regex pattern: ");

        // compiles the given regex and returns the instance of the Pattern.
        Pattern pattern = Pattern.compile(sc.nextLine());

        System.out.println("Enter the text: ");

        //creates a matcher that matches the given input with the pattern.
        Matcher matcher = pattern.matcher(sc.nextLine());

        while (matcher.find()) {
            //find() will stop when it finds what it is looking for
            System.out.println(matcher.group() + " at start index: " + matcher.start() + " and end index: " + matcher.end());
        }

        if (matcher.matches()) {
            //matches tries to match the expression against the entire string and implicitly add
            // a ^ at the start and $ at the end of your pattern, meaning it will not look for a substring
            //Thus outputs false
        } else {
            System.out.println(matcher.matches());
        }
    }
}
