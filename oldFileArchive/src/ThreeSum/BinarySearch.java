package ThreeSum;

/**
 * 描述:
 * 二分法查找
 * @author dong
 * @date 2018-12-10 23:46
 */
public class BinarySearch {
    public static int search(int[] nums, int target){
        int l = 0, h = nums.length - 1;
        while (l<=h){
            int m = l + (h - 1)/2;
            if (target == nums[m]){
                return m;
            }else if (target > nums[m]){
                l = m+l;
            }else {
                h = m-1;
            }
        }
        return -1;
    }
}
