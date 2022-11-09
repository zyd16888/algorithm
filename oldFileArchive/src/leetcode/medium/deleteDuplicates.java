package leetcode.medium;

/**
 * 描述：
 * 82.删除排序链表中的重复元素
 *
 * @author dong
 * @date 2021-03-35 13:31
 */
public class deleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        //出现连续重复则丢弃当前节点内容
        if (head.val == next.val) {
            while (next != null && head.val == next.val) {
                next = next.next;
            }

            head = deleteDuplicates(next);
        } else {
            head.next = deleteDuplicates(next);
        }

        return head;
    }
}
