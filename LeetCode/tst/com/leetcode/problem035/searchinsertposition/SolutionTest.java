package com.leetcode.problem035.searchinsertposition;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples.
 * [1,3,5,6], 5 ¡ú 2
 * [1,3,5,6], 2 ¡ú 1
 * [1,3,5,6], 7 ¡ú 4
 * [1,3,5,6], 0 ¡ú 0
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
        int[] array = new int[]{1, 3, 5, 6};
        assertEquals(0, solution.searchInsert(array, 1));
        assertEquals(1, solution.searchInsert(array, 3));
        assertEquals(2, solution.searchInsert(array, 5));
        assertEquals(3, solution.searchInsert(array, 6));
        assertEquals(0, solution.searchInsert(array, 0));
        assertEquals(4, solution.searchInsert(array, 7));
        assertEquals(2, solution.searchInsert(array, 4));
    }

}