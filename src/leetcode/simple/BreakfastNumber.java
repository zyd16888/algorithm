package simple;

import java.util.Arrays;

/**
 * 描述：
 * LCP 18. 早餐组合
 * https://leetcode-cn.com/problems/2vYnGI/
 *
 * @author zyd47
 * @date 2020-09-24 15:43
 */
public class BreakfastNumber {
    private int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int res = 0;
        int i = 0;
        int j = drinks.length - 1;
        while (i < staple.length && j >= 0) {
            if (staple[i] + drinks[j] > x) {
                j--;
            } else {
                res += (j + 1);
                res %= 1000000007;
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] staple = {10, 20, 5};
        int[] drinks = {5, 5, 2};
        BreakfastNumber test = new BreakfastNumber();
        int res = test.breakfastNumber(staple, drinks, 15);
        System.out.println(res);
    }
}
