package org.example;

import junit.framework.TestCase;


import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    public static void main( String[] args )
    {
        Integer[] a = new Integer[]{4,2,1,3,5};
        Test_Insertion.sort(a);
        for (int value : a)
          System.out.println(value);

    }
}
