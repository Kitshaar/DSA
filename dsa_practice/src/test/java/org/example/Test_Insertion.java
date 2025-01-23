package org.example;

public class Test_Insertion {

    // try again tomorrow. still needs improvement.
    public static <T extends Comparable<T>> void sort(T[]a)
    {
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j > 0 ; j--) {
                if (less(a[j], a[j-1]))
                    exch(a, j, j-1);
                else break;
            }
        }
    }

    private static <T extends Comparable<T>> void exch(T[] a, int i, int j)
    {
        T swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static <T extends Comparable<T>> boolean less (T a, T b)
    {
        return a.compareTo(b) < 0;
    }
}
