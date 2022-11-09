package leetcode.medium;

/**
 * 描述:
 * 1769. 移动所有球到每个盒子所需的最小操作数
 *
 * @author dong
 * @date 2021-03-06 11:21
 */
public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        char[] chars = boxes.toCharArray();
        int[] res = new int[chars.length];
        /*for (char a : chars){
            System.out.println(a);
        }*/
        for (int i = 0; i < chars.length; i++) {
            int num = 0;
            for (int j = 0; j < chars.length; j++) {
                if (j == i) {
                    continue;
                }else {
                    if (chars[j] == '1') {
                        num += Math.abs(j - i);
                    }
                }
            }
            res[i] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        MinimumNumberOfOperationsToMoveAllBallsToEachBox test = new MinimumNumberOfOperationsToMoveAllBallsToEachBox();
        String boxes = "001011";
        int[] res = test.minOperations(boxes);
        for(int a : res) {
            System.out.println(a);
        }
    }
}
