package simple;

/**
 * 描述:
 * 27. 移除元素
 * 双指针覆盖前面元素
 *
 * @author dong
 * @date 2020-03-18 16:05
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
