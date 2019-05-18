package tencentsummary;

import java.util.Scanner;

/**
 * 描述:
 * 给定一个仅包含0或1的字符串，现在可以对其进行一种操作：
 * 当有两个相邻的字符其中有一个是0，另外一个是1的时候，可以消掉这两个字符
 * 这样的操作可以一直进行下去直到找不到相邻的0和1为止，问这个字符串最后的最短长度
 *
 * 输入： 第一行一个整数为字符串长度，第二行为字符串
 * @author dong
 * @create 2019-04-05 20:22
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nn = sc.nextLine();
        String str = sc.nextLine();
        char[] chars = str.toCharArray();

        int num0 = 0;
        int num1 = 0;

        for (int i = 0; i < chars.length; i++){
            if (chars[i] == '0'){
                num0 ++;
            }if (chars[i] == '1'){
                num1 ++;
            }
        }

        int fin = num0 - num1;
        System.out.println(Math.abs(fin));

    }
}
