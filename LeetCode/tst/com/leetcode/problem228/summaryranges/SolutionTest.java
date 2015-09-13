package com.leetcode.problem228.summaryranges;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem228.summaryranges.Solution;

/**
 * Given a sorted integer array without duplicates, return the summary of its
 * ranges.
 * 
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
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
        assertEquals(Arrays.asList("0->2", "4->5", "7"),
                solution.summaryRanges(new int[] { 0, 1, 2, 4, 5, 7 }));
    }

    @Test
    public void testWrongAnwser() {
        assertEquals(Arrays.asList("0->1"),
                solution.summaryRanges(new int[] { 0, 1 }));
        assertEquals(Arrays.asList("1", "3"),
                solution.summaryRanges(new int[] { 1, 3 }));
        assertEquals(
                Arrays.asList("-2147483648->-2147483647", "2147483647"),
                solution.summaryRanges(new int[] { -2147483648, -2147483647,
                        2147483647 }));
    }
}
