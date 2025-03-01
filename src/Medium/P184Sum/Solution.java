package Medium.P184Sum;

import java.util.*;

public class Solution {

    public List<List<Integer>> fourSum(int[] unsortedNumbers, int targetSum) {
        List<List<Integer>> matchingQuadruplets = new ArrayList<>();

        if (unsortedNumbers == null || unsortedNumbers.length < 4) {
            return matchingQuadruplets;
        }

        Arrays.sort(unsortedNumbers);

        for (int primaryAnchorIndex = 0; primaryAnchorIndex < unsortedNumbers.length - 3; primaryAnchorIndex++) {
            if (primaryAnchorIndex > 0
                    && unsortedNumbers[primaryAnchorIndex] == unsortedNumbers[primaryAnchorIndex - 1]) {
                continue;
            }

            for (int secondaryAnchorIndex = primaryAnchorIndex + 1;
                 secondaryAnchorIndex < unsortedNumbers.length - 2;
                 secondaryAnchorIndex++) {

                if (secondaryAnchorIndex > primaryAnchorIndex + 1
                        && unsortedNumbers[secondaryAnchorIndex] == unsortedNumbers[secondaryAnchorIndex - 1]) {
                    continue;
                }

                int searchRangeStart = secondaryAnchorIndex + 1;
                int searchRangeEnd = unsortedNumbers.length - 1;

                while (searchRangeStart < searchRangeEnd) {
                    long sumOfQuadruplet =
                            (long) unsortedNumbers[primaryAnchorIndex]
                                    + unsortedNumbers[secondaryAnchorIndex]
                                    + unsortedNumbers[searchRangeStart]
                                    + unsortedNumbers[searchRangeEnd];

                    if (sumOfQuadruplet == targetSum) {
                        matchingQuadruplets.add(
                                Arrays.asList(
                                        unsortedNumbers[primaryAnchorIndex],
                                        unsortedNumbers[secondaryAnchorIndex],
                                        unsortedNumbers[searchRangeStart],
                                        unsortedNumbers[searchRangeEnd]
                                )
                        );

                        searchRangeStart++;
                        searchRangeEnd--;

                        while (searchRangeStart < searchRangeEnd
                                && unsortedNumbers[searchRangeStart] == unsortedNumbers[searchRangeStart - 1]) {
                            searchRangeStart++;
                        }

                        while (searchRangeStart < searchRangeEnd
                                && unsortedNumbers[searchRangeEnd] == unsortedNumbers[searchRangeEnd + 1]) {
                            searchRangeEnd--;
                        }

                    } else if (sumOfQuadruplet < targetSum) {
                        searchRangeStart++;
                    } else {
                        searchRangeEnd--;
                    }
                }
            }
        }

        return matchingQuadruplets;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // A list of different input arrays
        List<int[]> testArrays = List.of(
                new int[]{1, 0, -1, 0, -2, 2},  // A typical example with positive/negative/zero
                new int[]{2, 2, 2, 2, 2},      // All elements are the same
                new int[]{-2, -1, 0, 0, 1, 2}, // Mixed numbers around zero
                new int[]{},                   // Empty array
                new int[]{1, 1, 1, 1}          // Small array with the same elements
        );

        // Matching targets for each of the above arrays
        List<Integer> targets = List.of(
                0,   // Common "four sum" test with zeros and negative
                8,   // All 2's aiming to see if we can handle duplicates
                0,   // Mixed negative and positive
                0,   // Edge case: empty array + a zero target
                4    // Four 1s = 4
        );

        // Run each test
        for (int i = 0; i < testArrays.size(); i++) {
            int[] currentArray = testArrays.get(i);
            int currentTarget = targets.get(i);

            System.out.println("\n=== Test Case #" + (i + 1) + " ===");
            System.out.println("Array:   " + Arrays.toString(currentArray));
            System.out.println("Target:  " + currentTarget);

            List<List<Integer>> result = solution.fourSum(currentArray, currentTarget);
            System.out.println("Results: " + result);
        }
    }
}
