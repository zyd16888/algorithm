/**
 * 描述:
 * 7.整数反转
 *
 * @author dong
 * @date 2020-03-12 11:02
 */
public class ReverseInteger {
    public int reverse(int x){
        String xString = Integer.toString(x);
        String str = xString;
        int flag = 1;
        if (x < 0){
            flag = -1;
            str = xString.substring(1);
        }
        try {
            return Integer.valueOf((new StringBuffer(str)).reverse().toString()) * flag;
        }catch (Exception e){
            return 0;
        }

    }
}
