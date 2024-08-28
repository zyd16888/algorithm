package acm;

import java.util.Scanner;

/**
 * @author zyd
 * @date 2024/8/28
 *
 * 分割数组的最大差值
 *
 * 题目描述
 * 给定一个由若干整数组成的数组nums ，可以在数组内的任意位置进行分割，将该数组分割成两个非空子数组（即左数组和右数组），分别对子数组求和得到两个值，计算这两个值的差值，请输出所有分割方案中，差值最大的值。
 *
 * 输入描述
 * 第一行输入数组中元素个数n，1 < n <= 100000
 *
 * 第二行输入数字序列，以空格进行分隔，数字取值为4字节整数
 *
 * 输出描述
 * 输出差值的最大取值
 *
 * 示例
 * 输入
 * 6
 * 1 -2 3 4 -9 7
 * 输出
 * 10
 *
 * 前缀和方式求解
 *
 */
public class MaximumDifferenceOfSplitArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        int rsum = 0;
        int lsum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
            rsum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            lsum += nums[i];
            rsum -= nums[i];
            max = Math.max(max, Math.abs(lsum - rsum));
            System.out.println(max);
        }
    }
}
