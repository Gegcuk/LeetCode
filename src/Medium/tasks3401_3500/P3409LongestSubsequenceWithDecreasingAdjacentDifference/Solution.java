package Medium.tasks3401_3500.P3409LongestSubsequenceWithDecreasingAdjacentDifference;

import java.util.Arrays;

public class Solution {
    int longestSubsequence(int[] nums) {
        int maxLength = 0;
        int[][] subsequenceLength = new int[301][301];
        Arrays.stream(subsequenceLength).forEach(row -> Arrays.fill(row, 0));

        for (int index = nums.length - 1; index >= 0; --index) {
            int currentNum = nums[index];

            for (int potentialNextNum = 1; potentialNextNum <= 300; ++potentialNextNum) {
                int diff = Math.abs(currentNum - potentialNextNum);
                subsequenceLength[currentNum][diff] = Math.max(
                        subsequenceLength[currentNum][diff],
                        subsequenceLength[potentialNextNum][diff] + 1
                );
            }

            for (int diff = 1; diff < 300; ++diff) {
                subsequenceLength[currentNum][diff] = Math.max(
                        subsequenceLength[currentNum][diff],
                        subsequenceLength[currentNum][diff - 1]
                );
                maxLength = Math.max(maxLength, subsequenceLength[currentNum][diff]);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestSubsequence(new int[]{8,6,3}));
        System.out.println(solution.longestSubsequence(new int[]{6,5,3,4,2,1}));
        System.out.println(solution.longestSubsequence(new int[]{8,5,9,3}));
    }

}
