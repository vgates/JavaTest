package com.smredlabs.genexample;

//Ref: https://www.geeksforgeeks.org/string-vs-stringbuilder-vs-stringbuffer-in-java/
public class StringBuilderBuffer {

    static void concatString(String string1) {
        string1 = string1 + "Vinod";
    }

    static void concatStringBuilder(StringBuilder string2) {
        string2.append("Vinod");
    }

    static void concatStringBuffer(StringBuffer string3) {
        string3.append("Vinod");
    }

    public static void main(String[] args) {
        String string1 = "Hello my dear ";
        concatString(string1);
        System.out.println(string1);
        //In the above case concat is not occurring bcoz String is immutable
        //Changing the value of string creates another object

        StringBuilder string2 = new StringBuilder("Hello my dear ");
        concatStringBuilder(string2);
        System.out.println(string2);
        //In the above case concat was possible since StringBuilder is mutable

        StringBuffer string3 = new StringBuffer("Hello my dear ");
        concatStringBuffer(string3);
        System.out.println(string3);
        //In the above case also concat was possible since StringBuffer is mutable

        //Difference b/w StringBuilder and StringBuffer is that StringBuffer is thread-safe
        //i.e. StringBuffer can be used by multiple threads without any issue

        //Points to be noted:
        //If string is constant then use String class
        //If string will vary then and multiple threads will utilise it then use StringBuffer.
        //StringBuffer is synchronous
        //If string will vary and only a single thread will utilise it then use StringBuilder


        //Converting String to StringBuffer
        StringBuffer string4 = new StringBuffer(string1);
        string4.reverse();
        System.out.println(string4);


        //Converting from String to StringBuilder
        StringBuilder string5 = new StringBuilder(string1);
        string5.reverse();
        System.out.println(string5);


        //Converting StringBuilder or StringBuffer object to String
        String string6 = string5.toString();
        System.out.println(string6);


        //Converting StringBuffer to StringBuilder or vice-versa
        StringBuilder stringBuilder = new StringBuilder("I am a string");
        //There is no direct way to convert the same
        String string7 = stringBuilder.toString();
        StringBuffer stringBuffer = new StringBuffer(string7);
        System.out.println(stringBuffer);

    }
}
