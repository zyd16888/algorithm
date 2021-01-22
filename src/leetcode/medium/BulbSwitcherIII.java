package medium;

/**
 * 描述:
 * 1375. 灯泡开关III
 *
 * @author dong
 * @date 2020-03-18 10:51
 */
public class BulbSwitcherIII {
    public int numTimesAllBlue(int[] light) {
        int m = 1, cnt = 0;
        for (int i = 0; i < light.length; i++){
            m = Math.max(m, light[i]);
            if (m == i + 1) {
                cnt ++;
            }
        }
        return cnt;
    }
}
