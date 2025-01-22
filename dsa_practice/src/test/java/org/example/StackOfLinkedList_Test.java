package org.example;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackOfLinkedList_Test<Item> implements Iterable<Item> {

    private Node first = null;

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class Node
    {
        Item item;
        Node next;
    }

    public void push(Item item)
    {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public boolean isEmpty() {return first == null;}

    public Item pop()
    {
        Item item = first.item;
        first = first.next;
        return item;
    }

    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;

        @Override
        public boolean hasNext() {
          return current != null;
        }

        @Override
        public Item next() {
         if (current == null)
             throw new NoSuchElementException("Empty stack.");
         Item item = current.item;
         current = current.next;
         return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("This method is not allowed.");
        }
    }
}