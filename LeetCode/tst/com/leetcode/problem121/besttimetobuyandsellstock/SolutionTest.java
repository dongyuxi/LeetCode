package com.leetcode.problem121.besttimetobuyandsellstock;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
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
        int[] prices = new int[]{1, 2};
        assertEquals(1, solution.maxProfit(prices));

        prices = new int[]{2, 1, 4};
        assertEquals(3, solution.maxProfit(prices));
    }
}