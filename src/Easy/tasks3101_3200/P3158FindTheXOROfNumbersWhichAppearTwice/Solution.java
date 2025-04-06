package Easy.tasks3101_3200.P3158FindTheXOROfNumbersWhichAppearTwice;

import java.util.Arrays;

public class Solution {

    public int duplicateNumbersXOR(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1])
                result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }

}
