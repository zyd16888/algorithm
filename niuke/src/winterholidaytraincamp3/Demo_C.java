package winterholidaytraincamp3;

import java.util.Scanner;

/**
 * 描述:
 * 处女座点名
 * https://ac.nowcoder.com/acm/contest/329/C
 *
 * @author dong
 * @date 2019-01-26 13:17
 */
public class Demo_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        int a = 1;


        for (int i=0; i<num.length-1; i++){
            num[i] = sc.nextInt();
        }
//        System.out.println(num[num.length-1]);
        if (num[num.length-2]<n){
            System.out.println(n);
        }else {
            for (int i=0; i<num.length-1; i++){
                if (a != num[i]){
                    break;
                }else {
                    a++;
                }
            }
            System.out.println(a);
        }

//        System.out.println(a);

    }
}
