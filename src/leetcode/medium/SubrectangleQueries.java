package leetcode.medium;

/**
 * 描述:
 * 1476. 子矩形查询
 *
 * @author dong
 * @date 2021-03-06 18:51
 */
public class SubrectangleQueries {

    private int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    private void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                this.rectangle[i][j] = newValue;
            }
        }
    }
    private int getValue(int row, int col) {
        return this.rectangle[row][col];
    }
}
