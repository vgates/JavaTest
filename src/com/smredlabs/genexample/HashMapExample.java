package com.smredlabs.genexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 5, 4, 4, 0};

        // HashMap stores the data in (Key, Value) pairs
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // adding array elements to the HashMap
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(i, arr[i]);
        }

        System.out.println("Printing HashMap: " + hashMap.toString());
        System.out.println("Printing Values: " + hashMap.values());
        System.out.println("HashMap value with index 6: " + hashMap.get(6));

        System.out.println("HashMap Size: " + hashMap.size());

        System.out.println("Does HashMap contains value 7? " + hashMap.containsValue(7));
        System.out.println("Does HashMap contains value 4? " + hashMap.containsValue(4));

        // printing hashmap values one by one
        for (int i = 0; i < arr.length; i++) {
            System.out.print(hashMap.get(i) + ", ");
        }
        System.out.println("");

        //HashMap doesnt allow duplicate keys but allows duplicate values.
        HashMap<Integer, Integer> hashMap3 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap3.put(arr[i], arr[i]);
        }
        System.out.println("Printing hashmap keyset: " + hashMap3.keySet());

        // Defining another HashMap
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("vinod", 35);
        hashMap1.put("vini", 28);
        hashMap1.put("rad", 30);
        //iterating the hashmap
        for (Map.Entry<String, Integer> e : hashMap1.entrySet()) {
            System.out.println("Key: " + e.getKey() + " | Value: " + e.getValue());
        }

        //Internally hashmap is implemented as a linkedlist
        //contains  4 fields: int hash, key, value & Node next
        //HashMap is unsynchronized i.e. multiple threads can access it simultaneously.
        //HashMap is useful when we need efficient implementation of search, insert and delete operations.

    }
}
