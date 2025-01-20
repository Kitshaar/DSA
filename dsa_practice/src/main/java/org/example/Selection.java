package org.example;

public class Selection {

    public static <T extends Comparable<T>> void sort(T[] a)
    {
        int N = a.length;
        for (int i = 0; i < N; i++)
        {
            int min = i;
            for (int j = i + 1; j< N; j++)
            {
                if (less(a[j], a[min]))
                {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    private static <T extends Comparable<T>> boolean less(T v, T w)
    {
        return v.compareTo(w) < 0;
    }

    private static <T extends Comparable<T>> void exch(T[] a, int value1, int value2)
    {
        T swap = a[value1];
        a[value1] = a[value2];
        a[value2] = swap;

    }
    private static <T extends Comparable<T>> boolean isSorted(T[] a)
    {
        for (int i = 1; i < a.length; i++  )
        {
            if (less(a[i], a[i-1]))
                return false;
        }
        return true;
    }
}




