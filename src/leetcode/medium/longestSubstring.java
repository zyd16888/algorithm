package leetcode.medium;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 描述:
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * 3.无重复字符的最长子串
 *
 * @author dong
 * @create 2019-03-02 17:00
 */
public class longestSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = lengthOfLongestSubstring(s);
        System.out.println(num);
    }


    /**
     * @deprecated 暴力法，时间复杂度 O(n^3) 空间复杂度：O(min(n, m))
     * @date 17:35 2019/3/2
     * @param [s]
     * @return int
     */
    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        int ans = 0;
        for (int i=0; i<n; i++){
            for (int j = i+1; j<=n; j++){
                if (allUnique(s,i,j)){
                    ans = Math.max(ans, j-i);
                }
            }
        }
        return ans;
    }

    public static boolean allUnique(String s, int start, int end){
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++){
            Character ch = s.charAt(i);
            if (set.contains(ch)){
                return false;
            } else{ set.add(ch);}
        }
        return true;
    }
}
