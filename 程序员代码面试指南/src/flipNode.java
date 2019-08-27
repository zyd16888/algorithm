import java.util.Scanner;

/**
 * @author dong
 * @date 2019/08/26 10:43
 * TODO: 实现反转单向链表和双向链表的函数
 */
public class flipNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doReverse dr = new doReverse();
        long n = sc.nextInt();
        int headvalue = sc.nextInt();
        Node head = new Node(headvalue);
        Node temp = head;
        for (int i = 1; i < n; i++){
           Node node = new Node(sc.nextInt());
           temp.next = node;
           temp = node;
        }
        Node flipNode = dr.reverseList(head);
        while (flipNode != null){
            System.out.print(flipNode.value + " ");
            flipNode = flipNode.next;
        }
        System.out.println();
        long n2 = sc.nextInt();
        int headvalue2 = sc.nextInt();
        DoubleNode doubleHead = new DoubleNode(headvalue2);
        doubleHead.last = null;
        DoubleNode doubleTemp = doubleHead;
        for (int i = 1; i < n2; i++){
            DoubleNode node = new DoubleNode(sc.nextInt());
            node.last = doubleTemp;
            doubleTemp.next = node;
            doubleTemp = node;
        }
        DoubleNode flipDoubleNode = dr.reverseList(doubleHead);
        while (flipDoubleNode != null){
            System.out.print(flipDoubleNode.value + " ");
            flipDoubleNode = flipDoubleNode.next;
        }
    }



}

class doReverse{
    public DoubleNode reverseList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }
    public Node reverseList(Node head){
        Node pre = null;
        Node next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

class Node{
    public int value;
    public Node next;
    public Node(int value) {
        this.value = value;
    }
}

class DoubleNode{
    public int value;
    public DoubleNode last;
    public DoubleNode next;
    public DoubleNode(int data){
        this.value = data;
    }
}

