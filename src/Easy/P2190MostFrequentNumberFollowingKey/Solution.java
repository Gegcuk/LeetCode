package Easy.P2190MostFrequentNumberFollowingKey;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int mostFrequent(int[] nums, int key) {

        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i = 0; i <= nums.length - 2; i++){
            if(nums[i] == key){
                freqMap.merge(nums[i+1], 1, (k, v) -> v+1);
            }
        }
        int maxValue = 0;
        int maxKey = 0;
        for(Map.Entry<Integer, Integer> entry  : freqMap.entrySet()){
            if(maxValue < entry.getValue()){
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mostFrequent(new int[]{2,2,2,2,3}, 2));
        System.out.println(solution.mostFrequent(new int[]{1,100,200,1,100}, 1));
    }


}
