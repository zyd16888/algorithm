package niuke.winterholidaytraincamp4;

import java.util.Scanner;

/**
 * 描述:
 * 	Applese 的取石子游戏
 * https://ac.nowcoder.com/acm/contest/330/A
 *
 * @author dong
 * @date 2019-01-29 13:07
 */
public class Demo_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        if (startLeft(num,n)){
            System.out.println("Applese");
        }else {
            System.out.println("Bpplese");
        }

    }

    public static boolean startLeft(int[] num, int n){
        int R, L;
        int A = 0, B = 0;
        R = n-1;
        L = 0;
        boolean flag = false ;
        while (L<(n/2)){
            if (num[L]>=num[R]){
                A += num[L];
                L++;
            }else {
                A += num[R];
                R--;
            }
            if (num[L]>=num[R]){
                B += num[L];
                L++;
            } else {
                B += num[R];
                R--;
            }
            n -=2;
        }
        System.out.println("A="+A);
        System.out.println("B="+B);
        if (A>=B){
            flag = true;
        }

        return flag;

    }
}
