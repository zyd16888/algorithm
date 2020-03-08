package daily;

import java.util.Scanner;

/**
 * 描述:
 * 判断字符串是否回文
 *
 * @author dong
 * @date 2020-02-28 22:20
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.next();
        if (isPa(s, 0)){
            System.out.println("字符串： " + s + " 是回文串");
        }else {
            System.out.println("字符串： " + s + " 不是回文串");
        }

    }

    static public boolean isPa(String s, int n){
        if (s.charAt(0) == s.charAt(s.length() - 1)){
            if (s.length() > 2){
                return isPa(s.substring(n+1,s.length()-1), 0);
            }
            else {
                return true;
            }
        }
        else { return false; }
    }
}
