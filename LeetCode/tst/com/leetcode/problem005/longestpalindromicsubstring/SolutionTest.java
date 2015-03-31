package com.leetcode.problem005.longestpalindromicsubstring;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given a string S, find the longest palindromic substring in S. You may assume
 * that the maximum length of S is 1000, and there exists one unique longest
 * palindromic substring.
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
        assertEquals("a", solution.longestPalindrome("a"));
        assertEquals("aa", solution.longestPalindrome("aa"));
    }

    @Test
    public void testWrongAnswer() {
        assertEquals("aaaa", solution.longestPalindrome("aaaa"));
    }
}