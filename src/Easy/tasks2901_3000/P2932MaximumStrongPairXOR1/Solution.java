package Easy.tasks2901_3000.P2932MaximumStrongPairXOR1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int result = 0;
        int right;
        for(int  i = 0; i < nums.length; i++){
            right = i;
            while(right < nums.length){
                if(Math.abs(nums[i] - nums[right]) <= Math.min(nums[i], nums[right])){
                    result = Math.max(result, nums[i]^nums[right]);
                }
                right++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumStrongPairXor(new int[]{1,2,3,4,5}));
    }
}
