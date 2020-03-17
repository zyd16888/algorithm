package day03;

import java.util.Scanner;

/**
 * 描述:
 * https://ac.nowcoder.com/acm/contest/3004/C
 *
 * @author dong
 * @date 2020-02-08 13:21
 */
public class exam_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String flag = "";
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt();
            int[][] arr = new int[n][m];
            for (int j = 0; j < p; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int val =sc.nextInt();
                arr[x][y] = val;
            }

            for (int[] a:arr
                 ) {
                System.out.println(a);
            }
        }
    }
}
