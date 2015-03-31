package com.leetcode.problem032.longestvalidparentheses;

/**
 * Given a string containing just the characters '(' and ')', find the length of
 * the longest valid (well-formed) parentheses substring.
 * 
 * For "(()", the longest valid parentheses substring is "()", which has length
 * = 2.
 * 
 * Another example is ")()())", where the longest valid parentheses substring is
 * "()()", which has length = 4.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int longestValidParentheses(String s) {
        if (null == s || 0 == s.length()) {
            return 0;
        }

        int[] stack = new int[s.length()];
        int count = 0;
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                stack[count++] = i;
            } else {
                count --;
                if (count == 0) {
                    max = Math.max(max, i - start + 1);
                } else if (count < 0) {
                    start = i + 1;
                    count = 0;
                } else {
                    max = Math.max(max, i - stack[count - 1]);
                }
            }
        }

        return max;
    }
}