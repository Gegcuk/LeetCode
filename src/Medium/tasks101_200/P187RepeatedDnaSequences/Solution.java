package Medium.tasks101_200.P187RepeatedDnaSequences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> resultList = new ArrayList<>();
        if(s.length() < 10) return resultList;
        Map<String, Integer> frequencyCounter = new HashMap<>();
        int left = 0, right = 9;
        do {
            String curString = s.substring(left, right+1);
            frequencyCounter.put(curString, frequencyCounter.getOrDefault(curString, 0)+1);
            left++;
            right++;
        } while (right < s.length());

        for( Map.Entry<String, Integer> entry: frequencyCounter.entrySet()){
            if(entry.getValue() > 1) resultList.add(entry.getKey());
        }

       return resultList;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
    }

}
