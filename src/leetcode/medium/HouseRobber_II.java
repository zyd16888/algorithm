package medium;

/**
 * 描述:
 * 213. 打家劫舍II
 * 第一个和最后一个不能同时抢。 所以：要么不抢第一个，要么不抢最后一个。
 * 将数组划分成两队，然后分别遍历， 具体参考 17.16
 *
 * @author dong
 * @date 2020-03-26 21:43
 */
public class HouseRobber_II {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int  a = 0, b = 0;
        // 遍历 0 ~ n-1
        for (int i = 0; i < nums.length - 1; i++) {
            int c = Math.max(b, a + nums[i]);
            a = b;
            b = c;
        }
        // 遍历 1 ~ n
        int d = 0, e = 0;
        for (int i = 1; i < nums.length; i++) {
            int f = Math.max(e, d + nums[i]);
            d = e;
            e = f;
        }
        return Math.max(b, e);
    }
}
