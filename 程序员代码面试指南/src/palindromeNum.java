import java.util.Scanner;

/**
 * @author dong
 * @date 2019/08/30 10:20
 * TODO: 判断一个数是否为回文数
 */
public class palindromeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = inPalindrome(n);
        System.out.println(res ? "Yes" : "No");
    }

    public static boolean inPalindrome(int n){
        if(n == Integer.MIN_VALUE){
            return false;
        }
        n = Math.abs(n);
        int a = 1;
        while (n / a >= 10){
            a *= 10;
        }
        while (n != 0){
            if (n / a != n % 10){
                return false;
            }
            n = (n % a) / 10;
            a /= 100;
        }
        return true;
    }
}
