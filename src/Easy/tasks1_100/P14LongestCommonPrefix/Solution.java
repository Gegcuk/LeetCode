package Easy.tasks1_100.P14LongestCommonPrefix;

import java.util.Arrays;

import static java.lang.String.valueOf;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder resultString = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int iterations = Math.min(first.length(), last.length());
        for(int i = 0; i < iterations; i++){
            System.out.println("First: " + first + " last: " + last + " First char at: " + i + " = " + first.charAt(i) + " Second char at: " + i + " = " + last.charAt(i));
            if(first.charAt(i) != last.charAt(i)) return resultString.toString();
            resultString.append(first.charAt(i));
        }
        System.out.println(Arrays.toString(strs));

        return resultString.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String [] strs = {"dog","racecar","car"};
        System.out.println(solution.longestCommonPrefix(strs));
        String [] strs2 = {"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(strs2));
    }
}
