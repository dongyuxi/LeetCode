package com.leetcode.problem046.permutations;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.Utils;

/**
 * Given a collection of numbers, return all possible permutations.
 * 
 * For example, [1,2,3] have the following permutations: [1,2,3], [1,3,2],
 * [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
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
        int[] num = new int[]{1, 2, 3};
        List<List<Integer>> listlist = solution.permute(num);
        Utils.showList(listlist);
    }
}