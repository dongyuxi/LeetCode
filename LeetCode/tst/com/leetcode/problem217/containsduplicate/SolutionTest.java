package com.leetcode.problem217.containsduplicate;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
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
        assertEquals(true, solution.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertEquals(false, solution.containsDuplicate(new int[]{1, 2, 3}));
    }

}
