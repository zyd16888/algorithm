import java.util.Scanner;

public class DemoTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String all = sc.nextLine();
        String a[] = new String[10000];
        for (int i=0; i < 10; i++){
            a[i] = sc.next();
            if (a[i] == null){
                break;
            }
        }

        for (int i = 0; i < 10000; i++){
            if (a[i] != null){
                System.out.println(a[i]);
            }else {
                break;
            }

        }
    }
}
