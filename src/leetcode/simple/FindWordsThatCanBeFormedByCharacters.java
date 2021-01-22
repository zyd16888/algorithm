package simple;

import java.util.HashSet;

/**
 * 描述:
 * 1160. 拼写单词
 *
 * @author dong
 * @date 2020-03-17 8:40
 */
public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int[] hash = new int[26];
        for (char i : chars.toCharArray()){
            hash[i - 'a']++;
        }
        int res = 0;
        for (String s : words){
            int[] str = new int[26];
            boolean flag = true;
            for (int i = 0; i < s.length(); i++){
                str[s.charAt(i) - 'a']++;
                if (str[s.charAt(i) - 'a'] > hash[s.charAt(i) - 'a']){
                    flag = false;
                }
            }
            if (flag) {
                res += s.length();
            }

        }
        return res;
    }
}
