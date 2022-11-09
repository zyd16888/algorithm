package leetcode.medium;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 * 145. 二叉树的后序遍历
 *
 * @author zyd47
 * @date 2020-09-29 8:14
 */
public class PostorderTraversal {
    public List<Integer> res = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null){
            return res;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        res.add(root.val);
        return res;
    }
}
