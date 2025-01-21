package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Stack Api
 *
 */
public class StackQueueTestApi
{


    public static void main( String[] args )
    {
        QueueOfLinkedList<String> queue = new QueueOfLinkedList<>();
        StackOfLinkedList<String> stack = new StackOfLinkedList<>();
        // Creating a test case for the StackOfStings implementations
        // Chose to use Collection api to store values instead to getting values from the console or
        // a file
        List<String> todo = Arrays.asList("to ", "be ", "or ", "not ", "to ",
                "- ", "be ", "- ", "- ", "that ", "- ", "- ", "- ", "is ");
        for (String s : todo)
        {
            if (s.equals("- "))
               // System.out.print(stack.pop());
                ;
            else {
                queue.enqueue(s);
                stack.push(s);
            }
        }
        for (String s : queue)
            System.out.print(s);


        System.out.println();

        for (String s : stack) {
            System.out.print(s);
        }

    }
}
