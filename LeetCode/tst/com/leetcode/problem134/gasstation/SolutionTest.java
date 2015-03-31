package com.leetcode.problem134.gasstation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * There are N gas stations along a circular route, where the amount of gas at
 * station i is gas[i].
 * 
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to
 * travel from station i to its next station (i+1). You begin the journey with
 * an empty tank at one of the gas stations.
 * 
 * Return the starting gas station's index if you can travel around the circuit
 * once, otherwise return -1.
 * 
 * Note: The solution is guaranteed to be unique.
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
        int[] gas = new int[]{1, 2};
        int[] cost = new int[]{2, 1};
        assertEquals(1, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    public void testWrongAnswer() {
        int[] gas = new int[]{1, 2};
        int[] cost = new int[]{2, 1};
        assertEquals(1, solution.canCompleteCircuit(gas, cost));
    }
    
}