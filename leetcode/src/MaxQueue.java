import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * 描述:
 * 面试题59- 队列的最大值
 * Deque 继承于 Queue，双端队列
 * 用一个队列保存正常元素，另一个双向队列保存单调递减的元素
 * 入栈时，第一个队列正常入栈；第二个队列是递减队列，所以需要与之前的比较，从尾部把小于当前value的全部删除
 * 出栈时，第一个队列正常出栈；第二个队列的头部与出栈的值作比较，如果相同，那么一起出栈
 *
 * @author dong
 * @date 2020-03-07 9:21
 */
public class MaxQueue {
    Queue<Integer>  queue;
    Deque<Integer>  maxQueue;

    public MaxQueue(){
        queue = new ArrayDeque<>();
        maxQueue = new ArrayDeque<>();
    }

    public int max_value(){
        if (maxQueue.isEmpty()){
            return -1;
        }else {
            return maxQueue.peek();
        }
    }

    public void push_back(int value){
        queue.add(value);
        while (!maxQueue.isEmpty() && value > maxQueue.getLast()){
            maxQueue.pollLast();
        }
        maxQueue.add(value);
    }

    public int pop_front(){
        if (queue.isEmpty()){
            return -1;
        }
        int ans = queue.poll();
        if (ans == maxQueue.peek()){
            maxQueue.poll();
        }
        return ans;
    }
}
