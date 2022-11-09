package simple;

/**
 * 描述:
 * 面试题21.调整数组顺序使奇数位于偶数前面
 *
 * @author dong
 * @date 2020-04-24 7:20
 */
public class ExchangeArrayOddBeforeEven {
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1;
        int temp = 0;
        while (i < j) {
            while (i < j && (nums[i]&1) == 1) {i++;}
            while (i < j && (nums[j]&1) == 1) {j--;}
            temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
