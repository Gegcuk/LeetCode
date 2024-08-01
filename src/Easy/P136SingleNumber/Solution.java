package Easy.P136SingleNumber;

public class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++)
            res ^= nums[i];
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println("Single number in [2, 2, 1]: " + solution.singleNumber(nums1)); // Output should be 1
        System.out.println("Single number in [4, 1, 2, 1, 2]: " + solution.singleNumber(nums2)); // Output should be 4
        System.out.println("Single number in [1]: " + solution.singleNumber(nums3)); // Output should be 1
    }
}
