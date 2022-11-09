package leetcode.medium;

/**
 * 描述:
 * 503. 下一个更大元素 II
 *
 * @author dong
 * @date 2021-03-06 08:51
 */
public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums){
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i + 1; ; j++) {
                if (j == nums.length){
                    j = 0;
                }
                if (nums[j] > num){
                    arr[i] = nums[j];
                    break;
                }
                if (j == i) {
                    arr[i] = -1;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        NextGreaterElementII test = new NextGreaterElementII();
        System.out.println("start");
        int[] nums = {1, 2, 1};
        int[] res = test.nextGreaterElements(nums);
        for (int a : res){
            System.out.println(a);
        }
    }

}
