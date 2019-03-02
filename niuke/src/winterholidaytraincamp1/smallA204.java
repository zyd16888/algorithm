package winterholidaytraincamp1;

import java.util.Scanner;

/**
 * 描述:
 * 小a与204
 *
 * @author dong
 * @date 2019-01-23 9:32
 */
public class smallA204 {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int two = 0;
        int zero = 0;
        int four = 0;
        int rt = 0;
        int last = 0;
        for(int i = 1; i <= n; i++){
            int input = sc.nextInt();
            switch(input){
                case 0:zero++;break;
                case 2:two++;break;
                case 4:four++;break;
                default:break;
            }
        }
        for(int t = 1; t <= n; t++){
            if(t % 2 == 0){
                // 偶数先取小
                if(zero > 0){
                    rt += (0 - last) * (0 - last);
                    last = 0;
                    zero--;
                }else if(two > 0){
                    rt += (2 - last) * (2 - last);
                    last = 2;
                    two--;
                }else if(four > 0){
                    rt += (4 - last) * (4 - last);
                    last = 4;
                    four--;
                }else{
                    continue;
                }
            }else{
                // 奇数先取大
                if(four > 0){
                    rt += (4 - last) * (4 - last);
                    last = 4;
                    four--;
                }else if(two > 0){
                    rt += (2 - last) * (2 - last);
                    last = 2;
                    two--;
                }else if(zero > 0){
                    rt += (0 - last) * (0 - last);
                    last = 0;
                    zero--;
                }else{
                    continue;
                }
            }
        }
        System.out.println(rt);
        sc.close();



    }
}
