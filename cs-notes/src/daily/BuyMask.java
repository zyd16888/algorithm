package daily;

import java.util.Scanner;

/**
 * 描述:
 * 买口罩问题
 * 口罩有一袋5个和一袋7个的两种包装，不散装销售，想买刚好k个，袋数尽量少，不能凑够k个就不买了，应该怎么买
 * @author dong
 * @date 2020-03-06 17:00
 */
public class BuyMask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = k/7;
        //System.out.println("a = " + a);
        int y = k%7;
        //System.out.println("y = " + y);
        int b = 0;
        while (a > 0) {
            int c = (y + b * 7) % 5;
            if (c == 0) {
                System.out.println("7a = " + a + ",  5c = " + (y + b * 7)/5);
                System.exit(0);
            } else {
                a--;
                b++;
            }
        }
        System.out.println("没有合适的购买方案");
    }
}
