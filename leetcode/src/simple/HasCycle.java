package simple;

import util.ListNode;

/**
 * 描述：
 * 141. 环形链表
 *
 * @author zyd47
 * @date 2020-10-09 8:22
 */
public class HasCycle {
    /**
     * 快慢指针实现
     * @param head 链表头
     * @return 是否环形链表
     */
    public boolean hasCycle(ListNode head) {
        ListNode quick = head;
        ListNode slow = head;
        while (quick != null && quick.next != null && quick.next.next != null) {
            quick = quick.next.next;
            slow = slow.next;
            if (quick == slow) {
                return true;
            }
        }
        return false;
    }
}
