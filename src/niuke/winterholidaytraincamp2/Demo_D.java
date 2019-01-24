package niuke.winterholidaytraincamp2;

import java.util.Scanner;

/**
 * 描述:
 * 处女座与重修费
 * https://ac.nowcoder.com/acm/contest/327/D
 *
 * @author dong
 * @date 2019-01-24 13:56
 */
public class Demo_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stu = new int[n];
        int notpass = 0;

        for (int i = 0; i<n; i++){
            stu[i] = sc.nextInt();
            if (stu[i]<60){
                notpass++;
            }
        }

        int repairCosts = notpass * 400;
        System.out.println(repairCosts);

    }
}
