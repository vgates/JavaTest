package com.smredlabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 5, 7, 5, 5, 6, 8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], i);
        }

        System.out.println(hashMap.keySet());

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("e");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("a");
        arrayList.add("c");

        System.out.println(arrayList);

        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.println(hashSet);


        String s = "Vinod";
        System.out.println(s.substring(2, 3));


        int size = 6;
        for (int i = size; i != 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
