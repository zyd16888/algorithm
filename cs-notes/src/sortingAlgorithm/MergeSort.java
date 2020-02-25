package sortingAlgorithm;

/**
 * 描述:
 * 归并方法：将数组两个排序的部分归并成一个
 *
 * @author dong
 * @date 2020-02-25 19:16
 */
public abstract class MergeSort<T extends Comparable<T>> extends Sort<T> {

    protected T[] aux;

    protected void merge(T[] nums, int l, int m, int h){
        int i = l, j = m + 1;

        for (int k = l; k <= h; k++){
            //复制数据到辅助数组
            aux[k] = nums[k];
        }

        for (int k = l; k <= h; k++){
            if (i > m){
                nums[k] = aux[j++];
            }else if(j > h){
                nums[k] = aux[i++];
            }else if (aux[i].compareTo(aux[j]) <= 0){
                nums[k] = aux[i++];
            }else {
                nums[k] = aux[j++];
            }
        }

    }
}
