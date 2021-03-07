package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * 描述：
 * 131. 分割回文串
 *
 * @author zyd
 * @data 2021-03-07 21:41
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<List<String>>> dp = new ArrayList<>(n + 1);
        dp.add(Collections.singletonList(Collections.emptyList()));
        for (int i = 0; i < n; i++) {
            dp.add(new ArrayList<>());
            for (int j = i; j >= 0; j--) {
                if (isPalindrome(s, j, i)) {
                    String palindrome = s.substring(j, i + 1);
                    for (List<String> plan : dp.get(j)) {
                        List<String> plan2 = new ArrayList<>(plan);
                        plan2.add(palindrome);
                        dp.get(i + 1).add(plan2);
                    }
                }
            }
        }
        return dp.get(n);
    }

    private static boolean isPalindrome(String s, int from, int to) {
        while (from < to) if (s.charAt(from++) != s.charAt(to--)) return false;
        return true;
    }


    public static void main(String[] args) {
        PalindromePartitioning test = new PalindromePartitioning();
        String a = "aab";
        List<List<String>> list = test.partition(a);
        System.out.println(list);
    }
}
