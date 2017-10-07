package com.derek;

import com.sun.tools.javac.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static final boolean DEBUG = true;

    public static final void print(String message) {
        if (DEBUG) {
            System.out.print(message);
        }
    }

    public static final void println(String message) {
        if (DEBUG) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Solution0 solution0 = new Solution0();
        Solution solution = new Solution();
        Solution2 solution2 = new Solution2();

        int[] values = new int[] {5, 24, 200, 5_000_000};

//        for (int i : values) {
//            printResult(solution0.lexicalOrder(i));
//            printResult(solution.lexicalOrder(i));
//            printResult(solution2.lexicalOrder(i));
//        }


        com.derek.firstUniqueChar.Solution solution_2 = new com.derek.firstUniqueChar.Solution();
        println("First Unique Character in a String 1:" + solution_2.firstUniqChar("leetcode"));
        println("First Unique Character in a String 2:" + solution_2.firstUniqChar("loveleetcode"));
    }

    private static final void printResult(String s, List<Integer> result) {
        println(s + ": " + result.size() + "\n" + result.toString());
    }

    private static final void printResult(List<Integer> result) {
        println("final result, length:" + result.size() + "\n" + result.toString());
    }

}
