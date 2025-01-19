package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackOfLinkedList<Item> implements Iterable<Item>{


    // Time complexity for each operation is O(1) in worst case scenarios
    // Space complexity depends on the language used, here it's java.
    // Thus class overhead is 16 bytes, inner class overhead is 8 bytes, reference to String is 8 bytes
    // reference to Node is 8 bytes. overall 40 bytes but the string value is not calculated.

    private Node first = null;

    private class Node
    {
        Item value;
        Node next;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public void push(Item s) {
        Node oldFirst = first;
        first = new Node();
        first.value = s;
        first.next = oldFirst;
    }

    public Item pop() {
        Item item = first.value;
        first = first.next;
        return item;
    }

    // Implementing iterator to use for each

    @Override
    public Iterator<Item> iterator()
    {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;
        public boolean hasNext()
        {
            return current != null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("This function is not supported by our implementation.");
        }

        @Override
        public Item next() {

            if (current == null) {
                throw new NoSuchElementException("There are no more elements in the stack.");
            }
                Item item = current.value;
                current = current.next;
                return item;

        }
    }

}
