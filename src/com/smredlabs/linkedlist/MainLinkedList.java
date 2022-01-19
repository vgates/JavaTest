package com.smredlabs.linkedlist;

import java.util.Arrays;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        System.out.println(linkedList);
        System.out.println("Size of linkedList = " + linkedList.size());

        System.out.println("Index of 30 = " + linkedList.indexOf(30));
        System.out.println("Index of 60 = " + linkedList.indexOf(60));
        System.out.println("Contains 30 ? " + linkedList.contains(30));
        System.out.println("Contains 60 ? " + linkedList.contains(60));

        System.out.println("Removing first node...");
        linkedList.removeFirst();
        System.out.println(linkedList);

        System.out.println("Removing last node...");
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println("Size of linkedList = " + linkedList.size());

        System.out.println("To array: " + Arrays.toString(linkedList.toArray()));
    }
}
