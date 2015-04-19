package com.leetcode.problem021.mergetwosortedlists;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.ListNode;
import com.leetcode.problem021.mergetwosortedlists.Solution;

/**
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * @author dongyuxi
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class SolutionTest {
    public Solution solution = null;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        ListNode l1 = new ListNode(2);
        ListNode temp1 = l1;
        temp1.next = new ListNode(3);
        temp1 = temp1.next;
        temp1.next = new ListNode(3);

        ListNode l2 = new ListNode(4);
        ListNode temp2 = l2;
        temp2.next = new ListNode(6);
        temp2 = temp2.next;
        temp2.next = new ListNode(8);

        ListNode result = solution.mergeTwoLists(l1, l2);
        while (null != result) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
