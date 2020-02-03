import java.util.Scanner;

public class  SongList{
    static int mod = 1000000007;
    static long[][] arr = new long[105][105];
    public static void main(String[] args) {
        long ans = 0;
        initt();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        for(int i = 0; i <= x; i++){
            if(i*a <= k && (k-a*i)%b ==0 && (k-a*i)/b <= y){
                ans=(ans + (arr[x][i] * arr[y][(k - a * i) / b]) % mod) % mod;
            }
        }
    }

    public static void initt(){
        //arr[0][0] = 1;
        for(int i = 0; i < 100; i++){
            arr[i][0] = 1;
            for(int j = 0; j < 100; j++){
                arr[i][j] = (arr[i-1][j-1] + arr[i-1][j]) % mod;
            }
        }
    }
}