package org.example;



public class Test_Shuffle {

    public static< T extends Comparable<T>> void sort(T[]a)
    {
        for (int i = 0; i < a.length; i++) {
            int r = (int) (Math.random() * (i +1));
            exch(a, i, r);
        }
    }

    private static <T extends Comparable<T>> void exch(T[]a, int i, int j)
    {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
