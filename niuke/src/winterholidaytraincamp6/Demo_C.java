package winterholidaytraincamp6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 描述:
 * 项链
 * https://ac.nowcoder.com/acm/contest/332/C
 *
 * @author dong
 * @date 2019-02-02 13:50
 */
public class Demo_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        for (int i=0; i<m; i++)
            arr[i][0] = sc.nextInt();
        for (int i=0; i<m; i++)
            arr[i][1] = sc.nextInt();

        Arrays.sort(arr,new Sort());

        /*System.out.println("------------------");
        for (int i=0; i<m; i++)
            System.out.print(arr[i][0]+" ");
        System.out.println();
        for (int i=0; i<m; i++)
            System.out.print(arr[i][1]+" ");
        System.out.println();
        System.out.println("------------------");*/
        long fin = 0;

        for (int i=0; i<m; i++){
            while (n > 0 && arr[i][0]>0){
                fin += arr[i][1];
                n --;
                arr[i][0] --;
            }
        }

        System.out.println(fin);

    }
}

/*
class Sort implements Comparator<int[]>{
    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[0]*o2[1]-o1[1]*o2[0];
    }
}*/
class Sort implements Comparator<int[]>{

    @Override
    public int compare(int[] o1, int[] o2) {
        if(o2[1] == o1[1]){
            return o1[0] - o2[0];
        }
        return o2[1] - o1[1];
    }
}