package winterholidaytraincamp6;

import java.util.Scanner;

/**
 * 描述:
 * 区间或和
 * https://ac.nowcoder.com/acm/contest/332/G
 *
 * @author dong
 * @date 2019-02-02 16:35
 */
public class Demo_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10000;
        while (n>0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long fin = a;
            for (long i=a; i<=b; i++){
                fin = fin | i;
            }
            System.out.println(fin);
            n--;
        }
    }
}
