package medium;

/**
 * 描述:
 * 365.水壶问题
 *
 * @author dong
 * @date 2020-03-21 12:04
 */
public class WaterAndJugProblem {
    public boolean canMeasureWater(int x, int y, int z) {
        int min = Math.min(x, y);
        while (min >= 0) {
            if (z == 0) {
                return true;
            }
            if (x + y < z){
                return false;
            }
            if (min == 0){
                return false;
            }
            if (x % min == 0 && y % min == 0) {
                break;
            }
            else {
                min--;
            }
        }
        if (z % min == 0) {
            return true;
        } else {
            return false;
        }
    }
}
