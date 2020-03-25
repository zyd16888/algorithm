package simple;

/**
 * 描述:
 * 125.验证回文串
 *
 * @author dong
 * @date 2020-03-21 13:05
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        String str = s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
        for (int i = 0, j = str.length()-1; i < j; i++,j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
