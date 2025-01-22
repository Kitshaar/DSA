package org.example;


import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;

        // Loop is only running the length of string less 1 because we don't want to be out of bounds
        // when we grab a character that is situated at int i + 1 during the last loop.
        for (int i = 0; i < s.length() -1; i++) {
            // L I V I I
            //50 1 5 1 1
            // 0 1 2 3 4
            /*
             I am fetching two values in the hashmap that is == the character keys
             in the string at position i and i + 1.
             I then check if the value at i is smaller than value at i + 1.
             In the case it is, We are subtracting it from result
             otherwise, adding it to result.

             In the case of LIVII:
             i = 0: s[i] = 50, s[i+1] = 1 : result + 50
             i = 1: s[i] = 1, s[i+1] = 5 : result - 1
             i = 2: s[i] = 5, s[i+1] = 1 : result + 5
             i = 3: s[i] = 1, s[i+1] = 1 : result + 1
             i = 4 will be not be looped due to condition.
             result becomes : 50 -1 + 5 + 1 = 55
             */
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
                result -= map.get(s.charAt(i));
            else
                result += map.get(s.charAt(i));
        }
        // we are add the integer value co responding to the last character in the string because
        // we couldn't do it in the loop
        // s[4] = I and value at key I is 1
        // result becomes : 55 + 1 = 56
        result += map.get(s.charAt(s.length() - 1));
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));      // Output: 3
        System.out.println(romanToInteger.romanToInt("LVIII"));    // Output: 58
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));  // Output: 1994
        System.out.println(romanToInteger.romanToInt("LIVII")); // Output: 56
    }
}
