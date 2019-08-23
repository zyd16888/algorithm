package winterholidaytraincamp1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 描述:
 * 小a与黄金街道
 *
 * @author dong
 * @date 2019-01-23 10:57
 */
public class smallAGoldenStreet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong() ;
        BigInteger k = sc.nextBigInteger() , a =  sc.nextBigInteger() , b  =  sc.nextBigInteger() , c = new BigInteger("1000000007");
        sc.close();
        long euler = getEuler(n);
        BigInteger x = BigInteger.valueOf(euler).multiply(BigInteger.valueOf(n)).divide(new BigInteger("2"));
        a = a.add(b);
        a = (a.mod(c)).multiply(k.modPow(x, c).mod(c));
        System.out.println(a.mod(c));
    }

    public static long getEuler(long x) {
        long tmp = x;
        for(int i = 2 ; i * i <= x ; i++){
            if(x % i == 0){
                tmp = tmp/i*(i-1);
                while(x % i == 0) x /= i;
            }
        }
        if(x > 1) tmp = tmp/x*(x-1);
        return tmp;
    }
}
