package simple;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 描述:
 * 面试题06. 从尾到头打印链表
 *
 * @author dong
 * @date 2020-04-20 10:24
 */
public class ReversePrint {
    /**
     * 逆序填充数组
     * @param head 头节点
     * @return 数组
     */
    private int[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        int[] nums = new int[count];
        node = head;
        for (int i = count - 1; i >= 0; i--) {
            nums[i] = node.val;
            node = node.next;
        }
        return nums;
    }

    ArrayList<Integer> tmp = new ArrayList<>();

    /**
     * 使用递归方法遍历节点
     * @param head 头节点
     * @return res数组
     */
    private int[] reversePrint2(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }
    private void recur(ListNode head) {
        if (head == null) { return; }
        recur(head.next);
        tmp.add(head.val);
    }

    /**
     * 使用栈逆序
     * @param head 头节点
     * @return int数组
     */
    private int[] reversePrint3(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = stack.pop().val;
        }
        return res;
    }
}
