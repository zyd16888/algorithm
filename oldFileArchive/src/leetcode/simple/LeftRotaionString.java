package leetcode.simple;

/**
 * 描述：
 * 剑指 Offer 58 - II. 左旋转字符串
 *
 * @author dong
 * 2021-03-11
 */
public class LeftRotaionString {
    public String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            res.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        LeftRotaionString test = new LeftRotaionString();
        String s = "abcdefg";
        String s1 = test.reverseLeftWords(s, 3);
        System.out.println(s1);
    }
}
