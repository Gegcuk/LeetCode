package Easy.tasks1_100.P1TwoSum;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }


    public static void test(){
        int[] nums = new int[]{3,3};
        System.out.println(Arrays.toString(new Solution().twoSum(nums, 6)));
    }

    public static void main(String[] args) {
        test();
    }
}

