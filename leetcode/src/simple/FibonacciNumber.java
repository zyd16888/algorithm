package simple;

/**
 * 描述:
 * 509. 斐波那契数列
 *
 * @author dong
 * @date 2020-04-21 17:51
 */
public class FibonacciNumber {

    /**
     * 递归方法
     * @param n 第N项
     * @return 返回第N项的值
     */
    private int f1(int n){
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return f1(n - 1) + f1(n - 2);
    }

    /**
     * 通过计算实现
     * @param n 第N项
     * @return 返回第N项的值
     */
    private int f2(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int res = 1;
        int pre = 1;
        int tmp = 0;
        for (int i = 3; i <= n; i++) {
            tmp = res;
            res = res + pre;
            pre = tmp;
        }
        return res;
    }
}
