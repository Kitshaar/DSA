package org.example;

public class isPalindrome {

    static void checkPalindrome(int value)
    {
        int rev = 0;
        int copy = value;
        while (copy > 0)
        {
            rev = (rev * 10) + (copy % 10);
            copy = copy/10;
        }
        if (rev == value)
            System.out.println("Palindrome Number.");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        checkPalindrome(4554);
        checkPalindrome(7789);
    }
}
