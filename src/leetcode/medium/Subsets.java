package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 78. 子集
 * https://leetcode-cn.com/problems/subsets/
 *
 * @author dong
 * @date 2020-0-21 9:18
 */

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            int all = res.size();
            for (int j = 0; j < all; j++) {
                List<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(num);
                res.add(tmp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Subsets test = new Subsets();
        int[] nums = {1, 2, 3};
        List<List<Integer>> res = test.subsets(nums);
        for (List<Integer> a: res
             ) {
            System.out.println(a);
        }
    }

}
