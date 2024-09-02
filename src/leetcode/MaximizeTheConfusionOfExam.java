package leetcode;

/**
 * @author zyd
 * @date 2024/9/2
 *
 * 2024. 考试的最大困扰度
 * https://leetcode.cn/problems/maximize-the-confusion-of-an-exam/description/
 *
 * 双指针
 */
public class MaximizeTheConfusionOfExam {
    public int maxConsecutiveAnswers(String answerKey, int k) {

        int res = Math.max(maxConsecutiveChar(answerKey, k, 'T'), maxConsecutiveChar(answerKey, k, 'F'));
        return res;
    }

    /**
     * 计算在给定字符串 answerKey 中，最长的由字符 ch 组成的连续子串，
     * 允许最多修改 k 个非 ch 字符以达到最大连续长度。
     *
     * @param answerKey  包含 'T' 和 'F' 字符的字符串。
     * @param k          允许修改的字符数（即可以将最多 k 个非 ch 字符替换为 ch）。
     * @param ch         目标字符，寻找由该字符组成的最长连续子串。
     * @return           最长的由 ch 组成的连续子串的长度，允许最多 k 个字符替换。
     */
    public int maxConsecutiveChar(String answerKey, int k, char ch) {
        int n = answerKey.length();
        int left = 0, right = 0;
        int res = 0;
        while (right < n) {
            if (answerKey.charAt(right) == ch) {
                k--;
            }
            while (k < 0) {
                if (answerKey.charAt(left) == ch) {
                    k++;
                }
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }


    public static void main(String[] args) {

        MaximizeTheConfusionOfExam maximizeTheConfusionOfExam = new MaximizeTheConfusionOfExam();

        int res = maximizeTheConfusionOfExam.maxConsecutiveAnswers("TFFT", 1);
        System.out.println(res);
    }
}
