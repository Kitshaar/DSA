package org.example;


public class Gcf {

    static int findGcf(int value1, int value2)
    {
        while (value1 > 0 && value2 > 0)
        {
            if (value1 > value2)
                value1 = value1 % value2;
            else
                value2 = value2 % value1;

        }
        if (value1 == 0)
            return value2;
        else
            return value1;
    }

    public static void main(String[] args) {
        System.out.println(findGcf(9, 12));
        System.out.println(findGcf(20, 15));
    }
}
