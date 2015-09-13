package com.leetcode.problem232.implementqueueusingstacks;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Implement the following operations of a queue using stacks.
 * 
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * 
 * @author dongyuxi
 *
 */
public class SolutionTest {
    public MyQueue queue = null;

    @Before
    public void setup() {
        queue = new MyQueue();
    }

    @Test
    public void test() {
        assertEquals(true, queue.empty());
        queue.push(0);
        assertEquals(0, queue.peek());
        queue.push(1);
        assertEquals(0, queue.peek());
        queue.pop();
        assertEquals(1, queue.peek());
        queue.pop();
        assertEquals(true, queue.empty());
    }
}
