package simulatedwrittenexam;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long f = sc.nextLong();
        long d = sc.nextLong();
        long p = sc.nextLong();
        int t = 0;
        if (x>d){
            System.out.println("0");
        }else {
            long all = x*t + (t-f)*p ;
            while (all<d){
                t++;
                all = x*t + (t-f)*p ;
            }
        }

        System.out.println(t-1);

    }
}
