package daily;

import java.util.Scanner;

/**
 * 描述:
 * 字符串排序
 * 将字符串转为char类型，然后进行冒泡排序
 *
 * @author dong
 * @date 2020-03-07 19:39
 */
public class StrSortByBubbling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        char temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (char a :
                arr) {
            System.out.print(a);
        }

    }
}
