package com.smredlabs.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VariousInputMethods {

    public static void main(String[] args) {
        //scannerInput();
        //bufferedReaderInput();
        //consoleInput();
        readFromCmdArgs(args);
    }

    static void readFromCmdArgs(String[] args) {
        if (args.length > 0)
            for (String arg : args) {
                System.out.println(arg);
            }
        else
            System.out.println("No arguments found!");
    }

    static void consoleInput() {
        //will not work if you are running this program from an IDE
        System.out.println("Enter a number: ");
        String readInput = System.console().readLine();
        int number = Integer.parseInt(readInput);
        System.out.println("The number you entered is " + number);
    }

    static void bufferedReaderInput() {
        System.out.print("Enter a number: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readInput = null;
        try {
            readInput = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int number = Integer.parseInt(readInput);
        System.out.println("The number you entered is " + number);
    }

    static void scannerInput() {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("The number you entered is " + number);
    }

}
