package org.example;

public class IsArmstrong {

    static boolean checkArmstrong(int value)
    {
        int lenght = String.valueOf(value).length();
        int armstrong = 0;
        int copy = value;
        while ( copy > 0)
        {
            int lastDigit = copy % 10;
            armstrong = armstrong + (int) (Math.pow( lastDigit, lenght));
            copy = copy /10;
        }

        if (armstrong == value)
            return true;
        else
           return false;
    }

    public static void main(String[] args) {
        System.out.println(checkArmstrong(153));
        System.out.println(checkArmstrong(4553));
        System.out.println(checkArmstrong(371));
    }
}
