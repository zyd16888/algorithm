import java.util.Scanner;

/**
 * @author dong
 * @date 2019/08/27 10:43
 * TODO: 打印升序链表公共部分
 */
public class printCommonList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int headValue1 = sc.nextInt();
        NodeList head1 = getList(sc, n1, headValue1);

        int n2 = sc.nextInt();
        int headValue2 = sc.nextInt();
        NodeList head2 = getList(sc, n2, headValue2);

        print(head1,head2);
    }

    private static NodeList getList(Scanner sc, int n, int headValue) {
        NodeList head = new NodeList(headValue);
        NodeList temp = head;
        for (int i = 1; i < n; i++){
            NodeList node = new NodeList(sc.nextInt());
            temp.next = node;
            temp = node;
        }
        return head;
    }

    private static void print(NodeList head1, NodeList head2){
        System.out.println("common Part: ");
        while (head1 != null && head2 != null){
            if (head1.value < head2.value){
                head1 = head1.next;
            }else if (head1.value > head2.value){
                head2 = head2.next;
            }else{
                System.out.print(head1.value + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        System.out.println();
    }
}

class NodeList{
    public int value;
    public NodeList next;
    public NodeList(int data){
        this.value = data;
    }
}
