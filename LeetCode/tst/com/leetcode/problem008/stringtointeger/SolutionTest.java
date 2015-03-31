package com.leetcode.problem008.stringtointeger;

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
    public void testStringEmpty() {
        assertEquals(0, solution.atoi(null));
        assertEquals(0, solution.atoi(""));
    }

    @Test
    public void testPositiveInRange() {
        assertEquals(123, solution.atoi("123"));
        assertEquals(123, solution.atoi("+123"));
        assertEquals(123, solution.atoi(" +123"));
    }

    @Test
    public void testPositiveOutOfRange() {
        assertEquals(2147483647, solution.atoi("2147483648"));
    }

    
    @Test
    public void testNegativeInRange() {
        assertEquals(-123, solution.atoi("-123"));
        assertEquals(-123, solution.atoi("  -123"));
    }

    @Test
    public void testNegativeOutOfRange() {
        assertEquals(-2147483648, solution.atoi("-2147483649"));
    }
}