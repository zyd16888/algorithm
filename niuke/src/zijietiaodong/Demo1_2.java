package zijietiaodong;

import java.util.Scanner;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-16 10:14
 */
public class Demo1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        sc.close();

        int sum = 1024;
        int le = sum - cost;

        int n = le / 64;
        le = le % 64;

        n += le / 16;
        le = le % 16;

        n += le / 4;
        le = le % 4;

        n += le;

        System.out.println(n);
    }
}
