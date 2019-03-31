package zijietiaodong;

import java.util.Scanner;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-16 11:14
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            int[] arr = new int[num];
            int fin = 0;
            for (int a : arr) {
                a = sc.nextInt();
                fin += a;
            }
            if (num < 3){
                System.out.println(fin);
                continue;
            }
            for (int j = 1; j < num-1; j++){
                if (arr[j] > arr[j-1]){
                    fin += 1;
                }
                /*if (arr[j] == arr[j-1] || arr[j] == arr[j+1]){
                    fin -= 1;
                }*/
                if (arr[j] > arr[j+1]){
                    fin += 1;
                }
                /*if (arr[j] == arr[j+1]){
                    fin -= 1;
                }*/
            }
            if (arr[num-1] > arr[num-2]){
                fin += 1;
            }
            if (arr[num-1] > arr[0]){
                fin += 1;
            }
            System.out.println(fin);
        }
    }
}
