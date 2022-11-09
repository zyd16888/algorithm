package leetcode.simple;


/**
 * 描述：
 * 1672. 最富有客户的资产总量
 *
 * @author dong
 * 2021-03-11 10:29
 */
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int i = 0; i < accounts.length; i++){
            int nums = 0;
            for (int j = 0; j < accounts[0].length; j++){
                nums += accounts[i][j];
            }
            res = Math.max(nums, res);
        }
        return res;
    }

    public static void main(String[] args) {
        RichestCustomerWealth test = new RichestCustomerWealth();
        int[][] accounts = {
                {1,2,3},
                {2,8,7},
                {1,9,5}
        };
        int res = test.maximumWealth(accounts);
        System.out.println(res);
    }
}
