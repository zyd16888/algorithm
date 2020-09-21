package simple;

/**
 * 描述:
 * 538. 把二叉搜索树转换为累加树
 * https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 *
 * @author dong
 * @date 2020-0-21 8:18
 */

public class ConvertBST {
    int num = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            //右子树
            convertBST(root.right);
            //根节点
            root.val = root.val + num;
            num = root.val;
            //左子树
            convertBST(root.left);
            return root;
        }
        return null;
    }
}
