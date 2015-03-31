package com.leetcode.problem172.factorialtrailingzeroes;

/**
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than n / 2
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int trailingZeroes(int n) {
        int zero = 0;
        while (n > 0) {
            zero += n / 5;
            n = n / 5;
        }
        return zero;
    }
}