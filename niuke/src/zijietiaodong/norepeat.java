package zijietiaodong;

import java.util.Scanner;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-16 10:49
 */
public class norepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] chars  = null;
        for (int i = 0; i < n; i++) {
            chars[i] = sc.nextLine().toCharArray();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            if(chars[i].length > 2){

                for (int j = 0; j < chars[i].length - 2; j++) {
                    if (chars[i][j] == chars[i][j+1]) {
                        if (chars[i][j+2] == chars[i][j]) {
                            for (int k = j+1; k < chars[i].length; k++) {
                                chars[i][k] = chars[i][k+1];
                            }
                        }else if(chars[i].length > 3){
                            if(chars[i][j+2] == chars[i][j+3]){
                                for (int k = j+2; k < chars[i].length; k++) {
                                    chars[i][k+2] = chars[i][k+3];
                                }
                            }
                        }

                    }
                }

            }
            System.out.println(chars[i]);
        }

    }
}
