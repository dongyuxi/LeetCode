package com.leetcode.problem121.besttimetobuyandsellstock;

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
public class Solution {
    public int maxProfit(int[] prices) {
        if (null == prices || 0 == prices.length) {
            return 0;
        }

        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - min > max) {
                max = prices[i] - min;
            }
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        return max;
    }
}