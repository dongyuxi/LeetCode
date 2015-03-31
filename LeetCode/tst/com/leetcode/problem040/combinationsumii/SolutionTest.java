package com.leetcode.problem040.combinationsumii;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.Utils;

/**
 * Given a collection of candidate numbers (C) and a target number (T), find all
 * unique combinations in C where the candidate numbers sums to T.
 * 
 * Each number in C may only be used once in the combination.
 * 
 * Note:
 * 
 * All numbers (including target) will be positive integers. Elements in a
 * combination (a1, a2, ¡­ , ak) must be in non-descending order. (ie, a1 ¡Ü a2 ¡Ü
 * ¡­ ¡Ü ak). The solution set must not contain duplicate combinations.
 * 
 * For example, given candidate set 10,1,2,7,6,1,5 and target 8, A solution set
 * is: [1, 7] [1, 2, 5] [2, 6] [1, 1, 6]
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
        int[] candidates = new int[] { 10, 1, 2, 7, 6, 1, 5 };
        Utils.showList(solution.combinationSum2(candidates, 8));
    }
}