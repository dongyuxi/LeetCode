package com.leetcode.problem080.removeduplicatesfromsortedarrayii;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Follow up for "Remove Duplicates": What if duplicates are allowed at most
 * twice?
 * 
 * For example, Given sorted array A = [1,1,1,2,2,3],
 * 
 * Your function should return length = 5, and A is now [1,1,2,2,3].
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
        int[] A = new int[]{1, 1, 1, 2, 2, 2, 3, 3};
        assertEquals(6, solution.removeDuplicates(A));
    }
}