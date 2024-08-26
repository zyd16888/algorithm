package leetcode;

import java.util.*;

/**
 * @author zyd
 * @date 2024/8/26
 *
 * https://leetcode.cn/problems/n-ary-tree-postorder-traversal/
 *
 * 590. N 叉树的后序遍历
 */

class Node {
    public int val;  // 节点值
    public List<Node> children;  // 子节点list

    public Node() {}

    public Node(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class NAryTreePostorderTraversal{
    // 后序遍历函数
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    // 递归遍历函数
    private void traverse(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        for (Node child : node.children) {
            traverse(child, result);
        }

        result.add(node.val);
    }

    // 根据输入的层序遍历数组构造多叉树
    public Node buildTree(List<Integer> data) {
        if (data == null || data.isEmpty()) return null;

        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(data.get(0));
        queue.offer(root);
        int i = 2;

        while (!queue.isEmpty() && i < data.size()) {
            Node parent = queue.poll();
            List<Node> children = new ArrayList<>();
            while (i < data.size() && data.get(i) != null) {
                Node child = new Node(data.get(i));
                children.add(child);
                queue.offer(child);
                i++;
            }
            parent.children = children;
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        NAryTreePostorderTraversal test = new NAryTreePostorderTraversal();
        List<Integer> data = Arrays.asList(1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14);

        Node root = test.buildTree(data);
        List<Integer> res = test.postorder(root);
        System.out.println(res);
    }
}
