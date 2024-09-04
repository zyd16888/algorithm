package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zyd
 * @date 2024/9/4
 *
 * 2860. 让所有学生保持开心的分组方法数
 *
 * https://leetcode.cn/problems/happy-students/description/
 */
public class HappyStudents {

    public int countWays(List<Integer> nums) {

        int n = nums.size();
        int res = 0;

        Collections.sort(nums);

        for (int k = 0; k <= n; k++) {
            if (k > 0 && nums.get(k - 1) >= k) {
                continue;
            }
            if (k < n && nums.get(k) <= k) {
                continue;
            }
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        HappyStudents test = new HappyStudents();
        List<Integer> nums = List.of(6,0,3,3,6,7,2,7);
        List<Integer> mutableNums = new ArrayList<>(nums);

        int res = test.countWays(mutableNums);

        System.out.println(res);
    }

}
