package com.leetcode.problem179.largestnumber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given a list of non negative integers, arrange them such that they form the
 * largest number.
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you need to return a string instead of
 * an integer.
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
    public void testValidInput() {
        assertEquals("9534330", solution.largestNumber(new int[]{3, 30, 34, 5, 9}));
    }

    @Test
    public void testWrongAnswer() {
        assertEquals("0", solution.largestNumber(new int[]{0, 0}));
    }
}