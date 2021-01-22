package leetcode.medium;

import leetcode.util.TreeNode;

/**
 * 描述:
 * 337. 打家劫舍
 *
 * @author dong
 * @date 2020-03-26 22:23
 */
public class HouseRobberIII {
    /**
     * 递归方法
     * @param root 根节点
     * @return 根节点和其子叶下级节点的和 与 子叶节点的和 中的最大值
     */
    public int rob(TreeNode root){
        if (root == null) {
            return 0;
        }
        int val = 0;
        if (root.left != null) {
            val += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            val += rob(root.right.left) + rob(root.right.right);
        }
        return Math.max(rob(root.left) + rob(root.right), val + root.val);
    }

    /**
     * 动态规划
     * @param root 根节点
     * @return 根节点和其子叶下级节点的和 与 子叶节点的和 中的最大值
     */
    public int rob2(TreeNode root) {
        int[] res = helper(root);
        return Math.max(res[0], res[1]);
    }

    public int[] helper(TreeNode r) {
        if (r == null) {
            return new int[2];
        }
        int[] left = helper(r.left);
        int[] right = helper(r.right);
        int[] res = new int[2];
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = r.val + left[0] + right[0];
        return res;
    }

}

