package niuke.winterholidaytraincamp6;

import java.util.Scanner;

/**
 * 描述:
 * 美食
 * https://ac.nowcoder.com/acm/contest/332/D
 *
 * @author dong
 * @date 2019-02-02 14:26
 */
public class Demo_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long num = 0;
        long fin = 0;
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextLong();
            if (arr[i] != 0){
                num += arr[i];
            } else {
                fin += num/2;
                num = 0;
            }
        }
        fin += num/2;

        System.out.println(fin);
    }
}
