package medium;

/**
 * 描述:
 * 695. 岛屿的最大面积
 *
 * @author dong
 * @date 2020-03-15 21:05
 */
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1){
                    max = Math.max(dfs(grid, i, j), max);
                }
            }
        }
        return max;
    }
    private int dfs(int[][] grid, int i, int j) {
        int count = 1;
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        count += dfs(grid, i+1, j);
        count += dfs(grid, i-1, j);
        count += dfs(grid, i, j+1);
        count += dfs(grid, i, j-1);

        return count;
    }
}
