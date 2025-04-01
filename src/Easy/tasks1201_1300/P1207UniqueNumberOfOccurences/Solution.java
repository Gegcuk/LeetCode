package Easy.tasks1201_1300.P1207UniqueNumberOfOccurences;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Map<Integer, Integer> frequencyFrequencyMap = new HashMap<>();
        for(int i : arr){
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }
        for(int i : frequencyMap.values()){
            frequencyFrequencyMap.put(i, frequencyFrequencyMap.getOrDefault(i, 0) + 1);
        }
        for(int i: frequencyFrequencyMap.values()){
            if(i > 1) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }
}
