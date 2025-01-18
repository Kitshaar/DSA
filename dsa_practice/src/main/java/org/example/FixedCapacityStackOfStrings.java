package org.example;

public class FixedCapacityStackOfStrings {
    private String [] s;
    private Integer n = 0;

    public FixedCapacityStackOfStrings() {}
    public FixedCapacityStackOfStrings(int capacity)
    {
        s = new String[capacity];
    }

    public boolean isEmpty()
    {
        return n == 0;
    }

    public void push(String value)
    {
        s[n++] = value;
    }

    public String pop()
    {
        String item = s[--n];
        s[n] = null;
        return item;
    }

}
