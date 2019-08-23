package winterholidaytraincamp1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述:
 * 小a与"204"
 *
 * @author dong
 * @date 2019-01-22 15:11
 */
public class aAnd204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n + 1];
        int c0 = 0, c2 = 0, c4 = 0;
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int sum=0,x=n,m=0;
        boolean f=true;
        for(int i=0;i<n;i++){
            sum+=(nums[m]-nums[x])*(nums[m]-nums[x]);
            if(f)
                m++;
            else
                x--;
            f=!f;
        }
        System.out.println(sum);
    }
}
