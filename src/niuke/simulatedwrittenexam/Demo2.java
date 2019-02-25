package niuke.simulatedwrittenexam;

import java.util.Scanner;

/**
 * 最近天气太热了，牛牛每天都要吃雪糕。雪糕有一盒一份、一盒两份、一盒三份这三种包装，
 * 牛牛一天可以吃多盒雪糕，但是只能吃六份，吃多了就会肚子疼，吃少了就会中暑。
 * 而且贪吃的牛牛一旦打开一盒雪糕，就一定会把它吃完。请问牛牛能健康地度过这段高温期么？
 *
 */

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            int day = sc.nextInt();
            int one = sc.nextInt();
            int two = sc.nextInt();
            int shree = sc.nextInt();

            int done = one/6;
            int dtwo = two/3;
            int dshree = shree/2;

            int fday = done + dtwo + dshree;

            if (fday>=day){
                System.out.println("Yes");
            }else {
                int yone = one%6;
                int ytwo = two%3;
                int yshree = shree%2;
                if (yshree == 0){
                    if ((ytwo*2 + yone) >= 6 && (fday+1) >= day) {
                        System.out.println("Yes");
                    }else { System.out.println("No"); }
                } else if ((yshree*3 + yone) >=6 && (fday+1) >= day){
                    System.out.println("Yes");
                }else if (yone >= 1 && ytwo >=1 && yshree ==1){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }

        }
    }
}
