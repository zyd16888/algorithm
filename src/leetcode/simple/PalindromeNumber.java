package simple;

/**
 * 描述:
 * 9. 回文数
 *
 * @author dong
 * @date 2020-03-16 21:07
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x == 0){
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int num = x;
        int temp = 0;
        while (x > 0){
            temp = temp * 10 + (x % 10);
            x /= 10;
        }

        return num == temp;

    }
}
