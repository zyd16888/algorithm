package AlgorithmsDataStructure.StackQueue;

import java.util.Stack;

/**
 * 描述:
 * 用一个栈实现令一个栈的排序
 *
 * @author dong
 * @date 2019-01-17 16:37
 */
public class sortStackByStack {
    /**
     * help为辅助栈，stack上弹出的值记为cur，cur小于help的栈顶元素时直接压入，否则弹出help栈顶元素压入stack
     * @param stack 需要排序的栈
     */
    public static void sortStackByStack(Stack<Integer> stack){
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.isEmpty()){
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek()<cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()){
            stack.push(help.pop());
        }

    }




}
