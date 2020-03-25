package hard;

/**
 * 描述:
 * 42. 接雨水
 * 找到最高点，从两端分别遍历
 *
 * @author dong
 * @date 2020-03-19 18:51
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        if (height.length <= 1) {
            return 0;
        }
        int maxHeight = 0;
        int maxHeightIndex = 0;

        //找出最大值
        for (int i = 0; i < height.length; i++) {
            int h = height[i];
            if (h > maxHeight) {
                maxHeight = h;
                maxHeightIndex = i;
            }
        }
        int area = 0;
        int temp = height[0];
        for (int i = 0; i < maxHeightIndex; i++) {
            if (height[i] > temp) {
                temp = height[i];
            } else {
                area += (temp - height[i]);
            }
        }
        temp = height[height.length-1];
        for (int i = height.length-1; i > maxHeightIndex; i--) {
            if (height[i] > temp) {
                temp = height[i];
            } else {
                area += (temp - height[i]);
            }
        }
        return area;
    }
}
