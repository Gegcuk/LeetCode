package Medium.P7ReverseInteger;

class Solution {
    public int reverse(int x) {
        int sign = 1;
        int result = 0;
        if(x == Integer.MIN_VALUE)sign = -1;
        else if(x * (-1) > 0) {
            sign = -1;
            x = -x;
        }
        while(x > 0){
            int digit = x % 10;
            x /= 10;
            if(result > (Integer.MAX_VALUE - digit) / 10){
                return 0;
            }
            result = (result * 10) + digit;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] testCases = {123, -123, 120, 0, Integer.MAX_VALUE, Integer.MIN_VALUE, -2147483648, 1534236469};

        for (int testCase : testCases) {
            int reversed = solution.reverse(testCase);
            System.out.println("Original: " + testCase + ", Reversed: " + reversed);
        }
    }
}
