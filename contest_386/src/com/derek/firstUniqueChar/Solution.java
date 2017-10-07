package com.derek.firstUniqueChar;

// First Unique Character in a String
// https://leetcode.com/contest/warm-up-contest/problems/first-unique-character-in-a-string/
// https://leetcode.com/submissions/detail/122374034/
// 104 / 104 test cases passed.
// Runtime: 14 ms

public class Solution {
    public int firstUniqChar(String s) {
        int[] occurrences = new int[26];

        for (char ch : s.toCharArray()) {
            int chr = ch - 'a';
            occurrences[chr]++;
        }

        int index = -1;
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] == 1) {
                int newIndex = s.indexOf(i + 'a');
                if (index == -1 || newIndex < index) {
                    index = newIndex;
                }
            }
        }
        return index;
    }
}
