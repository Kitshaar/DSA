package org.example;

import java.util.ArrayList;

public class AllDivisors {
    static void printAllDivisors(int number)
    {
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrt = (int) Math.sqrt(number);
        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0)
                divisors.add(i);

            if (i != number/i)
                divisors.add(number/i);
        }

        divisors.sort(null);

        System.out.println(divisors);
    }

    public static void main(String[] args) {
        printAllDivisors(36);
        printAllDivisors(12);
    }
}
