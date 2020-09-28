package medium;

import util.Node;
import util.TreeNode;

import static util.TreeNodeUtil.arrayToTreeNode;

/**
 * 描述：
 * 117. 填充每个节点的下一个右侧节点
 *
 * @author zyd47
 * @date 2020-09-28 8:29
 */
public class Connect {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        if (root.left != null && root.right != null) {
            root.left.next = root.right;
        }
        if (root.left != null && root.right == null) {
            root.left.next  = getNext(root.next);
        }
        if (root.right != null) {
            root.right.next = getNext(root.next);
        }
        connect(root.right);
        connect(root.left);
        return root;
    }

    private Node getNext(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            return root.left;
        }
        if (root.right != null) {
            return root.right;
        }
        if (root.next != null) {
            return getNext(root.next);
        }
        return null;
    }
}
