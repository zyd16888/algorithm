package leetcode;

/**
 * @author zyd
 * @date 2024/8/30
 *
 * 3153. 所有数对中数位差之和
 *  https://leetcode.cn/problems/sum-of-digit-differences-of-all-pairs/
 */
public class SumOfDigitDifferencesOfAllPairs {

    public long sumDigitDifferences(int[] nums) {
        long res = 0;
        int n = nums.length;
        while (nums[0] > 0) {
            int[] cnt = new int[10];
            for (int i = 0; i < n; i++) {
                cnt[nums[i] % 10]++;
                nums[i] /= 10;
            }
            for (int i = 0; i < 10; i++) {
                res += (long) (n - cnt[i]) *cnt[i];
            }
        }
        return res/2;
    }

}
