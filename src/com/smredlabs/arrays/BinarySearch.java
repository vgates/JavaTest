package com.smredlabs.arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        //binary search is applied when the input is sorted
        int[] array = {3, 4, 5, 6, 7, 8, 9, 12, 32, 45, 60};
        int index = binarySearchIndex(array, 0, array.length, 9);
        System.out.println(index == -1 ? "Element not found" : "Element found at " + index);
    }

    //if we need to just know whether element is available or not
    private static int binarySearch(int[] array, int searchFor) {
        int mid = array.length / 2;
        int[] subarray;
        if (array.length == 0)
            return -1;
        if (searchFor == array[mid])
            return mid;
        else if (searchFor < array[mid]) {
            subarray = Arrays.copyOfRange(array, 0, mid);
            return binarySearch(subarray, searchFor);
        } else if (searchFor > array[mid]) {
            subarray = Arrays.copyOfRange(array, mid + 1, array.length);
            return binarySearch(subarray, searchFor);
        }
        return -1;
    }

    //if we need to know the exact index
    private static int binarySearchIndex(int[] array, int headIndex, int tailIndex, int searchFor) {
        if (tailIndex >= headIndex) {
            int mid = headIndex + (tailIndex - headIndex) / 2;
            if (searchFor == array[mid])
                return mid;
            else if (searchFor < array[mid]) {
                return binarySearchIndex(array, headIndex, mid, searchFor);
            } else if (searchFor > array[mid]) {
                return binarySearchIndex(array, mid + 1, tailIndex, searchFor);
            }
        }
        return -1;
    }
}
