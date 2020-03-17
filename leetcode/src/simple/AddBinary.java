package simple;

/**
 * 描述:
 * 67. 二进制求和
 *
 * @author dong
 * @date 2020-03-16 8:59
 */
public class AddBinary {
    public String addBinary(String a, String b){
        if (a == null || a.length() == 0){return b;}
        if (b == null || b.length() == 0){return a;}

        StringBuffer res = new StringBuffer();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int c = 0;
        while (i >= 0 || j >= 0){
            if (i >= 0){
                c += a.charAt(i--) - '0';
            }
            if (j >= 0){
                c += b.charAt(j--) - '0';
            }
            //如果二者都为 1  那么 c%2 应该刚好为0 否则为1
            res.append(c % 2);
            //如果二者都为 1  那么 c 应该刚好为1 否则为0
            c >>= 1;
        }
        String fin = res.reverse().toString();
        String s = '1' + fin;
        return c > 0 ? s : fin;
    }
}
