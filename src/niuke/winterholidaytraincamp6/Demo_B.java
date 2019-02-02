package niuke.winterholidaytraincamp6;

import java.util.Scanner;

/**
 * 描述:
 * 煤气灶
 * https://ac.nowcoder.com/acm/contest/332/B
 *
 * @author dong
 * @date 2019-02-02 13:24
 */
public class Demo_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextLong();
        long d = sc.nextLong();
        long x = sc.nextLong();

        long fin = 0;
        long day = 0;

        while (fin < m && day < x){
            day++;
            fin += n;
            n += d;
        }

        System.out.println(day);

    }
}
