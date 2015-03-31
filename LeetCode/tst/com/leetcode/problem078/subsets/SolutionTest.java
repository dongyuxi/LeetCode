package com.leetcode.problem078.subsets;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.Utils;

/**
 * Given a set of distinct integers, S, return all possible subsets.
 * 
 * Note:
 * 
 * Elements in a subset must be in non-descending order. The solution set must
 * not contain duplicate subsets.
 * 
 * For example, If S = [1,2,3], a solution is:
 * 
 * [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
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
        Utils.showList(solution.subsets(new int[]{1, 2, 3}));
    }
}