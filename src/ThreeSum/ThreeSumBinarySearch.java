package ThreeSum;

import java.util.Arrays;

/**
 * 描述:
 * 通过将数组先排序，对两个元素求和，并用二分查找方法查找是否存在该和的相反数，如果存在，就说明存在三元组的和为 0。
 * 应该注意的是，只有数组不含有相同元素才能使用这种解法，否则二分查找的结果会出错。
 * 该方法可以将 ThreeSum 算法增长数量级降低为 O(N2logN)。
 *
 * @author dong
 * @date 2018-12-10 22:19
 */
public class ThreeSumBinarySearch implements ThreeSum {
    @Override
    public int count(int[] nums) {
        int cnt = 0;
        Arrays.sort(nums);   //对数组从小到大排序
        int N = nums.length;

        for (int i=0; i<N; i++){
            for (int j=i+1; j<N; j++){
                int inger = nums[i]+nums[j];
                int index = BinarySearch.search(nums,inger);// -8  2  6  则返回值大于2
                // 应该注意这里的下标必须大于 j，否则会重复统计
                if (index>j){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
