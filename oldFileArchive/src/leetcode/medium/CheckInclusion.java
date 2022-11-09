package medium;

/**
 * 描述：
 * 567. 字符串的排列
 *
 * @author zyd47
 * @date 2020-09-27 16:47
 */
public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() > s2.length()) {
            return false;
        }
        int[] num1 = new int[26];
        int[] num2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            num1[s1.charAt(i) - 'a']++;
            num2[s2.charAt(i) - 'a']++;
        }
        //差值数组
        int[] dif = new int[26];
        for (int z = 0; z < dif.length; z++) {
            dif[z] = num2[z] - num1[z];
        }
        for (int j = s1.length(); j < s2.length(); j++) {
            if (isSame(dif)) {
                return true;
            }
            dif[s2.charAt(j - s1.length()) - 'a']--;
            dif[s2.charAt(j) - 'a']++;
        }
        return isSame(dif);
    }
    //判断元素个数是否相同
    public boolean isSame(int[] dif) {
        for (int j : dif) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        CheckInclusion test = new CheckInclusion();
        boolean res = test.checkInclusion(s1, s2);
        System.out.println(res);
    }
}
