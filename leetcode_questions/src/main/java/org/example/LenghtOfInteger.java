package org.example;

public class LenghtOfInteger {

    private static int count(int value)
    {
        int result = 0;
        value = (value < 0) ? - value : value;
        while(value != 0)
        {
            value = value/10;
            result++;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(count(12345));
        System.out.println(count(8832));
    }
}
