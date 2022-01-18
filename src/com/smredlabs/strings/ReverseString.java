package com.smredlabs.strings;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        reverseStringUsingStack(string);
    }

    private static void reverseStringUsingStack(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        
        System.out.println("Reverse of the string is ");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(stack.pop());
        }
    }

    private static void reverseString4(String string) {
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            characterList.add(string.charAt(i));
        }
        Collections.reverse(characterList);
        System.out.println("Reverse of the string is ");
        ListIterator li = characterList.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
    }

    private static void reverseString3(String string) {
        StringBuilder revString = new StringBuilder(string);
        System.out.println("Reverse of the string is " + revString.reverse());
    }

    private static void reverseString2(String string) {
        String revString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            revString += string.charAt(i);
        }
        System.out.println("Reverse of the string is " + revString);
    }

    private static void reverseString(String string) {
        System.out.println("Reverse of the string is ");
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
    }
}
