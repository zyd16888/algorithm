package leetcode.simple;

import leetcode.util.TreeNode;

/**
 * 描述：
 * 235. 二叉搜索树的最近公共祖先
 * 利用二叉搜索树的特点，如果p、q的值都小于root，说明p q 肯定在root的左子树中；如果p q都大于root，说明肯定在root的右子树中，如果一个在左一个在右 则说明此时的root记为对应的最近公共祖先
 *
 * @author zyd47
 * @date 2020-09-27 8:02
 */
public class LowestCommonAncestor {
    TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lca(root, p, q);
        return res;
    }
    public void lca(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val - p.val) * (root.val - q.val) <= 0) {
            res = root;
        } else if (root.val < p.val && root.val < q.val) {
            lca(root.right, p, q);
        }else {
            lca(root.left, p, q);
        }
    }
}
