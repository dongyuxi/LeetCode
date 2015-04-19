package com.leetcode.problem001.twosum;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * @Input: numbers={2, 7, 11, 15}, target=9 
 * @Output: index1=1, index2=2
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
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] index = solution.twoSum(numbers, target);
        assertEquals(1, index[0]);
        assertEquals(2, index[1]);
    }
}
