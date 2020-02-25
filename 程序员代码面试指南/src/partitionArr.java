import java.util.Scanner;

/**
 * @author dong
 * @date 2019/09/05 13:13
 * TODO: 数组的partition调整
 */
public class partitionArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("----------");
//        for (int a :
//                arr) {
//            System.out.print(a + " ");
//        }
        leftUnique(arr);
//        System.out.println();
//        System.out.println("----------");
        for (int a :
                arr) {
            System.out.print(a + " ");
        }

    }

    public static void leftUnique(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        int u = 0;
        int i = 1;
        while (i != arr.length){
            if (arr[i++] != arr[u]){
                swap(arr, ++u, i - 1);
            }
        }
    }
    public static void swap(int[] arr, int i, int u){
        int temp = arr[i];
        arr[i] = arr[u];
        arr[u] = temp;
    }
}
