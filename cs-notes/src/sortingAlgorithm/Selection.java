package sortingAlgorithm;

/**
 * 描述:
 * 选择排序
 * 时间复杂度：N^2
 *
 * @author dong
 * @date 2020-02-25 18:46
 */
public class Selection<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++){
            int min = i;
            for (int j = i + 1; j < N; j++){
                if (less(nums[j], nums[min])){
                    min = j;
                }
            }
            swap(nums, i, min);
        }
    }
}
