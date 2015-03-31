package com.leetcode.problem169.majorityelement;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than n / 2
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
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
        assertEquals(1, solution.majorityElement(new int[]{1, 1, 3, 4, 1}));
    }

    @Test
    public void testWrongAnswer() {
        assertEquals(3, solution.majorityElement(new int[]{3, 3, 4}));
    }
}