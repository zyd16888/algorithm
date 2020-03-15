package simple;

/**
 * 描述:
 * 121.买卖股票的最佳时机
 *
 * @author dong
 * @date 2020-03-10 10:01
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1){
            return 0;
        }
        int min = prices[0], max = 0;
        for (int i = 1; i < prices.length; i++){
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}
