package Medium.tasks1_10.P8StringToInteger;

class Solution {
    public int myAtoi(String s) {
        if(s.isBlank()) return 0;
        s = s.trim();
        boolean isNegative = false;
        int index = 0;
        int result = 0;
        char[] chars = s.toCharArray();
        if(chars[0] == '-') {
            isNegative = true;
            index++;
        } else if (chars[0] == '+') index++;
        while(index < s.length() && Character.isDigit(chars[index])){
            int digit = (int) chars[index] - '0';
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && digit > 7)){
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + digit;

            index++;
        }
        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String[] testCases = {
                "42",
                "   -42",
                "4193 with words",
                "words and 987",
                "--91283472332",
                "+123",
                "   +0 123",
                "   ",
                "1234567890"
        };

        for (String testCase : testCases) {
            try {
                int result = solution.myAtoi(testCase);
                System.out.println("Input: \"" + testCase + "\", Output: " + result);
            } catch (Exception e) {
                System.out.println("Input: \"" + testCase + "\", Exception: " + e.getMessage());
            }
        }
    }
}
