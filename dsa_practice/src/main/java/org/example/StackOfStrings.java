package org.example;

public class StackOfStrings {


    // Time complexity for each operation is O(1) in worst case scenarios
    // Space complexity depends on the language used, here it's java.
    // Thus class overhead is 16 bytes, inner class overhead is 8 bytes, reference to String is 8 bytes
    // reference to Node is 8 bytes. overall 40 bytes but the string value is not calculated.

    private Node first = null;

    private class Node
    {
        String value;
        Node next;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public void push(String s) {
        Node oldFirst = first;
        first = new Node();
        first.value = s;
        first.next = oldFirst;
    }

    public String pop() {
        String item = first.value;
        first = first.next;
        return item;
    }
}
