package day03;

import java.util.Scanner;

/**
 * 描述:
 * https://ac.nowcoder.com/acm/contest/3004/H
 *
 * @author dong
 * @date 2020-02-08 16:56
 */
public class exam_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        int[] ans = new int[m];
        for (int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("`````````````````````````````````");
        for (int a:arr
        ) {
            System.out.println(a);
        }
        System.out.println("`````````````````````````````````");
        for (int i = 3; i <= n; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if (i % j == 0){
                    if (isComposite(j)){
                        count ++;
                    }
                }
            }
            for (int k = 0; k < m; k++){
                if (count == arr[k]){
                    ans[k] += 1;
                }
            }
        }
        for (int a:ans
             ) {
            System.out.println(a);
        }

    }

    /**
     * 判断一个数是不是合数
     * @param num
     * @return boolean
     */
    static boolean isComposite(int num) {
        if (num <= 3) {
            return false;
        }
        // 不在6的倍数两侧的一定不是质数
        if (num % 6 != 1 && num % 6 != 5) {
            return true;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return true;
            }
        }
        return false;
    }
}
