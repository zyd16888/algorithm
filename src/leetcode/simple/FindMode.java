package leetcode.simple;

import java.util.ArrayList;
import leetcode.util.TreeNode;

/**
 * 描述：
 * 501. 二叉搜索树中的众数
 *
 * @author zyd47
 * @date 2020-09-24 8:42
 */
public class FindMode {
    int pre = 0, cur = 0, max = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    public int[] findMode(TreeNode root) {
        traversal(root);
        int size = list.size();
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    private void traversal(TreeNode root) {
        if (root != null) {
            traversal(root.left);

            if (pre == root.val) {
                cur++;
            } else {
                pre = root.val;
                cur = 1;
            }

            if (cur == max) {
                list.add(root.val);
            } else if (cur > max) {
                list.clear();
                list.add(root.val);
                max = cur;
            }
            traversal(root.right);
        }
    }
}
