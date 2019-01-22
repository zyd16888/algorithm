package niuke.winterholidaytraincamp1;

import java.util.Scanner;

/**
 * 描述:
 * 小a的计算器
 *
 * @author dong
 * @date 2019-01-22 14:29
 */
public class smallACalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fin = sc.nextLong();
        //long start = 0;
        int[] num = new int[n*2];
        for (int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }

        /*System.out.println("-------------");
        for (int aa : num) {
            System.out.println(aa);
        }*/
        for (int i = num.length-1; i>=0; i--){
            if (num[i-1] == 1){
                fin = fin - num[i];
            }else if (num[i-1] == 2){
                fin = fin + num[i];
            }else if (num[i-1] == 3){
                fin = fin/num[i];
            }else if (num[i-1] == 4){
                fin = fin*num[i];
            }
            /*System.out.println("---------");
            System.out.print(num[i]+"   ");
            System.out.println(num[i-1]);*/
            i--;
        }

        System.out.println(fin);

    }

}
