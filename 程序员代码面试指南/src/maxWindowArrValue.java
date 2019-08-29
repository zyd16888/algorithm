import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author dong
 * @date 2019/08/25 21:39
 * TODO: 滑动窗口数组最大值
 */
public class maxWindowArrValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int w = sc.nextInt();
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] res = getMaxWindow(arr, w);
        for (int a :
                res) {
            System.out.print(a + " ");
        }
    }

    public static int[] getMaxWindow(int[] arr, int w){
        if (arr == null || w < 1 || arr.length < w){
            return null;
        }
        LinkedList<Integer>  qmax = new LinkedList<Integer>();
        int[] res = new int[arr.length - w + 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (qmax.peekFirst() == i - w){
                qmax.pollFirst();
            }
            if (i >= w - 1){
                res[index++] = arr[qmax.peekFirst()];
            }
        }
        return res;
    }
}
