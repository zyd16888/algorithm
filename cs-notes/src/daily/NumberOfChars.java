package daily;

import java.util.Scanner;

/**
 * 描述:
 * 字符统计
 * 统计字符串中各个字符出现的次数
 *
 * @author dong
 * @date 2020-03-07 19:25
 */
public class NumberOfChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ch = 0, num = 0, ko = 0, other = 0;
        for (int i = 0; i < str.length(); i++){
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
                ch++;
            }else if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                num++;
            }else if (str.charAt(i) == ' '){
                ko++;
            }else {
                other++;
            }
        }
        System.out.println("英文字母: "+ch);
        System.out.println("空格: "+ko);
        System.out.println("数字: "+num);
        System.out.println("其它字符: "+other);

    }
}
