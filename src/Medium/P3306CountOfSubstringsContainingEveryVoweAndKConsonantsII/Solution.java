package Medium.P3306CountOfSubstringsContainingEveryVoweAndKConsonantsII;

import java.util.*;

public class Solution {
    public long countOfSubstrings(String word, int k) {
        long a = get(word, k);
        long b = get(word, k + 1);
        return a - b;
    }

    public long get(String s, int k) {
        int n = s.length();
        int[] vowelFreq = new int[5];
        int distinctVowels = 0;
        int consonantCount = 0;
        long ans = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int idx = getVowelIndex(c);
            if (idx != -1) {
                vowelFreq[idx]++;
                if (vowelFreq[idx] == 1) {
                    distinctVowels++;
                }
            } else {
                consonantCount++;
            }

            while (distinctVowels == 5 && consonantCount >= k) {
                ans += (n - i);
                char leftChar = s.charAt(j);
                int leftIdx = getVowelIndex(leftChar);
                if (leftIdx != -1) {
                    vowelFreq[leftIdx]--;
                    if (vowelFreq[leftIdx] == 0) {
                        distinctVowels--;
                    }
                } else {
                    consonantCount--;
                }
                j++;
            }
        }
        return ans;
    }

    private int getVowelIndex(char c) {
        switch (c) {
            case 'a': return 0;
            case 'e': return 1;
            case 'i': return 2;
            case 'o': return 3;
            case 'u': return 4;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countOfSubstrings("ieaouqqieaouqq", 1));
    }
}
