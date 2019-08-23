import java.util.Scanner;
import java.util.Stack;

/**
 * @author dong
 * @date 2019/08/21 21:46
 * TODO: 用两个栈实现队列的功能
 */
public class StacksQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String add = "add";
        String poll = "poll";
        String peek = "peek";
        TwoStackQueue tq = new TwoStackQueue();

        for (int a = 0; a < n; a++){
            String operation = sc.next();
            if (operation.equals(add)){
                int num = sc.nextInt();
                tq.add(num);
            }else if(operation.equals(poll)){
                tq.poll();
            }else if(operation.equals(peek)){
                System.out.println(tq.peek());
            }
        }
    }
}

class TwoStackQueue{
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStackQueue(){
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    public void add(int pushInt){
        stackPush.push(pushInt);
    }

    public int poll(){
        if (stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty!");
        }else if (stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if (stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty!");
        }else if (stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }


}
