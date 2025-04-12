package Easy.tasks2701_2800.P2788SplitStringsBySeparator;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> resultList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            for(char c : word.toCharArray()){
                if(c == separator) {
                    if(!sb.isEmpty()) resultList.add(sb.toString());
                    sb.setLength(0);
                } else {
                     sb.append(c);
                }
            }
            if(!sb.isEmpty()) resultList.add(sb.toString());
            sb.setLength(0);
        }
        return resultList;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.splitWordsBySeparator(List.of("one.two.three","four.five","six"), '.'));
        System.out.println(solution.splitWordsBySeparator(List.of("$easy$","$problem$"), '$'));
        System.out.println(solution.splitWordsBySeparator(List.of("|||"), '|'));
    }
}
