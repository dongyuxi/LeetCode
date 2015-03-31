package com.leetcode.problem072.editdistance;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given two words word1 and word2, find the minimum number of steps required to
 * convert word1 to word2. (each operation is counted as 1 step.)
 * 
 * You have the following 3 operations permitted on a word:
 * 
 * a) Insert a character b) Delete a character c) Replace a character
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
        assertEquals(3, solution.minDistance("", "abc"));
        assertEquals(3, solution.minDistance("abc", ""));
        assertEquals(1, solution.minDistance("abc", "acc"));
    }
}