package com.leetcode.problem049.anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings, return all groups of strings that are anagrams.
 * 
 * Note: All inputs will be in lower-case.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public List<String> anagrams(String[] strs) {
        List<String> list = new ArrayList<String>();
        if (null == strs || 0 == strs.length) {
            return list;
        }

        Map<String, String> map = new HashMap<String, String>();
        Map<String, Boolean> first = new HashMap<String, Boolean>();
        for (int i = 0; i < strs.length; i++) {
            char[] array = strs[i].toCharArray();
            Arrays.sort(array);
            String sortedString = String.valueOf(array);
            if (map.containsKey(sortedString)) {
                if (first.get(sortedString)) {
                    list.add(map.get(sortedString));
                    first.put(sortedString, false);
                }
                list.add(strs[i]);
            } else {
                map.put(sortedString, strs[i]);
                first.put(sortedString, true);
            }
        }
        return list;
    }
}