package sortingAlgorithm;

/**
 * 描述:
 * 冒泡排序
 * 时间复杂度n²
 * @author dong
 * @date 2020-02-25 18:54
 */
public class Bubble<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int n = nums.length;
        boolean isSorted = false;
        for (int i = n - 1; i > 0 && !isSorted; i--){
            isSorted = true;
            for (int j = 0; j < i; j++){
                if (less(nums[j + 1], nums[j])){
                    isSorted = false;
                    swap(nums, j, j+1);
                }
            }
        }
    }
}
