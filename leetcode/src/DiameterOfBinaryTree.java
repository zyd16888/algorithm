/**
 * 描述:
 * 543.二叉树的直径
 *
 *
 * @author dong
 * @date 2020-03-10 9:41
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class DiameterOfBinaryTree {
    int result = 0;
    public int dimaterOfBinaryTree(TreeNode root){
        if (root != null){
            Deep(root);
            return result;
        }
        return 0;
    }

    public int Deep(TreeNode root){
        if (root != null){
            int left = Deep(root.left);
            int right = Deep(root.right);
            // 选出最大深度
            result = Math.max(result, right+left);
            return Math.max(right, left) + 1;
        }
        return 0;
    }
}
