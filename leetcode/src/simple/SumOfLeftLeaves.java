package simple;

/**
 * 404. 左叶子之和
 *
 * @author dong
 * @date 2020-0-21 10:18
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        //判断节点是否是左叶子节点，如果是则将它的和累计起来
        if (root.left != null && root.left.left == null && root.left.right == null) {
            res += root.left.val;
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + res;
    }
}
