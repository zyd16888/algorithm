package daily;

import java.util.Scanner;

/**
 * 描述:
 * 三角形三边数字求和
 * 输入：9个数值，以逗号分隔
 * 输出，三边和值是否相等
 *
 * @author dong
 * @date 2020-04-08 20:34
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] chars = str.split(",");
        int[] arr = new int[chars.length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(chars[i]);
        }

        int res1 = arr[0] + arr[1] + arr[2] + arr[3];
        int res2 = arr[3] + arr[4] + arr[5] + arr[6];
        int res3 = arr[6] + arr[7] + arr[8] + arr[0];

        if (res1 == res2 && res2 == res3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
