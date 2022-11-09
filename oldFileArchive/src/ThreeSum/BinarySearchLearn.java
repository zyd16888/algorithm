package ThreeSum;

import java.util.Arrays;

/**
 * 描述:
 *
 * @author dong
 * @date 2018-12-10 23:05
 */
public class BinarySearchLearn {


    public static void main(String[] args) {
        int[] arr= new int[]{-7,-9,0,5,6,7,1,3,2,-2,-6};
        //int[] arr = new int[]{1,3,4,5,8,9};
        Arrays.sort(arr);

        for (int asd: arr){
            System.out.print(asd+"  ");
        }
        System.out.println();
        System.out.println("------------------");
        int index1 = Arrays.binarySearch(arr,6);
        //System.out.println("arr[9]"+arr[9]);
        int index2 = Arrays.binarySearch(arr,4);
        int index3 = Arrays.binarySearch(arr,0);
        int index4 = Arrays.binarySearch(arr,18);

        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);

        System.out.println("-------------------");
        for (int asd: arr){
            System.out.print(asd+"  ");
        }


    }

}
