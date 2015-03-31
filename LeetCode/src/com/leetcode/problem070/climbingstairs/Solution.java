package com.leetcode.problem070.climbingstairs;

public class Solution {
    public int climbStairs(int n) {
        if (0 == n || 1 == n) {
            return 1;
        }
        int num1 = 1;
        int num2 = 1;
        for (int i = 2; i <= n; i++) {
            int temp = num2;
            num2 = num1 + num2;
            num1 = temp;
        }
        return num2;
    }
}