package com.leetcode.problem122.besttimetobuyandsellstockii;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem121.besttimetobuyandsellstock.Solution;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many
 * transactions as you like (ie, buy one and sell one share of the stock
 * multiple times). However, you may not engage in multiple transactions at the
 * same time (ie, you must sell the stock before you buy again).
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