package Medium.tasks101_200.P163SumClosest;

import java.util.Arrays;


public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int current_sum = Integer.MAX_VALUE/2;
        for(int i = 0; i < nums.length-2; i++){
            int left = i + 1, right = nums.length-1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(current_sum - target)) {
                    current_sum = sum;
                }
                if(sum < target){
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return current_sum;
                }
            }
        }
        return current_sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        int result1 = sol.threeSumClosest(nums1, target1);
        System.out.println("Test Case 1: " + Arrays.toString(nums1)
                + ", target = " + target1 + " -> Closest Sum = " + result1);

        // Test Case 2
        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        int result2 = sol.threeSumClosest(nums2, target2);
        System.out.println("Test Case 2: " + Arrays.toString(nums2)
                + ", target = " + target2 + " -> Closest Sum = " + result2);

        // Test Case 3
        int[] nums3 = {4,0,5,-5,3,3,0,-4,-5};
        int target3 = -2;
        int result3 = sol.threeSumClosest(nums3, target3);
        System.out.println("Test Case 3: " + Arrays.toString(nums3)
                + ", target = " + target3 + " -> Closest Sum = " + result3);
    }
}
