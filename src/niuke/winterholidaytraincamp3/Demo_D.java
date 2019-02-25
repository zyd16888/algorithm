package niuke.winterholidaytraincamp3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 描述:
 * 处女座的训练
 * https://ac.nowcoder.com/acm/contest/329/D
 *
 * @author dong
 * @date 2019-01-26 14:00
 */
public class Demo_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, new Sort());               //按时间由小到大排序

        /*System.out.println("------------------");
        for (int i=0; i<n; i++){
            System.out.print(arr[i][0]+" ");
        }
        System.out.println();
        for (int i=0; i<n; i++){
            System.out.print(arr[i][1]+" ");
        }
        System.out.println();
        System.out.println("------------------");*/

        long fin = 0;
        for (int i=0; i<n; i++){        // 做题顺序
            long num = 0;
            for (int j = i+1; j<n; j++){    //计算单位疲劳时间
                num += arr[j][1];
            }
            fin += num * arr[i][0];
        }
        System.out.println(fin);

        long sum= 0,min=0;
        for (int i = 0; i < n; i++)
            sum+=arr[i][1];
        for (int i = 0; i < n; i++) {
            sum-=arr[i][1];
            min+=(sum*arr[i][0]);

        }
        System.out.println(min);


    }


}

class Sort implements Comparator<int[]>{

    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[0]*o2[1]-o1[1]*o2[0];
    }
}