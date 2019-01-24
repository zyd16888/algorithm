package niuke.winterholidaytraincamp2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述:
 * 处女座的期末复习
 * https://ac.nowcoder.com/acm/contest/327/J
 *
 * @author dong
 * @date 2019-01-24 14:22
 */
public class Demo_J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] revi = new long[n];
        long[] exam = new long[n];
        long allReviTime = 0,  allExamTime = 0;

        for (int i=0; i<n; i++){
            revi[i] = sc.nextLong();
            allReviTime += revi[i];
        }
        for (int i=0; i<n; i++){
            exam[i] = sc.nextLong();
        }
        Arrays.sort(exam);
        int l = exam.length;

        allExamTime = 2*l;

        if (exam[l-1]+2-allExamTime-allReviTime>=0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
