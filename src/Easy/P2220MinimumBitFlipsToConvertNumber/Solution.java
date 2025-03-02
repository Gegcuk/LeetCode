package Easy.P2220MinimumBitFlipsToConvertNumber;

public class Solution {

    public int minBitFlips(int start, int goal) {
        int result = start ^ goal;
        int counter = 0;
        while (result != 0) {
            counter += result & 1;
            result >>= 1;
        }
        return counter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minBitFlips(3, 4));
        System.out.println(solution.minBitFlips(10, 7));
    }

}
