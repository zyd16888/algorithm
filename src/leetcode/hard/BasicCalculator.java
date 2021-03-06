package leetcode.hard;

import java.util.Stack;

/**
 * 描述：
 * 224. 基本计算器
 *
 * @author dong
 * 2021-03-10 09:40
 */
public class BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int sign = 1, res = 0;
        int length = s.length();
        for (int i = 0; i < length; i++){
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int cur = ch - '0';
                while (i + 1 < length && Character.isDigit(s.charAt(i + 1))){
                    cur = cur * 10 + s.charAt(++i) - '0';
                }
                res = res + sign * cur;
            } else if (ch == '+') {
                sign = 1;
            } else if (ch == '-') {
                sign = -1;
            } else if (ch == '(') {
                stack.push(res);
                res = 0;
                stack.push(sign);
                sign = 1;
            } else if (ch == ')') {
                res = stack.pop() * res + stack.pop();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        BasicCalculator test = new BasicCalculator();
        System.out.println(test.calculate(s));
    }
}
