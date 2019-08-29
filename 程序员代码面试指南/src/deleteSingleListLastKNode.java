import java.util.Scanner;

/**
 * @author dong
 * @date 2019/08/29 8:52
 * TODO: 返回删除单链表的倒数第 K 个节点的链表
 */
public class deleteSingleListLastKNode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastKth = sc.nextInt();
        int firstKth = sc.nextInt();
        Node head = new Node(firstKth);
        Node temp = head;
        for (int i = 1; i < n; i++){
            Node node;
            node = new Node(sc.nextInt());
            temp.next = node;
            temp = node;
        }

        Node fin = removeLastkthNode(head, lastKth);
        for (int i = 0; i < n-1; i++){
            System.out.print(fin.value + " ");
            fin = fin.next;
        }
    }

    public static Node removeLastkthNode(Node head, int lastKth){
        if (head == null || lastKth < 1){
            return head;
        }
        Node cur = head;
        while (cur != null){
            lastKth--;
            cur = cur.next;
        }
        if (lastKth == 0){
            head = head.next;
        }
        if (lastKth < 0){
            cur = head;
            while (++lastKth != 0){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }
}
