package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Test_StackWithMax implements Iterable<Integer>{

    private Node first = null;

    @Override
    public Iterator<Integer> iterator() {
        return new StackMaxIterator();
    }

    private class Node
    {
        int value;
        int max;
        Node next;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public void push(int item)
    {
        Node oldFirst = first;
        first = new Node();
        first.value = item;
        first.next = oldFirst;
        first.max = (oldFirst == null) ? item : Math.max(item, oldFirst.max);
    }

    public int max() {return first.max;}

    public int pop()
    {
        int item = first.value;
        first = first.next;
        return item;
    }

    private class StackMaxIterator implements Iterator<Integer>
    {

        private Node current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            if (current == null)
            {
                throw new NoSuchElementException("Empty stack.");
            }
            int item = current.value;
            current = current.next;
            return item;
        }
    }
}
