package com.leetcode.problem039.combinationsum;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.Utils;

/**
 * Given a set of candidate numbers (C) and a target number (T), find all unique
 * combinations in C where the candidate numbers sums to T.
 * 
 * The same repeated number may be chosen from C unlimited number of times.
 * 
 * Note:
 * 
 * All numbers (including target) will be positive integers. Elements in a
 * combination (a1, a2, ¡­ , ak) must be in non-descending order. (ie, a1 ¡Ü a2 ¡Ü
 * ¡­ ¡Ü ak). The solution set must not contain duplicate combinations.
 * 
 * For example, given candidate set 2,3,6,7 and target 7, A solution set is: [7]
 * [2, 2, 3]
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
        int[] candidates = new int[]{2, 3, 6, 7};
        Utils.showList(solution.combinationSum(candidates, 7));
    }
}