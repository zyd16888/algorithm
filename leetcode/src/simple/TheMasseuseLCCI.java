package simple;

/**
 * 描述:
 * 17.16. 按摩师
 *
 * @author dong
 * @date 2020-03-26 21:09
 */
public class TheMasseuseLCCI {
    public int message(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i -2] + nums[i]);
        }
        return dp[n - 1];
    }

    public int message2(int[] nums) {
        int  a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            int c = Math.max(b, a + nums[i]);
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        TheMasseuseLCCI test = new TheMasseuseLCCI();
        int res = test.message(nums);
        System.out.println(res);
    }
}
