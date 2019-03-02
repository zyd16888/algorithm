package winterholidaytraincamp3;

import java.util.Scanner;

/**
 * 描述:
 * 处女座和小姐姐
 * https://ac.nowcoder.com/acm/contest/329/E
 *
 * @author dong
 * @date 2019-01-26 16:11
 */
public class Demo_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] allNum = new int[t];
        for (int i=0; i<t; i++){
            int num = 0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (m%2==0){
                num = n*(m-1)-1;
            }else {
                num = n*m -2;
            }
            allNum[i] = num;
        }

        for (int a : allNum) {
            System.out.println(a);
        }
    }
}
