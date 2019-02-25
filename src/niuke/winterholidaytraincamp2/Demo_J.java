package niuke.winterholidaytraincamp2;


import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.Arrays;
import java.util.Comparator;
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
        int[][] arr1 = new int[n][2];
        for (int i = 0; i<n; i++){
            arr1[i][0] = sc.nextInt();
        }
        for (int i = 0; i<n; i++){
            arr1[i][1] = sc.nextInt();
        }
        Arrays.sort(arr1, new MySort()); //按照MySort类中compare方法的返回值进行排序
        for (int i=0; i<n; i++){
            System.out.print(arr1[i][0]+"  ");
        }
        System.out.println(" ");
        for (int i=0; i<n; i++){
            System.out.print(arr1[i][1]+"  ");
        }
        System.out.println(" ");

        int time = 0;
        int f = 0;
        for (int i = 0; i < n; i++){
            time += arr1[i][0];
            if (time > arr1[i][1]){
                System.out.println("NO");
                f = 1;
                break;
            }
        }
        if (f == 0){
            System.out.println("YES");
        }


    }
}

class MySort implements Comparator<int[]>{

    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[1] - o2[1];
    }
}
