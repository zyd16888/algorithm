import java.util.Scanner;
import java.util.Stack;

public class getMin {
    public static void main(String[] args) {
        String push = "push";
        String getMin = "getMin";
        String pop = "pop";
        MyStack1 ms = new MyStack1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            String operation = sc.next();
            if(operation.equals(push)){
                int num = sc.nextInt();
                ms.push(num);
            }else if (operation.equals(getMin)){
                System.out.println(ms.getMin());
            }else if (operation.equals(pop)){
                ms.pop();
            }
        }
    }
}

class MyStack1{
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }
    public void push(int newNum){
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if(newNum <= this.getMin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("your stack is empty.");
        }
        int value  = this.stackData.pop();
        if(value == this.getMin()){
            this.stackMin.pop();
        }
        return value;
    }
    public int getMin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("your stack is empty.");
        }
        return this.stackMin.peek();
    }
}