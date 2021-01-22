package simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 1260. 二维网络迁移
 *
 * @author dong
 * @date 2020-03-18 11:00
 */
public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] nums = new int[grid.length * grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                k %= nums.length;
                nums[k++] = grid[i][j];
            }
        }
        k = 0;
        List<List<Integer>> lists = new ArrayList<>(grid.length);
        for (int i = 0; i < grid.length; i++) {
            List<Integer> tempList = new ArrayList<>(grid[0].length);
            for (int j = 0; j < grid[0].length; j++) {
                tempList.add(nums[k++]);
            }
            lists.add(tempList);
        }
        return lists;
    }
}
