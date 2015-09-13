package com.leetcode.problem231.poweroftwo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an integer, write a function to determine if it is a power of two.
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
        assertEquals(false, solution.isPowerOfTwo(-1));
        assertEquals(true, solution.isPowerOfTwo(1));
        assertEquals(false, solution.isPowerOfTwo(3));
    }

}
