package com.leetcode.problem017.lettercombinationsofaphonenumber;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * Given a digit string, return all possible letter combinations that the number
 * could represent.
 * 
 * A mapping of digit to letters (just like on the telephone buttons) is given
 * below.
 * 
 * Input:Digit string "23" Output: ["ad", "ae", "af", "bd", "be", "bf", "cd",
 * "ce", "cf"].
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
        List<String> list = solution.letterCombinations("23");
        showList(list);
    }

    private void showList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
    }

}