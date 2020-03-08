package daily;

import java.util.Scanner;

/**
 * 描述:
 * 交换以空格分隔的str
 * 输入： abcdef ghijk qwety
 * 要求：交换第一和第三部分
 *
 * @author dong
 * @date 2020-03-06 16:45
 */
public class StrChange  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        for (int i = 0; i < 3; i++){
            arr[i] = sc.next();
        }

        //方法二
        String s = sc.nextLine();
        String[] arr2 = s.split(" ");

        String temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        for (String i :
                arr) {
            System.out.print(i + " ");
        }
    }
}
