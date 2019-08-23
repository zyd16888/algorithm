package simulatedwrittenexamMar;

import java.util.Scanner;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-14 20:05
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            long k = sc.nextLong();
            if ((x+y) / 2 + 1 > k){
                System.out.println("-1");
                continue;
            }
            int l = (x + y) / 2 + 1;

            for (; l >= 0; l--){
                if (Math.abs((x+y)-l*2) == Math.abs(k-l)){
                    System.out.println(l);
                    break;
                }
            }

        }
    }
}
