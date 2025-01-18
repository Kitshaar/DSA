package org.example;

public class FixedCapacityStackOfStrings {
    private String [] s;
    private Integer n = 0;

    public FixedCapacityStackOfStrings()
    {
        s = new String[10];
    }

    public boolean isEmpty()
    {
        return n == 0;
    }

    public void push(String value)
    {
        // To increase the capacity of the array by 1.5 times each time array is found full
        // Time complexity of 0(3N)
        if (s.length == n)
            resize(1.5 * s.length);
        s[n++] = value;
    }

    private void resize(double v) {
        String [] copy = new String[(int) v];
        for (int i = 0; i < n; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }

    public String pop()
    {
        String item = s[--n];
        s[n] = null;
        // Array will remain full between 25% to 100%
        // Time complexity remains O(N)
        if (n > 0 && n == s.length/4)
            resize( (double) s.length /2);
        return item;
    }

}
