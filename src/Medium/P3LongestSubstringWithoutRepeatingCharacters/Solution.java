package Medium.P3LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> currentSubString = new HashSet<>();
        int leftPointer = 0;

        for(int rightPointer = 0; rightPointer < n; rightPointer++){
            if(!currentSubString.contains(s.charAt(rightPointer))){
                currentSubString.add(s.charAt(rightPointer));
                maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
            } else {
                while(currentSubString.contains(s.charAt(rightPointer))){
                    currentSubString.remove(s.charAt(leftPointer));
                    leftPointer++;
                }
                currentSubString.add(s.charAt(rightPointer));
            }
        }
        return maxLength;
    }


    public int lengthOfLongestSubstringFirstTry(String s) {
        if(s.isEmpty()) return 0;
        else if (s.length() == 1) return 1;
        int lengthOfLongestSubstring = 0;
        for (int i = 0; i < s.length(); i++){
            int currentLength = 0;
            StringBuilder substrb = new StringBuilder();
            for(int j = i; j < s.length(); j++){
                char currentChar = s.charAt(j);
                if(substrb.indexOf(String.valueOf(currentChar)) != -1){
                    break;
                } else {
                    substrb.append(currentChar);
                    currentLength++;
                }
                if(currentLength > lengthOfLongestSubstring) lengthOfLongestSubstring = currentLength;
            }
        }
        return lengthOfLongestSubstring;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        String testString1 = "abcabcbb";
        String testString2 = "bbbbb";
        String testString3 = "pwwkew";
        String testString4 = "";
        String testString5 = "aab";

        System.out.println("Test String 1: " + testString1 + " -> " + solution.lengthOfLongestSubstring(testString1));
        System.out.println("Test String 2: " + testString2 + " -> " + solution.lengthOfLongestSubstring(testString2));
        System.out.println("Test String 3: " + testString3 + " -> " + solution.lengthOfLongestSubstring(testString3));
        System.out.println("Test String 4: " + testString4 + " -> " + solution.lengthOfLongestSubstring(testString4));
        System.out.println("Test String 5: " + testString5 + " -> " + solution.lengthOfLongestSubstring(testString5));
    }
}
