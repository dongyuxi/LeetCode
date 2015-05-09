package com.leetcode.problem206.reverselinkedlist;

import com.leetcode.problem.utils.ListNode;

/**
 * Reverse a singly linked list.
 * 
 * Example
 * 
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6
 * 
 * Return: 6 --> 5 --> 4 --> 3 --> 6 --> 2 --> 1
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        while (null != cur) {
            ListNode next = cur.next;
            cur.next = prev;
            if (prev == head) {
                prev.next = null;
            }
            prev = cur;
            cur = next;
        }
        return prev;
    }
}