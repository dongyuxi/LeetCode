package com.leetcode.problem050.powxn;

public class Solution {
    public double pow(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}