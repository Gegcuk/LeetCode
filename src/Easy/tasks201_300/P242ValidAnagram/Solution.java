package Easy.tasks201_300.P242ValidAnagram;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        return (Arrays.equals(charS, charT));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "listen";
        String t1 = "silent";
        System.out.println("Test 1 - are 'listen' and 'silent' anagrams? " + solution.isAnagram(s1, t1));

        String s2 = "hello";
        String t2 = "billion";
        System.out.println("Test 2 - are 'hello' and 'billion' anagrams? " + solution.isAnagram(s2, t2));
    }
}
