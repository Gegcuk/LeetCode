package Medium.tasks2201_2300.P2207MaximizeNumberOfSubequncesInAString;

import java.util.Map;

class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        long answer  = 0, max = 0;
        int counter = 1;
        char firstChar = pattern.charAt(0);
        char secondChar = pattern.charAt(1);
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == secondChar) answer += counter;
            if(text.charAt(i) == firstChar) counter++;
        }
        max = Math.max(answer, max);
        answer = 0; counter = 1;
        for(int i = text.length() - 1; i >= 0; i--){
            if(text.charAt(i) == firstChar) answer += counter;
            if(text.charAt(i) == secondChar) counter++;
        }
        return Math.max(max, answer);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.maximumSubsequenceCount("abdcdbc", "ac");
        solution.maximumSubsequenceCount("aabb", "ab");
    }

}
