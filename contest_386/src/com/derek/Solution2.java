package com.derek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.derek.Main.println;


public class Solution2 {

    static Comparator<Integer> SORT2 = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    };
    static Comparator<Integer> SORT = new Comparator<Integer>() {
        public int getLeadingDigitAtIndex(int number, int index) {
            double factor = (Math.pow(10, index - 1));
            if (factor < 1) return 0;
            return number / (int) factor;
        }

        @Override
        public int compare(Integer o1, Integer o2) {
            int d1 = getDigit(o1);
            int d2 = getDigit(o2);

            int biggerDigit = Math.max(d1, d2);
            int smallerDigit = Math.min(d1, d2);

            for (int i = biggerDigit; i >= 0; i--) {
                int leadingA = getLeadingDigitAtIndex(o1, biggerDigit == d1 ? i : i - (biggerDigit - smallerDigit));
                int leadingB = getLeadingDigitAtIndex(o2, biggerDigit == d2 ? i : i - (biggerDigit - smallerDigit));

//                if (leadingA == 0) return -1;
//                if (leadingB == 0) return 1;

                if (leadingA != leadingB) {
                    return leadingA - leadingB;
                }
            }

            return d1 == d2 ? 0 : biggerDigit == d1 ? 1 : -1;
        }
    };


    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            result.add(i);
        }

        result.sort(SORT);

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

    public static final int getDigit(int number) {
        return 1 + (int)Math.floor(Math.log10(number));
    }
}
