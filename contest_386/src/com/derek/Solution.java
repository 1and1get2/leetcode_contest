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
        calculateLeadingDigit(n, 1, result);
        return result;
    }

    public void calculateLeadingDigit(int n, int cur, List<Integer> result) {
        println("calculateLeadingDigit:" + cur);
        if (cur > n) return;
        result.add(cur);

        for (int i = 0; i < 9; i++) {
            if (cur * 10 + i > n) return;
            calculateLeadingDigit(n, cur * 10 + i, result);
        }
    }
}
