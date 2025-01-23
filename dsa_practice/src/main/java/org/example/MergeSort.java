package org.example;

public class MergeSort {

    private static<T extends Comparable<T>> void sort(T[]a)
    {
        /*
        Creating aux array here because if we make it inside the other
        sort, it will create a lot of arrays each time it is called,
        increasing the space complexity
         */
        T[] aux = (T[]) new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private static <T extends Comparable<T>> void sort(T[]a, T[] aux, int lo, int hi)
    {
        /*
        Statement to stop recursion.
        If hi is smaller than or equal to lo, that means array only has one element remaining.
         */
        if (hi <= lo)
        {
            return;
        }

        // Assigns mid here so every time we call sort, it has a new lo, mid and hi
        int mid = lo + (hi - lo) / 2;
        // Divide the array into two parts and sort them individually before merging.
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        if (!less(a[mid+1], a[mid])) return;
        merge(a, aux, lo, mid , hi);
    }




    /*
    Take an array that's
    divided into 2 parts and sorted.
    Take an extra array to help copy the contents back and forth.
    Take 3 positional integers: lo, mid and hi pointing
     at start, mid and end values respectfully.
     */
    private static < T extends Comparable<T>> void merge(T[]a, T[]aux, int lo, int mid, int hi)
    {
        /*
        Assert if 2 parts of array is sorted individually.
        Then copy the whole array into auxiliary array so full sorted array
        can be added to the original array.
         */
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);

        for (int k = lo; k <= hi; k++) {
            aux [k] = a[k];
        }

        /*
        loop aux array from lo to hi, and check if first half is fully added
        else if second half is fully added
        else if value at first half is smaller
        else value at second half is smaller
         */
        int i = lo;
        int j = mid+1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (less(aux[i],aux[j] )) {
                a[k] = aux[i++];
            }
            else
                a[k] = aux[j++];
        }

        assert isSorted(a,lo, hi);
    }
    private static < T extends Comparable<T>> boolean less(T a, T b)
    {
        return a.compareTo(b) < 0;
    }

    /*
    loop the given array from int a to int b and check
    if array is sorted
     */
    private static <T extends Comparable<T>> boolean isSorted(T[] a, int i , int j)
    {
        for (int k = i + 1; k < j; k++) {
            if (less(a[k], a[k-1]))
                return false;
        }
        return true;
    }
}
