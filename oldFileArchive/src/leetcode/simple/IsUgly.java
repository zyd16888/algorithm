package simple;

/**
 * 描述：
 * 263. 丑数
 *
 * @author zyd47
 * @date 2020-10-09 13:34
 */
public class IsUgly {
    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 2 == 0) {
            num >>= 1;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        IsUgly test =  new IsUgly();
        boolean res = test.isUgly(14);
        System.out.println(res);
    }
}
