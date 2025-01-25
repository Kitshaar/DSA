package org.example;

public class Test_Mergesort {

    /*
    Made a few mistakes in merge, try again tomorrow.
     */
    public static <T extends Comparable<T>>  void sort(T[]a)
    {
        T[] aux = (T[]) new Comparable[a.length];
        sort(a, aux, 0, a.length-1);
    }

    private static <T extends Comparable<T>> void sort(T[]a, T[]aux, int lo, int hi)
    {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        if (!less(a[mid+1], a[mid])) return;
        merge(a, aux, lo, mid, hi);
    }

    private static <T extends Comparable<T>> void merge(T[]a, T[] aux, int lo, int mid, int hi)
    {
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);

        for (int i = lo; i <= hi ; i++) {
            aux[i] = a[i];
        }

        int j = lo;
        int k = mid+1;
        for (int i = lo; i <= hi; i++) {
            if (j > mid) a[i] = aux[k++];
            else if (k > hi) a[i] = aux[j++];
            else if (less(aux[j], aux[k] ))
                a[i] = aux[j++];
            else
                a[i] = aux[k++];
        }
    }

    private static <T extends Comparable<T>> boolean less(T a, T b)
    {
        return a.compareTo(b) < 0;
    }

    private static <T extends Comparable<T>> boolean isSorted(T[]a, int i, int j)
    {
        for (int k = i+1; k < j; k++) {
            if (less(a[k], a[k-1]))
                return false;
        }
        return true;
    }
}
