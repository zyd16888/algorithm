package tencentsummary;

import java.util.Scanner;

/**
 * 描述:
 * 第一行一个整数N，代表怪兽的只数，第二行N个整数，代表武力值，第三行N个整数代表收买第N只怪兽所需的金币数
 * 输出一个整数，代表所需最小金币数
 *
 * @author dong
 * @create 2019-04-05 20:55
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arrd = new int[n];
        int[] arrp = new int[n];

        //money
        for (int i = 0; i < n; i++){
            arrd[i] = sc.nextInt();
        }
        //force
        for (int i = 0; i < n; i++){
            arrp[i] = sc.nextInt();
        }
        int money = arrp[0];
        int force = arrd[0];

        for (int i = 1; i < n; i++){
            if (arrd[i] > force){
               money = money + arrp[i];
               force = force + arrd[i];
            }else{

            }
        }

        System.out.println(money);
    }
}
