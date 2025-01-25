package org.example;

public class ReverseANumber {

    private static int reverse(int value)
        {
            int rev = 0;
            int copy = value;
            while (copy > 0)
            {
                rev = (rev * 10) + (copy % 10);
                copy = copy/10;
            }
           return rev;
        }

    public static void main(String[] args) {
        System.out.println(reverse(12700));
        System.out.println(reverse(6743));
    }
}
