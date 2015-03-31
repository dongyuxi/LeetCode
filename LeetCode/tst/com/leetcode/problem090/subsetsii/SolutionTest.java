package com.leetcode.problem090.subsetsii;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.Utils;

/**
 * Given a collection of integers that might contain duplicates, S, return all
 * possible subsets.
 * 
 * Note:
 * 
 * Elements in a subset must be in non-descending order. The solution set must
 * not contain duplicate subsets.
 * 
 * For example, If S = [1,2,2], a solution is:
 * 
 * [ [2], [1], [1,2,2], [2,2], [1,2], [] ]
 * 
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
        Utils.showList(solution.subsetsWithDup(new int[] { 1, 2, 2 }));
    }
}