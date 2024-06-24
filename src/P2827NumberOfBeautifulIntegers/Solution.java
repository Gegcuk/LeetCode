package P2827NumberOfBeautifulIntegers;
import java.util.Arrays;

public class Solution {
    private int[][][][][] dp;
    private int mod;

    public int numberOfBeautifulIntegers(int low, int high, int k) {
        this.mod = k;
        return countBeautifulIntegers(high) - countBeautifulIntegers(low - 1);
    }

    private int countBeautifulIntegers(int x) {
        if (x < 0) return 0;
        String num = Integer.toString(x);
        int length = num.length();
        dp = new int[length][2 * length + 1][mod][2][2]; // pos, balance, modValue, tight, leadingZero
        for (int[][][][] d1 : dp) {
            for (int[][][] d2 : d1) {
                for (int[][] d3 : d2) {
                    for (int[] d4 : d3) {
                        Arrays.fill(d4, -1);
                    }
                }
            }
        }
        return digitDP(0, 0, 0, 1, 1, num);
    }

    private int digitDP(int pos, int balance, int modValue, int tight, int leadingZero, String num) {
        if (pos == num.length()) {
            return (modValue == 0 && balance == 0) ? 1 : 0;
        }
        if (dp[pos][balance + num.length()][modValue][tight][leadingZero] != -1) {
            return dp[pos][balance + num.length()][modValue][tight][leadingZero];
        }

        int limit = tight == 1 ? num.charAt(pos) - '0' : 9;
        int result = 0;

        for (int digit = 0; digit <= limit; digit++) {
            int newBalance = balance + (digit % 2 == 0 ? 1 : -1);
            int newModValue = (modValue * 10 + digit) % mod;
            int newTight = (tight == 1 && digit == limit) ? 1 : 0;
            int newLeadingZero = (leadingZero == 1 && digit == 0) ? 1 : 0;

            // Skip leading zeros by not changing balance
            if (newLeadingZero == 1) {
                result += digitDP(pos + 1, balance, modValue, newTight, newLeadingZero, num);
            } else {
                result += digitDP(pos + 1, newBalance, newModValue, newTight, newLeadingZero, num);
            }
        }

        dp[pos][balance + num.length()][modValue][tight][leadingZero] = result;
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfBeautifulIntegers(10, 20, 3)); // should return 2
        System.out.println(solution.numberOfBeautifulIntegers(10, 100, 3)); // another test case
    }
}
