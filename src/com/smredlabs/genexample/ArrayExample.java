package com.smredlabs.genexample;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        //Array literals are used when size of the array and variables are already known
        int[] intArray = new int[]{3, 4, 2, 1, 6, 7, 9, 8};

        char[] charArray = new char[]{'a', 'e', 'i', 'o', 'u'};

        //accessing the array elements
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println("===============================");

        //Arrays.toString() method is used to return a string representation of an array
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(charArray));

        System.out.println("===============================");

        //Append char array with String
        StringBuilder stringBuilder = new StringBuilder("Vowels: ");
        stringBuilder.append(charArray);
        System.out.println(stringBuilder);

        System.out.println("===============================");

        //Creating an array of Student object
        Student[] students = new Student[5];
        students[0] = new Student(59, "Vinod K");
        students[1] = new Student(60, "Vysakhan K P");
        //Accessing Student array using for loop
        for (int i = 0; i < students.length; i++) {
            try {
                System.out.println(students[i].getRollno() + "-" + students[i].getName());
            } catch (NullPointerException e) {
            }
        }

        System.out.println("===============================");


        //Accepting input from the user
        students[2] = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student roll no: ");
        students[2].setRollno(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter student name: ");
        students[2].setName(scanner.nextLine());

        //Accessing Student array using foreach
        for (Student s : students) {
            try {
                System.out.println(s.getRollno() + "-" + s.getName());
            } catch (NullPointerException e) {
            }
        }

        System.out.println("===============================");

        //MultiDimensional Array
        int[][] twoDArray = new int[5][5];
        int[][] twoDArray1 = {{1, 2, 3}, {4, 5, 6}}; // direct method of declaration

        twoDArray[0][0] = 1;
        System.out.println("Two D Array [0][0]: " + twoDArray[0][0]);
        System.out.println("No of Rows in twoDArray1: " + twoDArray1.length);
        System.out.println("No of Columns in twoDArray1: " + twoDArray1[0].length);

        //Representing 2 D array in a table format
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoDArray1[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
