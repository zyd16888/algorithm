package ThreeSum;

/**
 * 描述:
 * 共执行的次数为 N(N-1)(N-2) = N3/6-N2/2+N/3
 * 因此它的近似执行次数为 ~N3/6，增长数量级为 O(N3)
 *
 * @author dong
 * @date 2018-12-10 22:02
 */
public class ThreeSumSlow implements ThreeSum{
    @Override
    public int count(int[] nums) {
        int N = nums.length;
        int cnn = 0;

        for (int i=0; i<N; i++){
            for (int j=i+1; j<N; j++){
                for (int k=j+1; k<N; k++){
                    if (nums[i]+nums[j]+nums[k] == 0){
                        cnn++;
                    }
                }
            }
        }
        return cnn;
    }
}
