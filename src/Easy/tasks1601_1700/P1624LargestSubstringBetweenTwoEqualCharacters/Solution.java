package Easy.tasks1601_1700.P1624LargestSubstringBetweenTwoEqualCharacters;

import java.util.Arrays;

public class Solution {

    public int maxLengthBetweenEqualCharacters(String s) {
        int[] count = new int[26];
        Arrays.fill(count, -1);
        int ans = -1;
        for (int i = 0; i < s.length(); ++i) {
            int j = s.charAt(i) - 'a';
            if (count[j] == -1) {
                count[j] = i;
            } else {
                ans = Math.max(ans, i - count[j] - 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxLengthBetweenEqualCharacters("abbab"));
        System.out.println(solution.maxLengthBetweenEqualCharacters("scayofdzca"));
        System.out.println(solution.maxLengthBetweenEqualCharacters("abca"));
        System.out.println(solution.maxLengthBetweenEqualCharacters("cbzxy"));
    }

}
