package com.smredlabs.interview;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String string = "vinod";
        reverse(string);
    }

    public static void reverse(String str) {
        Stack<Character> stack = new Stack<>();
        /*for (int i = 0; i < str.length(); i++) {
            stack.add(str.charAt(i));
        }*/
        for (char c : str.toCharArray()) {
            stack.add(c);
        }

        //String reversed = ""; // not a good method as new string is created for each modification through concatenation
        StringBuffer reversed = new StringBuffer();
        while (!stack.empty()) {
            reversed.append(stack.pop());
        }
        System.out.println(reversed);
    }
}
