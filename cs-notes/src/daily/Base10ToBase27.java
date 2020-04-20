package daily;

/**
 * 描述:
 * 10进制转27进制
 *
 * @author dong
 * @date 2020-04-20 16:26
 */
public class Base10ToBase27 {
    private String conversion(int num) {
        //存放结果的字符串
        String res = "";
        // 大于27的时候，需要考虑余数问题
        if (num >= 27) {
            //将整除的倍数转成字符串，直接放入结果
            res += Integer.toString(num/27);
            //求余数
            int rem = num % 27;
            //余数为0时，不需要处理，直接返回结果
            if (rem == 0) { return res; }
            //余数小于10时，也不需要处理，转成字符串加上去，直接返回结果
            if (rem < 10) {
                res += Integer.toString(rem);
            } else {
                //余数减去 10 ，加上 97（a的ascii码） 然后强转成char，放在最后
                res += (char)(rem-10+65);
            }
        } else {
            if (num < 10) {
                res += Integer.toString(num);
            } else {
                res += (char)(num-10+65);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Base10ToBase27 test = new Base10ToBase27();
        String res = test.conversion(38);
        System.out.println(res);
    }
}
