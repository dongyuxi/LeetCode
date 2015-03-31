package com.leetcode.problem070.climbingstairs;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    public Solution solution = null;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        assertEquals(5, solution.climbStairs(4));
    }
}