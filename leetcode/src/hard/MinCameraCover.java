package hard;

import util.TreeNode;

/**
 * 968. 监控二叉树
 *
 *
 * @author dong
 * @date 2020-09-21 10:21
 */
public class MinCameraCover {
    private int ans = 0;

    public int minCameraCover(TreeNode root) {
        if (root == null) {return 0;}
        if (dfs(root) == 2) {ans++;}
        return ans;
    }

    private int dfs(TreeNode node) {
        if(node == null) {
            return 1;
        }
        int left = dfs(node.left), right = dfs(node.right);
        if (left == 2 || right == 2) {
            ans++;
            return 0;
        } else if (left == 0 || right == 0) {
            return 1;
        } else {
            return 2;
        }
    }

}
