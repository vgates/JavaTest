package com.smredlabs.binarysearchtree;

public class MainTree {
    public static void main(String[] args) {
        Bst bst = new Bst();
        bst.insert(7);
        bst.insert(4);
        bst.insert(9);
        bst.insert(1);
        bst.insert(6);
        bst.insert(8);
        bst.insert(10);
        System.out.println(bst.find(1));
        bst.traversePostorder();
    }
}
