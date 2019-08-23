package StackQueue;

import java.util.Stack;

/**
 * 描述:
 * 设计一个有getMin功能的栈
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，实现返回栈中最小元素
 *
 * 使用两个栈来实现：一个栈用来保存栈中元素，功能与正常栈无区别，另外一个用来保存每一步的最小值
 *
 * stackData >= stackMin 时，保留最小值不压入
 *
 * @author dong
 * @date 2018-12-24 10:20
 */
public class GetMinStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public GetMinStack1() {
        this.stackData =new Stack<Integer>();
        this.stackMin =new Stack<Integer>();
    }

    public void push(int newNum){
        if (this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if (newNum <= this.getmin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop(){
        if (this.stackData.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }
        int value = this.stackData.pop();
        if (value == this.getmin()){
            this.stackMin.pop();
        }
        return value;
    }


    public int getmin(){
        if (this.stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }
        return this.stackMin.peek();
    }
}
