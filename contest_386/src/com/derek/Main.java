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
        Solution solution = new Solution();


//        printResult(solution.lexicalOrder(5));
//        printResult(solution.lexicalOrder(100));
//        printResult(solution.lexicalOrder(100000));
//        printResult(solution.lexicalOrder(5_000_000));

        Solution2 solution2 = new Solution2();


//        printResult(solution2.lexicalOrder(5));
//        printResult(solution2.lexicalOrder(13));
//        printResult(solution2.lexicalOrder(24));
        printResult(solution2.lexicalOrder(100));
        printResult(solution2.lexicalOrder(10458));
        printResult(solution2.lexicalOrder(100000));
//        printResult(solution2.lexicalOrder(5_000_000));

//        println("Comparing 3, 2: " + Solution2.sort.compare(3, 2));
//        println("Comparing 2, 3: " + Solution2.sort.compare(2, 3));
//
//        println("Comparing 1, 2: " + Solution2.sort.compare(1, 2));
//        println("Comparing 2, 1: " + Solution2.sort.compare(2, 1));
//
//
//        println("Comparing 1, 3: " + Solution2.sort.compare(1, 3));
//        println("Comparing 3, 1: " + Solution2.sort.compare(3, 1));
//
//
//        println("Comparing 2, 10: " + Solution2.SORT.compare(2, 10));
//        println("Comparing 10, 2: " + Solution2.SORT.compare(10, 2));

/*        int counter = 0;
        while (true) {
            List<Integer> list = new ArrayList<>(3);

            try {
                for (int i = 1; i < Math.random() * 30458 + 10000; i++) {
                    list.add(i);
                }
                for (int i = 1; i < list.size(); i++) {
                    for (int j = 1; j < i; j++) {
                        int a = Solution2.SORT.compare(i, j);
                        int b = Solution2.SORT.compare(j, i);
                        Assert.check(a * b < 0, "error: " + i + " " + j + " " + a + " " + b);
                    }
                }
//                list.sort(Solution2.SORT);
            } catch (Exception e) {
                e.printStackTrace();
                println("Error: " + list);
                break;
            } finally {
                counter ++;
                println("counter: " + counter + " size:" + list.size());
                list.clear();
            }
        }*/


    }

    private static final void printResult(List<Integer> result) {
        println("final result, length:" + result.size() + "\n" + result.toString());
    }

}
