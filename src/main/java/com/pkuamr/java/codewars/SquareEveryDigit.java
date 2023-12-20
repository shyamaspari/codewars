package com.pkuamr.java.codewars;

public class SquareEveryDigit
{
    /**
     * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
     *
     * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
     *
     * Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)
     *
     * Note: The function accepts an integer and returns an integer.
     *
     * Happy Coding!
     */
    public int squareDigits1(int n) {
        String abcd="";
        int[] digits = Integer.toString(n).chars().map(c -> c-'0').toArray();
        for(int d : digits){
            d=d*d;
            abcd=abcd+d;
        }
        return Integer.parseInt(abcd);
    }

    public int squareDigits2(int n) {

        String strDigits = String.valueOf(n);
        String result = "";

        for (char c : strDigits.toCharArray()) {
            int digit = Character.digit(c, 10);
            result += digit * digit;
        }

        return Integer.parseInt(result);
    }
}