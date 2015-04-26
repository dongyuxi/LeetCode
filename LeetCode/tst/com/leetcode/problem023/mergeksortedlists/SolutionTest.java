package com.leetcode.problem023.mergeksortedlists;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.ListNode;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and
 * describe its complexity.
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
        ListNode l1 = new ListNode(2);
        ListNode temp1 = l1;
        temp1.next = new ListNode(3);
        temp1 = temp1.next;
        temp1.next = new ListNode(5);

        ListNode l2 = new ListNode(4);
        ListNode temp2 = l2;
        temp2.next = new ListNode(6);
        temp2 = temp2.next;
        temp2.next = new ListNode(8);

        ListNode[] lists = new ListNode[]{l1, l2};
        ListNode result = solution.mergeKLists(lists);
        while (null != result) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}