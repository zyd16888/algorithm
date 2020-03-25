package simple;

/**
 * 描述:
 * 26. 删除排序数组中的重复项
 *
 * @author dong
 * @date 2020-03-18 16:23
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1){
            return nums.length;
        }
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]){
                j++;
            }else {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
