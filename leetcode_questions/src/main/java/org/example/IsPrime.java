package org.example;

import java.util.ArrayList;

public class IsPrime {
    static void checkPrime(int number)
    {
        if (number <= 1) {
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime = true;
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("Prime Number.");
        else
            System.out.println("Not Prime");
    }

    public static void main(String[] args) {
        checkPrime(10);
        checkPrime(17);
        checkPrime(5);
    }
}
