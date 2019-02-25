package niuke.winterholidaytraincamp1;

import java.util.Scanner;

/**
 * 描述:
 * 小a与星际探索
 *
 * @author dong
 * @date 2019-01-23 9:47
 */
public class smallAInterstellarExploration {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int begin=kb.nextInt();
        for(int i=0;i<n-2;i++) {
            a[i]=kb.nextInt();
        }
        int end=kb.nextInt();
        if(begin<=end) {
            System.out.println(-1);
            kb.close();
            return;
        }
        int l=0;
        int ans=begin^end;
        for(int i=0;i<n-2;i++) {
            if(a[i]<begin&&a[i]>end) {
                b[l]=a[i];
                l++;
            }
        }
        //更新值
        for(int i=0;i<l;i++) {
            b[i]^=ans;
        }
        for(int i=14;i>=0;i--) {
            for(int j=0;j<l;j++) {
                if(((b[j]>>i)&1)==1) {
                    if(((ans>>i)&1)==0) {
                        ans^=b[j];
                    }
                    for(int k=0;k<n;k++) {
                        if(((b[k]>>i)&1)==1&&k!=j) {
                            b[k]^=b[j];
                        }
                    }
                    b[j]=0;
                    break;
                }
            }
        }
        System.out.println(ans);
        kb.close();
    }
}
