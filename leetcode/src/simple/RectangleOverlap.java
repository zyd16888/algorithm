package simple;

/**
 * 描述:
 * 836. 矩形重叠
 * 将重叠的情况去掉，剩下的都是不重叠的
 *
 * @author dong
 * @date 2020-03-18 10:24
 */
public class RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1[0] >= rec2[2] || rec2[0] >= rec1[2]){
            return false;
        }
        if (rec1[1] >= rec2[3] || rec2[1] >= rec1[3]){
            return false;
        }
        return true;

    }
}
