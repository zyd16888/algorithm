package zijietiaodong;

import java.util.Scanner;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-16 10:23
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++){
            str[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++){
            String fin = "" ;
            int num = 0;
            for (int j = 0; j < str[i].length(); j++){
                if (j == 0) {
                    fin += str[i].charAt(j);
                    num ++;
                }else {
                    if (str[i].charAt(j) == str[i].charAt(j-1) || num <= 2){
                        fin += str[i].charAt(j);
                        num ++;
                    }else if (str[i].charAt(j) != str[i].charAt(j-1)){
                        fin += str[i].charAt(j);
                        num = 1;
                    }
                }
            }
            System.out.println(fin);
        }
        sc.close();
    }
}
