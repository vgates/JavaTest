package com.smredlabs.genexample;

//Ref: https://www.geeksforgeeks.org/jagged-array-in-java/?ref=lbp
//Jagged array - array of arrays such that member arrays can be of different sizes.
//We can create a 2-D array but with a variable number of columns in each row.
public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[][]{
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
