package com.leetcode.problem097.interleavingstring;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 * 
 * For example, Given: s1 = "aabcc", s2 = "dbbca",
 * 
 * When s3 = "aadbbcbcac", return true. When s3 = "aadbbbaccc", return false.
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
        assertEquals(true, solution.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        assertEquals(false, solution.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }
}