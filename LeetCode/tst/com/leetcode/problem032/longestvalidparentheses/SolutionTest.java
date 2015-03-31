package com.leetcode.problem032.longestvalidparentheses;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

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
public class SolutionTest {
    public Solution solution = null;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        assertEquals(2, solution.longestValidParentheses("(()"));
        assertEquals(4, solution.longestValidParentheses(")()())"));
    }
}