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
        Integer[] a = new Integer[10000];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) ( Math.random() * (10 + i));
        }
        Test_Mergesort.sort(a);
        int counter = 0;
        for (int value : a) {
            if (counter % 10 == 0) {
                System.out.println();
            }
            System.out.print(value + "   ");

            counter++;
        }
    }
}
