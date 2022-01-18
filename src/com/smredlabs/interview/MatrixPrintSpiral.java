package com.smredlabs.interview;

public class MatrixPrintSpiral {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int startRowIndex = 0;
        int startColIndex = 0;
        int endRowIndex = matrix.length - 1;
        int endColIndex = matrix[0].length - 1;

        while (startRowIndex < endRowIndex && startColIndex < endColIndex) {
            //print top row
            for (int j = startRowIndex; j <= endColIndex; j++) {
                System.out.print(matrix[startRowIndex][j] + " ");
            }
            //print right column
            for (int i = startRowIndex + 1; i <= endRowIndex; i++) {
                System.out.print(matrix[i][endColIndex] + " ");
            }
            //print bottom row in reverse
            for (int j = endColIndex - 1; j >= startColIndex; j--) {
                System.out.print(matrix[endColIndex][j] + " ");
            }
            //print first column from top to bottom
            for (int i = endRowIndex - 1; i > startRowIndex; i--) {
                System.out.print(matrix[i][startColIndex] + " ");
            }
            startRowIndex++;
            startColIndex++;
            endRowIndex--;
            endColIndex--;
        }
    }
}
