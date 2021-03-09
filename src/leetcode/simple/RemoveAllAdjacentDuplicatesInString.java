package leetcode.simple;

import java.util.Arrays;

/**
 * 描述：
 * 1047. 删除字符串中的所有相邻重复项
 *
 * @author zyd
 * @date 2021-03-09 09:59
 */
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        char[] res = new char[chars.length];
        int num = 0;
        for (char c : chars) {
            if (num == 0) {
                res[num++] = c;
            } else {
                if (c == res[num - 1]) num--;
                else res[num++] = c;
            }
        }
        return new String(Arrays.copyOf(res, num));
    }
}