package com.leetcode.problem135.candy;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * There are N children standing in a line. Each child is assigned a rating
 * value.
 * 
 * You are giving candies to these children subjected to the following
 * requirements:
 * 
 * Each child must have at least one candy. Children with a higher rating get
 * more candies than their neighbors.
 * 
 * What is the minimum candies you must give?
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
        int[] ratings = new int[]{3, 2, 1};
        assertEquals(6, solution.candy(ratings));

        ratings = new int[]{1, 2, 3};
        assertEquals(6, solution.candy(ratings));

        ratings = new int[]{1, 2, 3, 1, 2, 4, 3, 2, 1};
        assertEquals(19, solution.candy(ratings));
    }

    @Test
    public void testWrongAnswer() {
        int[] ratings = new int[]{1, 2, 4, 4, 3};
        assertEquals(9, solution.candy(ratings));
    }
}