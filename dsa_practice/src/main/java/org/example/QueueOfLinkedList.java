package org.example;

import javax.naming.OperationNotSupportedException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueOfLinkedList<Item> implements Iterable<Item>{
    private Node first;
    private Node last;

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class Node
    {
        Item value;
        Node next;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public void enqueue(Item item)
    {
        Node oldLast = last;
        last = new Node();
        last.value = item;
        last.next = null;
        // Special case for empty queue
        if (isEmpty())
            first = last;
        else
            oldLast.next = last;
    }

    public Item dequeue()
    {
        Item item = first.value;
        first = first.next;
        // Special case for empty queue
        if (isEmpty())
            last = null;

        return item;
    }

    private class QueueIterator implements Iterator<Item>
    {

        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (current == null)
            {
                throw new NoSuchElementException("There are no more elements in the queue.");
            }
            Item item = current.value;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            throw  new UnsupportedOperationException("This function is not supported by our implementation.");
        }
    }
}
