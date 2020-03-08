package sortingAlgorithm;

/**
 * 描述:
 * 插入排序:每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左侧数组依然有序。
 * 时间复杂度N^2
 * @author dong
 * @date 2020-02-25 19:01
 */
public class Insertion<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++){
            for (int j = i; j > 0 && less(nums[j], nums[j - i]); j--){
                swap(nums, j, j-i);
            }
        }
    }
}
