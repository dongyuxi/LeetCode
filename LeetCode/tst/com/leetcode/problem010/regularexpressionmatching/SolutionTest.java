package com.leetcode.problem010.regularexpressionmatching;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Implement regular expression matching with support for '.' and '*'.
 * 
 * '.' Matches any single character.
'*' Matches zero or more of the preceding element.
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
    public void testPatternOrStringNull() {
        assertEquals(true, solution.isMatch(null, null));
        assertEquals(false, solution.isMatch("abc", null));
    }

    @Test
    public void testNoPointOrStar() {
        assertEquals(true, solution.isMatch("", ""));
        assertEquals(true, solution.isMatch("abc", "abc"));
    }

    @Test
    public void testPoint() {
        assertEquals(true, solution.isMatch("abc", ".bc"));
        assertEquals(true, solution.isMatch("abc", "a.c"));
        assertEquals(true, solution.isMatch("abc", "ab."));

        assertEquals(false, solution.isMatch("aac", ".bc"));
        assertEquals(false, solution.isMatch("abb", "a.c"));
        assertEquals(false, solution.isMatch("aac", "ab."));
    }

    @Test
    public void testStar() {
        assertEquals(true, solution.isMatch("bc", "a*bc"));
        assertEquals(true, solution.isMatch("abc", "a*bc"));
        assertEquals(true, solution.isMatch("aabc", "a*bc"));
        assertEquals(true, solution.isMatch("aabc", "a*bcd*"));
    }

    @Test
    public void testWrongAnswer() {
        assertEquals(true, solution.isMatch("aaa", "a*a"));
    }
}