package org.example;

import java.util.Random;

public class Shuffle {


    private static <T extends Comparable<T>> void sort(T[]a)
    {
        int N = a.length;

        for (int i = 0; i < N; i++)
        {
            int r = (int) (Math.random() * (i + 1));
            exch(a, i, r);
        }
    }

    private static <T extends Comparable<T>> void exch(T[] a, int i, int j)
    {
        T swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
