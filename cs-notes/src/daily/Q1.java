package daily;

import java.util.Scanner;

/**
 * 描述:
 * 买口罩
 * 种类：价格/个数
 * 输入：钱的数量
 * 输出：最多买口罩的数量
 *
 * D:1/5 = 0.2
 * F:2/3 = 0.67
 * B:2/3 = 0.67
 * A:2/2 = 1
 * E:5/4 = 1.25
 * C:3/1 = 3
 * 1<money<15
 *
 * @author dong
 * @date 2020-04-08 19:50
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        //特例，跳过A，直接买E
        if (money == 10 || money == 11) {
            System.out.println(15);
        } else {
            int res = 0;
            money -= 1;
            res += 5;
            if (money >= 2) {
                money -= 2;
                res += 3;
                if (money >= 2) {
                    money -= 2;
                    res += 3;
                    if (money >= 2) {
                        money -= 2;
                        res += 2;
                        if (money >= 5) {
                            money -= 5;
                            res += 4;
                        }
                        if (money >= 3) {
                            res += 1;
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }
}
