package Easy.P26RemoveDuplicateFromSortedArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: array with duplicates
        int[] nums1 = {1, 1, 2};
        System.out.println("Number of unique elements: " + solution.removeDuplicates(nums1));

        // Test case 2: array with more duplicates
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Number of unique elements: " + solution.removeDuplicates(nums2));

        // Test case 3: array with no duplicates
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("Number of unique elements: " + solution.removeDuplicates(nums3));

        // Test case 4: empty array
        int[] nums4 = {};
        System.out.println("Number of unique elements: " + solution.removeDuplicates(nums4));

        // Test case 5: array with all identical elements
        int[] nums5 = {1, 1, 1, 1, 1};
        System.out.println("Number of unique elements: " + solution.removeDuplicates(nums5));
    }
}
