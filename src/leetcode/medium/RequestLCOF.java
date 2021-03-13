package leetcode.medium;

/**
 * 描述：
 * 剑指 Offer 64. 求1+2+…+n
 * 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 *
 */
public class RequestLCOF {
    /**
     * 递归方法
     *
     * @param n
     * @return 求和后的值
     */
    public int sumNums(int n) {
        int sum = n;
        boolean falg = n > 0 && (sum += sumNums(n - 1)) > 0;
        return sum;
    }

    /**
     * 等差数列
     *
     * @param n
     * @return 求和后的值
     */
    public int sumNums2(int n) {
        return (int) (Math.pow(n, 2)) >> 1;
    }
}
