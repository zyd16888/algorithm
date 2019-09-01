import java.util.Scanner;

/**
 * @author dong
 * @date 2019/09/01 11:05
 * TODO: 有序旋转数组寻找最小值
 */
public class orderedRotatArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(getMin(arr));

    }

    public static int getMin(int[] arr){
        int low = 0;
        int high = arr.length -1;
        int mid = 0;
        while (low < high){
            if (low == high -1){
                break;
            }
            if (arr[low] < arr[high]){
                return arr[low];
            }
            mid = (low + high) / 2;
            if (arr[low] > arr[mid]){
                high = mid;
                continue;
            }
            if (arr[mid] > arr[high]){
                low = mid;
                continue;
            }
            while (low < mid){
                if (arr[low] == arr[mid]){
                    low++;
                }else if (arr[low] < arr[mid]){
                    return arr[low];
                }else{
                    high = mid;
                    break;
                }
            }
        }
        return Math.min(arr[low], arr[high]);
    }
}
