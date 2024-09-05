package leetcode;

/**
 * @author zyd
 * @date 2024/9/5
 *
 * 3174. 清除数字
 * https://leetcode.cn/problems/clear-digits/
 */
public class ClearDigits {
    public String clearDigits(String s) {
        StringBuffer sb = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ClearDigits clearDigits = new ClearDigits();
        String s = "ab1c";
        System.out.println(clearDigits.clearDigits(s));

    }
}
