package com.leetcode.problem017.lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class Solution {
    private static Map<Character, String> TELEPHONE_MAP = new HashMap<Character, String>();
    static {
        TELEPHONE_MAP.put('2', "abc");
        TELEPHONE_MAP.put('3', "def");
        TELEPHONE_MAP.put('4', "ghi");
        TELEPHONE_MAP.put('5', "jkl");
        TELEPHONE_MAP.put('6', "mno");
        TELEPHONE_MAP.put('7', "qprs");
        TELEPHONE_MAP.put('8', "tuv");
        TELEPHONE_MAP.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if (null == digits || 0 == digits.length()) {
            return list;
        }

        StringBuilder sb = new StringBuilder();
        letterCombinations(digits, 0, list, sb);
        return list;
    }

    private void letterCombinations(String digits, int index, List<String> list, StringBuilder sb) {
        if (digits.length() == index) {
            list.add(sb.toString());
            return;
        }
        String s = TELEPHONE_MAP.get(digits.charAt(index));
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            letterCombinations(digits, index + 1, list, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}