package com.smredlabs.genexample;

import java.util.*;

public class GeneralExample {
    public static void main(String[] args) {
        long largeNumber = 3_123_456_789L;
        PriorityQueue<String> queue = new PriorityQueue<String>();//Creating
        queue.add("Ravis");//Adding object in arraylist
        queue.add("Vijay");
        queue.add("Vinu");
        queue.add("Vini");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        //Traversing list through Iterator
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
