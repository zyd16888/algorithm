package simple;

/**
 * 描述：
 * 202. 快乐数
 *
 * @author zyd47
 * @date 2020-10-09 9:37
 */
public class IsHappy {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do{
            slow = squareSum(slow);
            fast = squareSum(fast);
            fast = squareSum(fast);
        } while (slow != fast);
        if (fast == 1){
            return true;
        } else  {
            return false;
        }
    }

    private int squareSum(int m) {
        int squareSum = 0;
        while (m != 0) {
            squareSum += (m % 10) * (m % 10);
            m /= 10;
        }
        return squareSum;
    }
}
