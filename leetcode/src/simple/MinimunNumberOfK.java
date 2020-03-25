package simple;

import java.util.Arrays;

/**
 * 描述:
 * 面试题40. 最小的k个数
 * https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/comments/296827
 *
 * @author dong
 * @date 2020-03-20 7:54
 */
public class MinimunNumberOfK {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
