package simple;

/**
 * 665. 非递减数列
 * https://leetcode-cn.com/problems/non-decreasing-array/
 *
 * @author dong
 * @date 2020
 */
public class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return true;
        }
        int cnt = 0;
        for (int i = 1; i < nums.length && cnt < 2; i++) {
            if (nums[i-1] <= nums[i]) {
                continue;
            }
            cnt++;
            if (i - 2 >= 0 && nums[i-2] > nums[i]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i - 1] = nums[i];
            }
        }
        return cnt <= 1;
    }

    public static void main(String[] args) {
        CheckPossibility test = new CheckPossibility();
        int[] nums = {4, 2, 1};
        boolean res = test.checkPossibility(nums);
        System.out.println(res);
    }
}
