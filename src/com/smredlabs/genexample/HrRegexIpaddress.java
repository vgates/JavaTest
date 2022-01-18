package com.smredlabs.genexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HrRegexIpaddress {
    public static void main(String[] args) {
        String ipaddress = "192.168.120.1223";
        //Pattern pattern = Pattern.compile("[\\d]{3}.[\\d]{3}.[\\d]{3}.[\\d]{1,3}");
        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        Pattern pattern = Pattern.compile(zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255);
        Matcher matcher = pattern.matcher(ipaddress);
        if (matcher.matches()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
