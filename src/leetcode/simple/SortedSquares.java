package simple;

/**
 * 描述：
 * 977. 有序数组的平方
 *
 * @author zyd47
 * @date 2020-10-16 8:29
 */
public class SortedSquares {
    public int[] sortedSquares(int[] A){
        int start = 0;
        int end = A.length;
        int i = end - 1;
        int[] nums = new int[end--];
        while (i >= 0) {
            nums[i--] = A[start] * A[start] >= A[end] * A[end] ? A[start] * A[start++] : A[end] * A[end--];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        SortedSquares test = new SortedSquares();
        int[] res = test.sortedSquares(nums);
        for (int a : res){
            System.out.print(a + " ");
        }
    }
}
