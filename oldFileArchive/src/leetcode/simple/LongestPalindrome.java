package simple;

/**
 * 描述:
 * 409. 最长回文串
 *
 * @author dong
 * @date 2020-03-19 18:03
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] arr = new int[58];
        for (char i : s.toCharArray()){
            arr[i - 'A']++;
        }
        int res = 0;
        for (int a : arr){
            res += (a / 2) * 2;
        }
        if (res < s.length()){
            res += 1;
        }
        return res;
    }
}
