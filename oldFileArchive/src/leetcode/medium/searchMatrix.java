package leetcode.medium;

/**
 * 描述：
 * 74.搜索二维矩阵
 */
public class searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] < target){
                row++;
            }else if (matrix[row][col] > target) {
                col--;
            }else {
                return true;
            }
        }
        return false;
    }
}
