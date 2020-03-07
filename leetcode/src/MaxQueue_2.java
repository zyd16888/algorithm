/**
 * 描述:
 * 面试题59- 队列的最大值
 * 使用数组模拟队列
 *
 * @author dong
 * @date 2020-03-07 9:53
 */
public class MaxQueue_2 {
    int[] queue;
    int queueHead;
    int queueTail;
    int[] maxQueue;
    int maxQueueHead;
    int maxQueueTail;

    public MaxQueue_2() {
        queue = new int[20005];
        queueHead = 0;
        queueTail = 0;
        maxQueue = new int[20005];
        maxQueueHead = 0;
        maxQueueTail = 0;
    }

    public int max_value(){
        if (maxQueueTail == maxQueueHead){
            return -1;
        }
        return maxQueue[maxQueueHead];
    }

    public void push_back(int value){
        if (queueTail >= 20000){
            throw new OutOfMemoryError();
        }
        queue[queueTail++] = value;
        while (maxQueueHead != maxQueueTail && value > maxQueue[maxQueueTail-1]){
            maxQueueTail--;
        }
        maxQueue[maxQueueTail++] = value;
    }

    public int pop_front(){
        if (queueHead == queueTail){
            return -1;
        }
        int ans = queue[queueHead];
        if (ans == maxQueue[maxQueueHead]){
            maxQueueHead++;
        }
        queueHead++;
        return ans;
    }


}
