package leetcode.util;

public class TreeNode {
    public TreeNode left;
    public int val;
    public TreeNode right;
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
