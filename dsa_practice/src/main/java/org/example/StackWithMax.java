package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackWithMax implements Iterable<Integer> {

    private Node first = null;

    private class Node
    {
        int item;
        int max;
        Node next;
    }

    public boolean isEmpty() {return first == null;}

    public void push(int item)
    {
        int currentMax = (first == null)? item : Math.max(item, first.max);
        Node oldFirst = first;
        first = new Node();
        first.next = oldFirst;
        first.max = currentMax;
        first.item = item;

    }

    public int pop()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("Stack is empty.");
        }
        int item = first.item;
        first = first.next;
        return item;
    }

    public int getMax()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("Stack is empty.");
        }
        return first.max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator();
    }

    public class StackIterator implements Iterator<Integer>
    {

        private Node current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            if (current == null)
                throw new NoSuchElementException("Stack is empty");
            int item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
           throw new UnsupportedOperationException("This method is not allowed.");
        }
    }

}
