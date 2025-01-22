package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Test_QueueOfLinkedList<Item> implements Iterable<Item>{

    private Node first, last;

    private class Node
    {
        Item item;
        Node next = null;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public void enqueue(Item item)
    {
      Node oldLast = last;
      last = new Node();
      last.item = item;
      last.next = null;
      if (isEmpty())
          first = last;
      else
          oldLast.next = last;
    }

    public Item dequeue()
    {
        Item item = first.item;
        first = first.next;
        if (isEmpty())
            last = null;

        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item>
    {

        private Node current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (current == null)
                throw new NoSuchElementException("empty queue");
            Item item = current.item;
            current = current.next;

            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported");
        }
    }
}
