package Medium.P2401LongestNiceSubarray;

import java.util.Map;

public class Solution {

    public int longestNiceSubarray(int[] nums) {
        int counter = 1;
        int maxSubarray = 0;
        int left = 0;
        int usedBits = 0;

        for(int right = 0; right < nums.length; right++){
            while ((usedBits & nums[right]) != 0){
                usedBits ^= nums[left];
                left++;
            }

            usedBits |= nums[right];
            maxSubarray = Math.max(maxSubarray, right-left + 1);
        }

        return maxSubarray;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.longestNiceSubarray(new int[]{1, 3, 8}));
    }

}
