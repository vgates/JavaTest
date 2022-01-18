package com.smredlabs.genexample;

public class StringExample2 {
    public static void main(String[] args) {
        String a = "stack";
        System.out.println(a);//prints stack
        a = a.concat(" overflow");
        System.out.println(a);//if mutable it would print overflow
    }
}
