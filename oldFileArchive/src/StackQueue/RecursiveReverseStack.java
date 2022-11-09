package StackQueue;

import java.util.Stack;

/**
 * 描述:
 * 仅使用递归函数和栈操作逆序一个栈
 *
 * @author dong
 * @date 2019-01-16 16:25
 */

public class RecursiveReverseStack {
    /**
     * 将栈stack的栈底元素返回并移除
     * @param stack
     * @return 栈底元素
     */
    public static int getAndRrmoveLastElement(Stack<Integer> stack){
        int result = stack.pop();
        if (stack.empty()){
            return result;
        } else {
            int last = getAndRrmoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    /**
     * 逆序一个栈
     * @param stack
     */
    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
            int i = getAndRrmoveLastElement(stack);
            reverse(stack);
            stack.push(i);
    }
}