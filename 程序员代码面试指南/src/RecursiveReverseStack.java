import java.util.Scanner;
import java.util.Stack;

/**
 * @author dong
 * @date 2019/08/22 12:46
 * TODO: 仅用递归操作逆序一个栈
 */
public class RecursiveReverseStack {
    public static Stack<Integer> stack;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack = new Stack<Integer>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            stack.push(num);
        }
        //getAndRemoveLastElement(stack);
        readStack(stack);
    }


    /**
     * TODO: 逆序返回栈
     * @param stack
     * @return
     */
    public static int getAndRemoveLastElement(Stack<Integer> stack){
        int result = stack.pop();
        if (stack.isEmpty()){
            System.out.println(result);
            return result;
        }else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            System.out.println(result);
            return last;
        }
    }
    public static void readStack(Stack<Integer> stack){
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
