package org.example;

public class Insertion {

    private static <T extends Comparable<T>> void sort(T[] a)
    {
        int N = a.length;
        for (int i = 0; i < N; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (less(a[j], a[j-1]))
                    exch(a, j, j-1);
                else break;
            }
        }
    }

    private static <T extends Comparable<T>> boolean less(T v, T w)
    {
        return v.compareTo(w) < 0;
    }

    private static <T extends Comparable<T>> void exch(T[] a, int i, int j)
    {
        T swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static <T extends Comparable<T>> boolean isSorted(T[] a)
    {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }
        return true;
    }
}
