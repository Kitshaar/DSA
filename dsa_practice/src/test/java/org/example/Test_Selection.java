package org.example;

public class Test_Selection{


    // 5 mistakes in implementing sort method. try again tomorrow.
    // 2 mistakes in implementing less method. try again tomorrow.

    public static <T extends Comparable<T>> void sort(T[]a)
    {
        for (int i = 0; i < a.length; i++) {
           int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(j , i))
                    min = j;
            }
            exch(a , i, min);

        }

    }

    public static <T extends Comparable<T>> void exch(T[] a , int i, int j)
    {
        T swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static <T extends Comparable<T>> boolean less(T a, T b)
    {
        return a.compareTo(b) < 0;
    }
}
