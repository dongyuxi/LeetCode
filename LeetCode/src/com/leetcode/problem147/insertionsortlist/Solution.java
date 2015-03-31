package com.leetcode.problem147.insertionsortlist;

import com.leetcode.problem.utils.ListNode;

/**
 * Sort a linked list using insertion sort.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }

        ListNode newHead = new ListNode(Integer.MIN_VALUE);
        newHead.next = head;
        

        return newHead.next;
    }
}