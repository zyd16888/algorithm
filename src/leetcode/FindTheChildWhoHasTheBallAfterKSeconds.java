package leetcode;

/**
 * @author zyd
 * @date 2024/9/5
 *
 * 3178. 找出 K 秒后拿着球的孩子
 * https://leetcode.cn/problems/find-the-child-who-has-the-ball-after-k-seconds/
 */
public class FindTheChildWhoHasTheBallAfterKSeconds {
    public int numberOfChild(int n, int k) {
        int num = 0, direction = 1;
        while (k >0) {
            if (num + direction < 0 || num + direction >= n) {
                direction *= -1;
            }
            num += direction;
            k--;
        }
        return  num;
    }


    public int numberOfChild2(int n, int k) {
        k %= 2 * n - 2;
        if (k <= n - 1) {
            return k;
        } else {
            return 2 * n - 2 - k;
        }
    }
}
