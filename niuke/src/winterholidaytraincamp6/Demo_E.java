package winterholidaytraincamp6;

import java.util.Scanner;

/**
 * 描述:
 * 海啸
 * https://ac.nowcoder.com/acm/contest/332/E
 *
 * @author dong
 * @date 2019-02-02 15:17
 */
public class Demo_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long arr[][] = new long[n][m];
        long d = sc.nextLong();
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                arr[i][j] = sc.nextLong();
            }
        }
        int q = sc.nextInt();

        for (int i=0; i<q; i++){
            long num = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j=b-1; j<m; j++) {
                if (arr[a-1][j] >= d)
                    num += 1;
            }
            for (int j=0; j<y; j++) {
                if (arr[x-1][j] >= d)
                    num += 1;
            }
            if ((x-a-1)>0) {
                for (int k = a; k < x-1; k++)
                    for (int j = 0; j < m; j++)
                        if (arr[k][j] >= d)
                            num += 1;
            }
            System.out.println(num);
        }
    }
}
