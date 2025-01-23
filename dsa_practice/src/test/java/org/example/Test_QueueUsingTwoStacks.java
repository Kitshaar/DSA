package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Test_QueueUsingTwoStacks<I>{

    private final Test_StackOfArray<I> first = new Test_StackOfArray<>();
    private final Test_StackOfArray<I> last = new Test_StackOfArray<>();

    private boolean isEmpty()
    {
        return first.isEmpty() && last.isEmpty();
    }

    public void enqueue(I item)
    {
        first.push(item);
    }

    public I dequeue()
    {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");
        if (last.isEmpty())
        {
            while(!first.isEmpty())
                last.push(first.pop());
        }
        return last.pop();
    }

}
