package com.smredlabs.genexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HrTagExtractor {
    public static void main(String[] args) {
        String htmlText =
                "<h1>Nayeem loves counseling</h1>" +
                        "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>" +
                        "<Amee>safat codes like a ninja</amee>" +
                        "<SA premium>Imtiaz has a secret crush</SA premium>";
        //Pattern pattern = Pattern.compile("<([\\w ]+)>(.*)</([\\w ]+)>");
        Pattern pattern = Pattern.compile("<h1>.*?</h1>");
        Matcher matcher = pattern.matcher(htmlText);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
