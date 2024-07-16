package Medium.P347TopKFrequentElements;

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer number : nums){
            if(!map.containsKey(number))map.put(number, 0);
            map.put(number, map.get(number) + 1);
        }
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue());

        int[] resultArray = new int[k];
        for(int i = 0; i < k; i++) resultArray[i] = sortedEntries.get(sortedEntries.size()-i-1).getKey();
        return resultArray;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        int[] result1 = solution.topKFrequent(nums1, k1);
        System.out.println("Top " + k1 + " frequent elements in {1, 1, 1, 2, 2, 3}: " + Arrays.toString(result1));

        // Test case 2
        int[] nums2 = {1};
        int k2 = 1;
        int[] result2 = solution.topKFrequent(nums2, k2);
        System.out.println("Top " + k2 + " frequent element in {1}: " + Arrays.toString(result2));

        // Test case 3
        int[] nums3 = {4, 4, 4, 5, 5, 6, 6, 6, 7};
        int k3 = 3;
        int[] result3 = solution.topKFrequent(nums3, k3);
        System.out.println("Top " + k3 + " frequent elements in {4, 4, 4, 5, 5, 6, 6, 6, 7}: " + Arrays.toString(result3));
    }
}
