package org.example;

public class Test_Selection{


    // Encountered problems with condition of if in sort method but
    // solved the issue without looking at answer.
    public static <T extends Comparable<T>> void sort(T[]a)
    {
        for (int i = 0; i < a.length; i++) {

            int min = i;
            for (int j = i +1 ; j < a.length; j++) {
                if (less(a[j], a[min]))
                {
                    min = j;
                }
            }
            exch(a, min, i);
        }
    }

    private static <T extends Comparable<T>> void exch(T[] a , int i, int j)
    {
        T swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static <T extends Comparable<T>> boolean less(T a, T b)
    {
        return a.compareTo(b) < 0;
    }
}
