import java.util.Scanner;

/**
 * @author dong
 * @date 2019/09/01 11:05
 * TODO: 有序旋转数组
 */
public class orderedRotatArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isContains(arr, num) ? "Yes" : "No");
        //System.out.println(getMin(arr));

    }

    /**
     *  TODO: 有序旋转数组寻找最小值
     * @param arr
     * @return
     */
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

    /**
     * TODO: 在有序旋转数组中寻找一个数
     * @param arr
     * @param num
     * @return
     */
    public static boolean isContains(int[] arr, int num){
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high){
            mid = (low + high) / 2;
            if (arr[mid] == num){
                return true;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]){
                while (low != mid && arr[low] == arr[mid]){
                    low ++;
                }
                if (low == mid){
                    low = mid + 1;
                    continue;
                }
            }
            if (arr[low] != arr[mid]){
                if (arr[mid] > arr[low]){
                    if (num >= arr[low] && num < arr[mid]){
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    if (num > arr[mid] && num <= arr[high]){
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            } else {
                if (arr[mid] < arr[high]){
                    if (num > arr[mid] && num <= arr[high]){
                        low  = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                } else {
                    if (num >= arr[mid] && num < arr[mid]){
                        high = mid - 1;
                    } else {
                        low  = mid + 1;
                    }
                }
            }
        }
        return false;
    }
}
