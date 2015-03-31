package com.leetcode.problem119.pascalstriangleii;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem119.pascalstriangleii.Solution;

/**
 * Given an index k, return the kth row of the Pascal's triangle.
 * 
 * For example, given k = 3, Return [1,3,3,1].
 * 
 * Note: Could you optimize your algorithm to use only O(k) extra space?
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
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(1);
        assertEquals(list, solution.getRow(3));
    }
}
