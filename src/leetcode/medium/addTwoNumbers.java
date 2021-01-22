package medium;

/**
 * 描述:
 * https://leetcode-cn.com/problems/add-two-numbers/
 * 2.两数相加
 *
 * @author dong
 * @create 2019-02-25 22:56
 */
public class addTwoNumbers {
    ListNode dummyHead = new ListNode(0);

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        medium.ListNode l1 = new  medium.ListNode(0);
        for (int i = 0; i <= 3; i++){
            l1.val = sc.nextInt();
            l1 = l1.next;
        }*/

        /*medium.ListNode l2 = new medium.ListNode(5);
        l2.next = new medium.ListNode(6);
        l2 = l2.next;
        l2.next = new medium.ListNode(4);*/

        //输出
        System.out.println();
    }

    /**
     * @deprecated 时间 O(max(m,n)) 空间 O(max(m,n))
     * @date 22:32 2019/2/26
     * @param [l1, l2]
     * @return medium.ListNode
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum/10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null){
                p = p.next;
            }
            if (q != null){
                q = q.next;
            }
        }if (carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode ( int x ) {
        val = x;
    }
}
