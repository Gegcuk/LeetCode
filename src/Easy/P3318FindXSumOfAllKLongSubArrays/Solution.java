package Easy.P3318FindXSumOfAllKLongSubArrays;

import java.util.*;

public class Solution {

    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        if (n < k) return new int[0];

        int[] result = new int[n - k + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < k; i++) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
        }
        result[0] = sumMostFrequent(frequencyMap, x);

        for (int i = k; i < n; i++) {
            int outgoing = nums[i - k];
            frequencyMap.put(outgoing, frequencyMap.get(outgoing) - 1);
            if (frequencyMap.get(outgoing) == 0) {
                frequencyMap.remove(outgoing);
            }
            // Add the new element entering the window
            int incoming = nums[i];
            frequencyMap.put(incoming, frequencyMap.getOrDefault(incoming, 0) + 1);

            result[i - k + 1] = sumMostFrequent(frequencyMap, x);
        }

        return result;
    }

    private int sumMostFrequent(Map<Integer, Integer> frequencyMap, int threshold) {
        return frequencyMap.entrySet()
                .stream()
                .sorted((a, b) -> {
                    int freqCompare = Integer.compare(b.getValue(), a.getValue());
                    if (freqCompare != 0) return freqCompare;
                    return Integer.compare(b.getKey(), a.getKey());
                })
                .limit(threshold)
                .mapToInt(entry -> entry.getValue() * entry.getKey())
                .sum();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array1 = {1, 1, 2, 2, 3, 4, 2, 3};
        System.out.println(Arrays.toString(solution.findXSum(array1, 6, 2)));
    }
}