package tencentsummary;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述:
 * 因讨厌马云而彻底放弃网购，他的日常用品都要到商场去购买，而且必须付现金。但是现金购买，经常会遇到找零的问题，那么现在请你帮助他解决这样一个问题：现在 Mr_he 手上有 n 种不同面值的硬币，每种硬币有无限多个。为了方便购物，他希望带尽量少的硬币，但是要能组合出 1 到 m 之间的任意值。
 *  第一行为两个整数：m 和 n，他们的意义如题目描述。接下来的 n 行，每行一个整数，第 i+1 行的整数表示第 i 种硬币的面值
 * 输出：最少需要携带的硬币数量，如果无解则输出-1。
 * 样例输入：
 * 20 4
 * 1
 * 2
 * 5
 * 10
 * 样例输出：5
 * @author dong
 * @create 2019-04-05 20:13
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        if (arr[0] != 1){
            System.out.println("-1");
        }
        int sum = 0;
        int ans = 0;
        while (true){
            if (sum >= m){
                System.out.println(ans);
                return;
            }
            //从大到小
            for (int i = n-1; i >= 0; i--){
                if (arr[i] <= sum+1){
                    sum += arr[i];
                    ans++;
                    break;
                }
            }
        }

    }

}
