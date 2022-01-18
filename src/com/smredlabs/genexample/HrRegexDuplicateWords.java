package com.smredlabs.genexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HrRegexDuplicateWords {
    public static void main(String[] args) {
        String A = "I love Love to To to play Play PLAY in inviolin";
        Pattern pattern = Pattern.compile("\\b(\\w+)( +\\1\\b)+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(A);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
