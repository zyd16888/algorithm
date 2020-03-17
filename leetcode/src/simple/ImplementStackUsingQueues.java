package simple;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 描述:
 * 225. 队列实现栈
 *
 * @author dong
 * @date 2020-03-17 23:05
 */
public class ImplementStackUsingQueues {
    private Queue<Integer> a;
    private Queue<Integer> b;

    /** Initialize your data structure here. */
    public ImplementStackUsingQueues() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        a.add(x);
        while (!b.isEmpty()) {
            a.add(b.poll());
        }
        Queue c  = a;
        a = b;
        b = c;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return b.poll();
    }

    /** Get the top element. */
    public int top() {
        return b.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return b.isEmpty();
    }
}
