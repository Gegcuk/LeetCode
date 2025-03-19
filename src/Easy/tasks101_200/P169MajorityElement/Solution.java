package Easy.tasks101_200.P169MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        int halfLength = nums.length/2;
        Map<Integer, Integer> countsMap = new HashMap<>();
        for (int num : nums) {
            countsMap.put(num, countsMap.getOrDefault(num, 0) + 1);
            if(countsMap.get(num) > halfLength) return num;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[][] testCases = {
                {3, 2, 3},
                {2, 2, 1, 1, 1, 2, 2},
                {1, 1, 1, 2, 3, 4, 1, 1},
                {5, 5, 5, 1, 2, 5, 5}
        };

        // Loop through test cases and print the results
        for (int[] testCase : testCases) {
            int result = solution.majorityElement(testCase);
            System.out.println("Majority Element in " + arrayToString(testCase) + " -> " + result);
        }
    }

    // Helper method to convert array to string
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
