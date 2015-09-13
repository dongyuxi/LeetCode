package com.leetcode.problem234.palindromelinkedlist;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.problem.utils.ListNode;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        ListNode tmpNode = head;
        while (null != tmpNode) {
            list.add(tmpNode.val);
            tmpNode = tmpNode.next;
        }

        for (int i = 0; i < list.size() / 2; i++) {
            int val1 = list.get(i);
            int val2 = list.get(list.size() - 1 - i);
            if (val1 != val2) {
                return false;
            }
        }
        return true;
    }
}
