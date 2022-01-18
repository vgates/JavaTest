package com.smredlabs.arrays;

public class LinearSearch {
    static int i = 0;

    public static void main(String[] args) {
        int[] array = {3, 5, 6, 17, 8, 9, 10};
        int searchFor = 10;

        //int index = linearSearchIterate(array, searchFor);
        int index = linearSearchRecursive(array, searchFor);

        System.out.println(index == -1 ? "Element not found" : "Element found at index " + index);
    }

    private static int linearSearchRecursive(int[] array, int searchFor) {
        if (i < array.length) {
            if (array[i] == searchFor)
                return i;
            i++;
            return linearSearchRecursive(array, searchFor);
        }
        return -1;
    }

    private static int linearSearchIterate(int[] array, int searchFor) {
        for (int i = 0; i < array.length; i++) {
            if (searchFor == array[i])
                return i;
        }
        return -1;
    }

}
