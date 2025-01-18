package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        FixedCapacityStackOfStrings fixedStack = new FixedCapacityStackOfStrings();
        StackOfStrings stack = new StackOfStrings();
        // Creating a test case for the StackOfStings Linked list implementation
        // Chose to use Collection api to store values instead to getting values from the console or
        // a file
        List<String> todo = Arrays.asList("to ", "be ", "or ", "not ", "to ",
                "- ", "be ", "- ", "- ", "that ", "- ", "- ", "- ", "is ");
        for (String s : todo)
        {
            if (s.equals("- "))
                System.out.print(stack.pop());
            else
                stack.push(s);
        }
        System.out.println();
        for (String s : todo)
        {
            if (s.equals("- "))
                System.out.print(fixedStack.pop());
            else
                fixedStack.push(s);
        }

    }
}
