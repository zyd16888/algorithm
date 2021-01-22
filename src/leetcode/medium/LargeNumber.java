package medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 描述:
 * 179.最大数
 * 输入: [3,30,34,5,9]
 * 输出: 9534330
 *
 * @author dong
 * @date 2020-03-08 8:49
 */
public class LargeNumber {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];

        for (int i = 0; i < nums.length; i++){
            str[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(str, new Sort());

        if (str[0].equals("0")){
            return "0";
        }

        String finStr = new String();
        for(String s : str){
            finStr += s;
        }

        return finStr;

    }

    private class Sort implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            String str1 = o1 + o2;
            String str2 = o2 + o1;
            return str2.compareTo(str1);
        }
    }
}
