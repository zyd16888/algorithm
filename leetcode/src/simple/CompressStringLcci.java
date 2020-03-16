package simple;

/**
 * 描述:
 * 01.06. 字符串压缩
 *
 * @author dong
 * @date 2020-03-16 7:30
 */
public class CompressStringLcci {
    public String compressString(String S){
        if (S.length() == 0){
            return S;
        }
        char[] chars = S.toCharArray();
        char a = chars[0];
        int count = 0;
        String res = String.valueOf(chars[0]);
        for (int i = 0; i < S.length(); i++){
            if (chars[i] == a){
                count ++;
            }else {
                a = chars[i];
                res += String.valueOf(count);
                count = 0;
                res += a;
            }
        }
        res += String.valueOf(count);

        return res.length() < S.length() ? res : S;
    }
}
