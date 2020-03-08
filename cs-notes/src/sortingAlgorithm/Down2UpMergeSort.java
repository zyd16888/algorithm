package sortingAlgorithm;

/**
 * 描述:
 * 自底向上归并排序
 *
 * @author dong
 * @date 2020-02-25 19:48
 */
public class Down2UpMergeSort<T extends Comparable<T>> extends MergeSort<T> {

    @Override
    public void sort(T[] nums) {
        int n = nums.length;
        aux = (T[]) new Comparable[n];

        for (int sz = 1; sz < n; sz += sz) {
            for (int lo = 0; lo < n - sz; lo += sz + sz) {
                merge(nums, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, n - 1));
            }
        }

    }
}
