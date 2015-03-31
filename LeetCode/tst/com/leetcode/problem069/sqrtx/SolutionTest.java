package com.leetcode.problem069.sqrtx;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x.
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
        assertEquals(-1, solution.sqrt(-1));
        assertEquals(0, solution.sqrt(0));
        assertEquals(1, solution.sqrt(1));
        assertEquals(1, solution.sqrt(2));
        assertEquals(2, solution.sqrt(6));
    }

    @Test
    public void testWrongAnswer() {
        assertEquals(46340, solution.sqrt(2147483647));
    }
}