package com.leetcode.problem029.dividetwointegers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Divide two integers without using multiplication, division and mod operator.
 * 
 * If it is overflow, return MAX_INT.
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
        assertEquals(2, solution.divide(2, 1));
        assertEquals(1, solution.divide(3, 2));
        assertEquals(Integer.MAX_VALUE, solution.divide(3, 0));
    }

    @Test
    public void testWrongAnswer() {
        assertEquals(-1, solution.divide(1, -1));
        assertEquals(2147483647, solution.divide(-2147483648, -1));
    }
}