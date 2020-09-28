package simple;

import util.ListNode;

/**
 * 描述:
 * 删除链表的节点
 *
 * @author dong
 * @date 2020-04-24 6:53
 */

public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode cur = node;
        while (cur != null && cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return node.next;
    }
}
