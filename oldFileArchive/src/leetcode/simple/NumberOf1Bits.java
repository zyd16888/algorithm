package leetcode.simple;

/**
 * 描述：
 * 191. 位1的个数
 *
 * @author dong
 * @date 2021-03-22  18:06
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        System.out.println(n);
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1Bits test = new NumberOf1Bits();
        int n = 00000000001011;
        System.out.println(test.hammingWeight(n));
    }
}
