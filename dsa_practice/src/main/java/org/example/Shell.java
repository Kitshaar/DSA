package org.example;

public class Shell {

    private static <T extends Comparable<T>> void sort(T[] a)
    {
        int N = a.length;
        int h = 1;
        while (h < N/3)
            h = 3* h + 1; // 1, 4, 13, 40

        while (h >= 1)
        {
            for (int i = h; i < N; i++)
            {
                for (int j = i; j > h && less(a[j], a[j-h]); j -= h)
                {
                    exch(a, j, j-h);
                }
            }
            h = h/3;
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
