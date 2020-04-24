package simple;

import java.util.Arrays;

/**
 * 描述:
 * 169. 多数元素
 * 面试题39. 数组中出现次数超过一半的数字
 *
 * @author dong
 * @date 2020-04-24 8:55
 */
public class MajorityElement {
    /**
     * 直接遍历统计
     */
    public int majorityElement(int[] nums) {
        int maxCount = 0;
        int maxNum = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(num == nums[j]){
                    count++;
                }
            }
            if(count > maxCount){
                maxNum = nums[i];
                maxCount = count;
            }
        }
        return maxNum;
    }

    /**
     * 出现次数大于一半时，排序后必定在中间
     */
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    /**
     * 摩尔投票法
     */
    public int majorityElement3(int[] nums) {
        int res = 0, votes = 0;
        for (int num: nums) {
            if (votes == 0) {
                res = num;
            }
            votes += num == res ? 1: -1;
        }
        return res;
    }
}
