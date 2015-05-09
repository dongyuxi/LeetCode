package com.leetcode.problem204.countprimes;

/**
 * Count the number of prime numbers less than a non-negative number, n
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] prime = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            if (!prime[i]) {
                for (int j = i; i * j < n; j++) {
                    prime[i * j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!prime[i]) {
                count++;
            }
        }
        return count;
    }
}