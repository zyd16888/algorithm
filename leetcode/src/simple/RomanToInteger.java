package simple;

/**
 * 描述:
 * 13. 罗马数字转整数
 *
 * @author dong
 * @date 2020-03-19 15:21
 */
public class RomanToInteger {
    public int romanToInt(String s){
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            switch (s.charAt(i))
            {
                case 'I' : res = res + 1;break;
                case 'V' : res = res + 5;break;
                case 'X' : res = res + 10;break;
                case 'L' : res = res + 50;break;
                case 'C' : res = res + 100;break;
                case 'D' : res = res + 500;break;
                case 'M' : res = res + 1000;break;
                default:
                    System.out.println("default");break;
            }
            if (i != 0) {
                if ((s.charAt(i) == 'V' || s.charAt(i) == 'X') && s.charAt(i-1) == 'I'){
                    res = res - 2;
                }
                if ((s.charAt(i) == 'L' || s.charAt(i) == 'C') && s.charAt(i-1) == 'X'){
                    res = res - 20;
                }
                if ((s.charAt(i) == 'D' || s.charAt(i) == 'M') && s.charAt(i-1) == 'C'){
                    res = res - 200;
                }
            }
        }
        return res;
    }
}
