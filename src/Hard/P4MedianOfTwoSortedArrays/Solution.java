package Hard.P4MedianOfTwoSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int fullLength = nums1.length + nums2.length;
        int firstArrayPointer = 0;
        int secondArrayPointer = 0;
        int mergedArrayPointer = 0;
        int[] mergedArray = new int[fullLength];

        while (firstArrayPointer < nums1.length && secondArrayPointer < nums2.length) {
            if (nums1[firstArrayPointer] < nums2[secondArrayPointer]) {
                mergedArray[mergedArrayPointer++] = nums1[firstArrayPointer++];
            } else {
                mergedArray[mergedArrayPointer++] = nums2[secondArrayPointer++];
            }
        }

        while (firstArrayPointer < nums1.length) {
            mergedArray[mergedArrayPointer++] = nums1[firstArrayPointer++];
        }

        while (secondArrayPointer < nums2.length) {
            mergedArray[mergedArrayPointer++] = nums2[secondArrayPointer++];
        }

        if (fullLength % 2 == 0) {
            return (mergedArray[fullLength / 2 - 1] + mergedArray[fullLength / 2]) / 2.0;
        } else {
            return mergedArray[fullLength / 2];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median of [1, 3] and [2] is: " + solution.findMedianSortedArrays(nums1, nums2));

        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        System.out.println("Median of [1, 2] and [3, 4] is: " + solution.findMedianSortedArrays(nums1_2, nums2_2));

        int[] nums1_3 = {0, 0};
        int[] nums2_3 = {0, 0};
        System.out.println("Median of [0, 0] and [0, 0] is: " + solution.findMedianSortedArrays(nums1_3, nums2_3));

        int[] nums1_4 = {};
        int[] nums2_4 = {1};
        System.out.println("Median of [] and [1] is: " + solution.findMedianSortedArrays(nums1_4, nums2_4));

        int[] nums1_5 = {2};
        int[] nums2_5 = {};
        System.out.println("Median of [2] and [] is: " + solution.findMedianSortedArrays(nums1_5, nums2_5));
    }
}
