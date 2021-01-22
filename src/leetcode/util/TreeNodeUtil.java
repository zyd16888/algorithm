package util;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 描述：
 * 数组转二叉树，leetcode输入工具
 *
 * @author zyd47
 * @date 2020-09-28 9:57
 */
public class TreeNodeUtil {
    public static TreeNode arrayToTreeNode(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isLeft = true;
        for (int i = 1; i < array.length; i++) {
            TreeNode node = queue.peek();
            if (isLeft) {
                if (array[i] != null) {
                    node.left = new TreeNode(array[i]);
                    queue.offer(node.left);
                }
                isLeft = false;
            } else {
                if(array[i] != null) {
                    node.right = new TreeNode(array[i]);
                    queue.offer(node.right);
                }
                queue.poll();
                isLeft = true;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        TreeNodeUtil test = new TreeNodeUtil();
        TreeNode root = arrayToTreeNode(arr);
    }
}
