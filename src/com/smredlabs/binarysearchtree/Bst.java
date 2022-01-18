package com.smredlabs.binarysearchtree;

public class Bst {
    class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public void insert(int value) {
        var newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        var currentNode = root;
        while (true) {
            if (value < currentNode.value) {
                if (currentNode.leftChild == null) {
                    currentNode.leftChild = newNode;
                    break;
                }
                currentNode = currentNode.leftChild;
            } else {
                if (currentNode.rightChild == null) {
                    currentNode.rightChild = newNode;
                    break;
                }
                currentNode = currentNode.rightChild;
            }
        }
    }

    public Boolean find(int value) {
        var currentNode = root;
        while (currentNode != null) {
            if (value < currentNode.value) {
                currentNode = currentNode.leftChild;
            } else if (value > currentNode.value) {
                currentNode = currentNode.rightChild;
            } else {
                return true;
            }
        }
        return false;
    }

    public void traversePreorder() {
        traversePreorder(root);
    }

    private void traversePreorder(Node node) {
        if (node == null) return;
        System.out.println(node.value);
        traversePreorder(node.leftChild);
        traversePreorder(node.rightChild);
    }

    public void traverseInorder() {
        traverseInorder(root);
    }

    private void traverseInorder(Node node) {
        if (node == null) return;
        traverseInorder(node.leftChild);
        System.out.println(node.value);
        traverseInorder(node.rightChild);
    }

    public void traversePostorder() {
        traversePostorder(root);
    }

    private void traversePostorder(Node node) {
        if (node == null) return;
        traversePostorder(node.leftChild);
        traversePostorder(node.rightChild);
        System.out.println(node.value);
    }
}
