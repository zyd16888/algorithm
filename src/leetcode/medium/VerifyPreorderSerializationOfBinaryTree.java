package leetcode.medium;

/**
 * 描述：
 * 331. 验证二叉树的前序序列化
 *
 */
public class VerifyPreorderSerializationOfBinaryTree {
    public boolean isValidSerialization(String preorder) {
        //记录叶子节点 和 总结点数量
        int leafCount = 0, nodeCount = 1;
        for (char ch: preorder.toCharArray()) {
            // 在树的先序遍历过程中 (在最后一个节点前) 叶子节点最多和非叶子节点相等
            // 如果叶子节点超过了非叶子 说明至少有一个叶子节点#上接了其他节点
            if (leafCount > nodeCount - leafCount) {
                return false;
            }
            if (ch == ',') nodeCount++;
            if (ch == '#') leafCount++;
        }
        return (nodeCount - leafCount) + 1 == leafCount;
    }
}
