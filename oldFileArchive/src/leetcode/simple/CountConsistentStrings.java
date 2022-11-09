package leetcode.simple;

/**
 * 描述：
 * 1684.统计一致字符串的数目
 *
 * @author dong
 * @date 2021-03-23 11:01
 */
public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int[] allowIndex = new int[26];
        char[] charArray = allowed.toCharArray();
        for (char c : charArray) {
            allowIndex[c - 97] = 1;
        }
        for (String s : words) {
            char[] sChar = s.toCharArray();
            int i = 0;
            for (; i < sChar.length; i++) {
                if (allowIndex[sChar[i] - 97] != 1) {
                    break;
                }
            }
            if (i == sChar.length) {
                ++count;
            }
        }
        return count;
    }
}
