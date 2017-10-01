package com.derek;

import java.util.ArrayList;
import java.util.List;

import static com.derek.Main.print;
import static com.derek.Main.println;


public class Solution {
    public List<Integer> lexicalOrder(int n) {
        final int digits = 1 + (int)Math.floor(Math.log10(n));
        println("digits:" + digits);
        List<Integer> result = new ArrayList<>(n);




        // l: leading digit, d: digit length
        for (int l = 1; l <= Math.min(9, n); l++) {
            for (int d = 1; d <= digits; d++) {

            }

            calculateLeadingDigit(n, l, result);
        }
        return result;
    }

    public void calculateLeadingDigit(int max, int startingDigit, List<Integer> result) {
        println("calculateLeadingDigit:" + startingDigit);
        result.add(startingDigit);
    }
    public void calculateLeadingDigit(int maxNumber, int maxDigitLength, int startingDigit, int currentDigitLength, List<Integer> result) {
        println("calculateLeadingDigit:" + startingDigit);
        result.add(startingDigit);
    }
}
