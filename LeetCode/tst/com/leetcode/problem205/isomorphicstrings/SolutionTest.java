package com.leetcode.problem205.isomorphicstrings;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * For example, Given "egg", "add", return true.
 * 
 * Given "foo", "bar", return false.
 * 
 * Given "paper", "title", return true.
 * 
 * Note: You may assume both s and t have the same length.
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
        assertEquals(true, solution.isIsomorphic("egg", "add"));
        assertEquals(false, solution.isIsomorphic("foo", "bar"));
        assertEquals(true, solution.isIsomorphic("paper", "title"));
    }

    @Test
    public void testWrongAnswer() {
        assertEquals(false, solution.isIsomorphic("ab", "aa"));
    }
}