package leetcode.medium;

/**
 * 描述:
 * 1689. 十-二进制数的最少数目
 *
 * @author dong
 * @date 2021-03-06 14:21
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    private int minPartitions(String n) {
        char[] chars = n.toCharArray();
        int res = 0;
        for (char a : chars) {
            if ((char)a-48 > res){
                res = (char)a-48;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers test = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        String n = "27346209830709182346";
        int res = test.minPartitions(n);
        System.out.println(res);
    }
}
