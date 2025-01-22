package org.example;

import java.util.NoSuchElementException;

public class QueueUsingTwoStacks<Item> {
    private StackOfLinkedList<Item> firstStack = new StackOfLinkedList<>();
    private StackOfArray<Item> secondStack = new StackOfArray<>();

    public boolean isEmpty ()
    {
        return firstStack.isEmpty() && secondStack.isEmpty();
    }

    public void enqueue(Item item)
    {
        firstStack.push(item);
    }

    public Item dequeue()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("Queue is empty.");
        }
        if (secondStack.isEmpty())
        {
            while (!firstStack.isEmpty())
                secondStack.push(firstStack.pop());
        }
        return secondStack.pop();
    }

    private void logic()
    {

    }

}
