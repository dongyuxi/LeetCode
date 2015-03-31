package com.leetcode.problem069.sqrtx;

/**
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int sqrt(int x) {
        if (x < 0) {
            return -1;
        }

        int low = 0;
        int high = x / 2 + 1;
        while (low <= high) {
            double mid = low + (high - low) / 2;
            if (mid * mid == x) {
                return (int)mid;
            }
            if (mid * mid > x) {
                high = (int)mid - 1;
            }
            if (mid * mid < x) {
                low = (int)mid + 1;
            }
        }

        return high;
    }
}