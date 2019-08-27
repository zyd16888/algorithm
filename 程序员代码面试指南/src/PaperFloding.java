import java.util.Scanner;

/**
 * @author dong
 * @date 2019/08/23 17:40
 * TODO: 折纸问题，计算折痕方向
 */
public class PaperFloding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAllFolds(n);
    }

    /**
     * TODO:打印的所有折痕方向
     * @param n
     */
    static void printAllFolds(int n){
        // 根节点的是down
        printProcess(1, n, true);
    }

    static void printProcess(int i, int n, boolean down){
        //终止条件(相当于结点为null)
        if (i > n){
            return;
        }
        //右节点
        printProcess(i+1, n, true);
        System.out.println(down ? "down" : "up");
        //左节点
        printProcess(i+1, n, false);
    }

}
