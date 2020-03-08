package sortingAlgorithm;

/**
 * 描述:
 * 快速排序2
 *
 * @author dong
 * @date 2020-03-05 20:08
 */
public class QuickSort2 {

    private void QuickSort2(int R[], int low, int high){
        int i, j, temp;
        i = low;
        j = high;

        if(low < high){
            temp = R[low];
            // 从右向左找小于temp的数来填R[i]
            while(i != j){
                while (j > i && R[j] >= temp){
                    --j;
                }
                if (i < j){
                    R[i] = R[j];
                    ++i;
                }
                // 从左向右找大于或等于temp的数来填R[j]
                while (i < j && R[i] < temp){
                    ++i;
                }
                if (i < j){
                    R[j] = R[i];
                    --j;
                }
            }
            R[i] = temp;
            QuickSort2(R, low, i-1);
            QuickSort2(R, i+1, high);

        }
    }


}
