package leetcode.Test.simple;

import simple.LongestCommonPrefix;

/**
 * 描述:
 * 14 测试类
 * @author dong
 * @date 2020-03-17 21:58
 */
public class LongestCommonPrefixTest {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs = {"dog","racecar","car"};
        String[] strs2 = {"flower","flow","flight"};
        System.out.println(lcp.longestCommonPrefix(strs));
        System.out.println(lcp.longestCommonPrefix(strs2));
    }
}
