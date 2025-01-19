package org.example;

import java.util.Iterator;

public class StackOfArray<Item> implements Iterable<Item>{
    private Item [] s;
    private Integer n = 0;

    public StackOfArray()
    {
        s = (Item[]) new Object[10];
    }

    public boolean isEmpty()
    {
        return n == 0;
    }

    public void push(Item value)
    {
        // To increase the capacity of the array by 1.5 times each time array is found full
        // Time complexity of 0(3N)
        if (s.length == n)
            resize(1.5 * s.length);
        s[n++] = value;
    }

    private void resize(double v) {
        Item [] copy = (Item[]) new Object[(int) v];
        for (int i = 0; i < n; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }

    public Item pop()
    {
        Item item = s[--n];
        s[n] = null;
        // Array will remain full between 25% to 100%
        // Time complexity remains O(N)
        if (n > 0 && n == s.length/4)
            resize( (double) s.length /2);
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>
    {
        private  int i = n;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return s[--i];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("This function is not supported by our implementation.");
        }
    }
}
