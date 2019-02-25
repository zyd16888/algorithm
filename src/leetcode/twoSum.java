package leetcode;

import jdk.jfr.events.ThrowablesEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * https://leetcode-cn.com/problems/two-sum/
 *
 * @author dong
 * @create 2019-02-25 10:57
 */
public class twoSum {

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        for (int a: twoSum2(nums, target)) {
            System.out.println(a);
        }

        for (int b: twoSum3(nums, target)) {
            System.out.println(b);
        }

        for (int c :
                twoSum(nums, target)) {
            System.out.println(c);
        }

    }


    /**
     * @deprecated 暴力法，遍历查找 时间复杂度：O(n^2) 空间复杂度：O(1)。
     * @date 11:32 2019/2/25
     * @param [nums, target]
     * @return int[]
     */
    public static int[] twoSum(int[] nums, int target){
        for (int i=0; i < nums.length; i++){
            for (int j = i+1; j< nums.length; j++){
                if (nums[i] == target - nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * @deprecated 两编哈希表 时间O(n) 空间O(n)
     * @date 22:17 2019/2/25
     * @param [nums, target]
     * @return int[]
     */
    public static int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< nums.length; i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i<nums.length; i++ ){
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i){
                return new int[] {i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * @deprecated 一遍哈希表 时间O(n) 空间O(n)
     * @date 22:30 2019/2/25
     * @param [nums, target]
     * @return int[]
     */
    public static int[] twoSum3(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }



}
