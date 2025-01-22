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
        return N == 0;
    }

    public void push(Item item)
    {
        if (N == stack.length)
            resize(stack.length * 2);
        stack[N++] = item;
    }

    public Item pop()
    {
        Item item = stack[--N];
        stack[N] = null;
        if (N > 0 && N == stack.length/4)
            resize(stack.length/2);
        return item;
    }

    private void resize(int i) {
        Item[] newStack = (Item[]) new Object[i];
        for (int j = 0; j < stack.length; j++) {
            newStack[j] = stack[j];
        }
        stack = newStack;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator<Item>
    {

         int i = N;
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
            throw new UnsupportedOperationException("Not allowed");
        }
    }
}
