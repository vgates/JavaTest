package com.smredlabs.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    Node first;
    Node last;
    int noOfNodes = 0;

    public int size() {
        return noOfNodes;
    }

    public int sizeThroughIteration() {
        //not a good method as we have to iterate
        //through the entire elements
        Node currentNode = first;
        int i = 0;
        while (currentNode != null) {
            currentNode = currentNode.next;
            i++;
        }
        return i;
    }

    public int indexOf(int value) {
        Node currentNode = first;
        int i = 0;
        while (currentNode != null) {
            if (currentNode.value == value)
                return i;
            currentNode = currentNode.next;
            i++;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) >= 0;
    }

    public void add(int value) {
        addLast(value);
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (first == null)
            last = node;
        else
            node.next = first;
        first = node;
        noOfNodes++;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (last == null)
            first = node;
        else
            last.next = node;
        last = node;
        noOfNodes++;
    }

    public void removeFirst() {
        if (first == null)
            throw new NoSuchElementException();

        //if single element
        if (first == last) {
            first = last = null;
            noOfNodes--;
            return;
        }

        //we need to remove all the reference to and from the first node
        //so that the node is removed by the garbage collector
        Node secondNode = first.next;
        first.next = null;
        first = secondNode;
        noOfNodes--;
    }

    public void removeLast() {
        if (last == null)
            throw new NoSuchElementException();

        //if single element
        if (first == last) {
            first = last = null;
            noOfNodes--;
            return;
        }

        last = getSecondLastNode();
        last.next = null;
        noOfNodes--;
    }

    private Node getSecondLastNode() {
        Node currentNode = first;
        Node prevNode = null;
        while (currentNode != null) {
            if (currentNode.next != null)
                prevNode = currentNode;
            currentNode = currentNode.next;
        }
        return prevNode;
    }

    public int getFirst() {
        return first.value;
    }

    public int getLast() {
        return last.value;
    }

    public int[] toArray() {
        int[] array = new int[size()];
        Node currentNode = first;
        int i = 0;
        while (currentNode != null) {
            array[i] = currentNode.value;
            i++;
            currentNode = currentNode.next;
        }
        return array;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        Node node = first;
        while (node != null) {
            stringBuilder.append(node.value + ", ");
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
