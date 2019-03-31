package zijietiaodong;

import java.util.Scanner;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-16 10:04
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int num = 1024 - n;
        if ((num/n) == 0){
            System.out.println(num/n);
        }else {
            int t1 = 1024/n;
            int y1 = 1024%n;
        }
    }
}
