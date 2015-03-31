package com.leetcode.problem029.dividetwointegers;

/**
 * Divide two integers without using multiplication, division and mod operator.
 * 
 * If it is overflow, return MAX_INT.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int divide(int dividend, int divisor) {
        if (0 == divisor) {
            return Integer.MAX_VALUE;
        }
        long dividendLong = Math.abs((long)dividend);
        long divisorLong = Math.abs((long)divisor);
        boolean minus = (dividend ^ divisor) >>> 31 == 1;
        long result = 0;
        while (dividendLong >= divisorLong) {
            long base = divisorLong;
            for (int i = 0; dividendLong >= base; i++) {
                dividendLong -= base;
                base <<= 1;
                result += 1 << i;
            }
        }
        result = (minus) ? -result : result;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)result;
    }
}