package com.leetcode.problem131.palindromepartitioning;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s, partition s such that every substring of the partition is a
 * palindrome.
 * 
 * Return all possible palindrome partitioning of s.
 * 
 * For example, given s = "aab", Return
 * 
 * [ ["aa","b"], ["a","a","b"] ]
 * 
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> listlist = new ArrayList<List<String>>();
        if (null == s || 0 == s.length()) {
            listlist.add(new ArrayList<String>());
            return listlist;
        }

        List<String> list = new ArrayList<String>();
        partition(s, 0, list, listlist);
        return listlist;
    }

    private void partition(String s, int index, List<String> list,
            List<List<String>> listlist) {
        if (s.length() == index) {
            listlist.add(new ArrayList<String>(list));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                list.add(s.substring(index, i + 1));
                partition(s, i + 1, list, listlist);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}