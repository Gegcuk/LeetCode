package Hard.P10RegularExpressionMatching;

enum MatchResult {
    TRUE, FALSE
}

class Solution {
    private MatchResult[][] memo;

    public boolean isMatch(String text, String pattern) {
        memo = new MatchResult[text.length() + 1][pattern.length() + 1];
        return isMatchHelper(0, 0, text, pattern);
    }

    private boolean isMatchHelper(int textIndex, int patternIndex, String text, String pattern) {
        if (memo[textIndex][patternIndex] != null) {
            return memo[textIndex][patternIndex] == MatchResult.TRUE;
        }

        boolean isMatch;
        if (patternIndex == pattern.length()) {
            isMatch = textIndex == text.length();
        } else {
            boolean isFirstCharMatch = (textIndex < text.length() &&
                    (pattern.charAt(patternIndex) == text.charAt(textIndex) ||
                            pattern.charAt(patternIndex) == '.'));

            if (patternIndex + 1 < pattern.length() && pattern.charAt(patternIndex + 1) == '*') {
                isMatch = (isMatchHelper(textIndex, patternIndex + 2, text, pattern) ||
                        (isFirstCharMatch && isMatchHelper(textIndex + 1, patternIndex, text, pattern)));
            } else {
                isMatch = isFirstCharMatch && isMatchHelper(textIndex + 1, patternIndex + 1, text, pattern);
            }
        }

        memo[textIndex][patternIndex] = isMatch ? MatchResult.TRUE : MatchResult.FALSE;
        return isMatch;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String[][] testCases = {
                {"aa", "a"},               // false
                {"aa", "a*"},              // true
                {"ab", ".*"},              // true
                {"aab", "c*a*b"},          // true
                {"mississippi", "mis*is*p*."}, // false
                {"", ".*"},                // true
                {"abcd", "d*"},            // false
                {"", ""},                  // true
                {"abc", "abc*"},           // true
                {"aaa", "a*a"},            // true
        };

        for (String[] testCase : testCases) {
            String text = testCase[0];
            String pattern = testCase[1];
            boolean result = solution.isMatch(text, pattern);
            System.out.println("Text: \"" + text + "\", Pattern: \"" + pattern + "\", Match: " + result);
        }
    }
}

