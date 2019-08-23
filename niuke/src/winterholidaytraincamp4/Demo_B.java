package winterholidaytraincamp4;

import java.util.Scanner;

/**
 * 描述:
 * Applese 走方格
 * https://ac.nowcoder.com/acm/contest/330/B
 *
 * @author dong
 * @date 2019-01-29 17:02
 */
public class Demo_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n<=1 || m<=1){
            System.out.println("-1");
            return;
        } else {
            String fin = "";
            for (int i = 0; i < m - 1; i++) {
                fin += "R";
            }
            fin += "D";
            for (int i = 0; i < m - 1; i++) {
                fin += "L";
            }
            fin += "U";

            System.out.println(fin);
        }
    }
}
