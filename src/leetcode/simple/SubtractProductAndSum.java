package leetcode.simple;


/**
 * 描述：
 * 1281. 整数的各位积和之差
 *
 * @author dong
 * @date 2021-03-23 14:25
 */
public class SubtractProductAndSum {
    public int subtractProductAndSum(int n){

        String str = Integer.toString(n);

        char[] chars = str.toCharArray();

        int b1 = chars[0] - '0', b2 = chars[0] - '0';

        for (int i = 1; i < chars.length; i++) {
            int aa = chars[i] - '0';
            b1 *= aa;
            b2 += aa;
        }

        int res = b1 - b2;

        return res;
    }
    public int subtractProductAndSum2(int n) {
        int muti = 1;
        int sum = 0;
        while (n != 0) {
            muti *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return muti - sum;
    }

    public static void main(String[] args) {
        int n = 234;
        SubtractProductAndSum test = new SubtractProductAndSum();
        System.out.println(test.subtractProductAndSum(n));
    }
}
