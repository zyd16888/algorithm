package daily;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 描述:
 * 去掉重复的字母，不分大小写
 * @author dong
 * @date 2020-03-14 17:08
 */
public class RemoveRepeatLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++){
            Character Cap = str.toUpperCase().charAt(i);
            Character Low = str.toLowerCase().charAt(i);
            if (!set.contains(Cap) || !set.contains(Low)){
                res += str.charAt(i);
                set.add(Cap);
                set.add(Low);
            }
        }
        System.out.println(res);
    }
}
