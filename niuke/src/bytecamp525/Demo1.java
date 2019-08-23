package bytecamp525;

import java.util.*;

/**
 * N个景点，第i个景点的评分为a[i],两个景点i，j间的距离为j-i(j>i),一天两个景点
 * 总评分：a[i]+a[j]+i-j
 *
 * 输入：5  / 11 6 5 18 12
 * 输出 ：29
 *
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int j = 1;
        for (int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = j;
            j++;
        }

        for (int[] a :
                arr) {
            System.out.print(a[0] + "," + a[1] + "    ");

        }
        System.out.println();
        System.out.println("------");
        Arrays.sort(arr, new Sort());

        for (int[] a :
                arr) {
            System.out.print(a[0] + "," + a[1] + "    ");

        }
        System.out.println();
        System.out.println("------");
        int score = 0;
        int len = 0;
        int fin = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            for (int k = i+1; k < n; k++ ){
                score = arr[i][0] + arr[k][0];
                len = Math.abs(arr[i][1] - arr[k][1]);
                fin = score - len;
                arrayList.add(fin);
            }
        }
        int Max = Collections.max(arrayList);
        System.out.println(Max);

        int max = arr[0][0] + arr[1][0] - Math.abs(arr[0][1]-arr[1][1]);
        System.out.println(max);

    }
}

class Sort implements Comparator<int[]>{

    @Override
    public int compare(int[] o1, int[] o2) {
        return o2[0]-o1[0];
    }
}