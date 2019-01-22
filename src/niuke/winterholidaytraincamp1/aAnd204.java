package niuke.winterholidaytraincamp1;

import java.util.Scanner;

/**
 * 描述:
 * 小a与"204"
 *
 * @author dong
 * @date 2019-01-22 15:11
 */
public class aAnd204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int n2=0, n0=0, n4=0;
        long sum=0;
        for (int i=0; i<n; i++){
            num[i] = sc.nextInt();
            if (num[i] == 2){
                n2++;
            }else if (num[i] == 0){
                n0++;
            }else if (num[i] == 4){
                n4++;
            }
        }

        /*System.out.println(n0);
        System.out.println(n2);
        System.out.println(n4);*/
        if (n4>0){
            for (int i = 0; i<2*n4&&i<n; i++) {
                num[i] = 4;
            }
        }
        if (n0>0){
            for (int i=1; i<2*n0&&i<n;i+=2){
                num[i] = 0;
            }
        }
        if (n4>=n0){
            for (int i=2*n0+1; i<n; i++){
                num[i]=2;
                if (i<n4*2-1){
                    i++;
                }
            }
        }else if (n0>n4){
            for (int i=2*n4+1; i<n; i++){
                num[i]=2;
                if (i<n0*2-1){
                    i++;
                }
            }
        }

        /*for (int a :
                num) {
            System.out.print(a+"  ");
        }*/
        sum = (long) Math.pow(num[0]-0,2);
        for (int i=1; i<num.length; i++){
            sum += Math.pow(num[i]-num[i-1],2);
        }

        System.out.println(sum);

    }
}
