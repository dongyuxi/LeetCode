package com.leetcode.problem001.wordbreak;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    public Solution solution = null;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void testStringIsNull() {
        String s = null;
        Set<String> dict = new HashSet<String>();
        dict.add("abc");
        assertTrue(solution.wordBreak(s, dict));
    }

    @Test
    public void testDictIsNull() {
        String s = "abc";
        Set<String> dict = null;
        assertFalse(solution.wordBreak(s, dict));
    }

    @Test
    public void testResultTrue() {
        Solution solution = new Solution();
        String s = "abcabcd";
        Set<String> dict = new HashSet<String>();
        dict.add("abc");
        dict.add("abcd");
        assertFalse(solution.wordBreak(s, dict));
    }

    @Test
    public void testResultFalse() {
        Solution solution = new Solution();
        String s = "abcabcd";
        Set<String> dict = new HashSet<String>();
        dict.add("abc");
        dict.add("abcde");
        assertFalse(solution.wordBreak(s, dict));
    }

    
    /**
     * Input: "aaaaaaa", ["aaaa","aaa"]
     * Output: false
     * Expected: true
     */
    @Test
    public void testLeetCodeWrong1() {
        Solution solution = new Solution();
        String s = "aaaaaaa";
        Set<String> dict = new HashSet<String>();
        dict.add("aaaa");
        dict.add("aaa");
        assertTrue(solution.wordBreak(s, dict));
    }
}