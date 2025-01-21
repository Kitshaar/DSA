package org.example;

import java.util.Iterator;

public class Test_StackOfArray<Item> implements Iterable<Item> {

    private Item[] stack;
    private int N = 0;

    public Test_StackOfArray()
    {
        stack = (Item[]) new Object[10];
    }

    public boolean isEmpty()
    {
        return stack[0] == null;
    }

    public void push(Item item)
    {
        if (stack.length == N)
            resize( stack.length * 2);
        stack[N++] = item;
    }

    public Item pop()
    {
        Item item = stack[--N];
        stack[N] = null;
        if (N > 0 && stack.length == N/4)
            resize((stack.length/2));
        return item;
    }

    private void resize(int newCapacity)
    {
        Item[] newStack = (Item[]) new Object[newCapacity];
        for (int i = 0; i < stack.length; i++)
        {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator<Item>
    {
        private int i = N;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return stack[--i];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("This operation is not supported.");
        }
    }
}
