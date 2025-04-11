package Easy.tasks2201_2300.P2220MinimumBitFlipsToConvertNumber;

public class Solution {

    public int minBitFlips(int start, int goal) {
        int counter = 0;
        while (start != 0 || goal != 0) {
            System.out.println(start + " " + goal);
            if (start >> 1 != goal>>1) counter++;
            start >>= 1;
            goal >>=1;
        }
        return counter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minBitFlips(3, 4));
        System.out.println(solution.minBitFlips(10, 7));
    }

}
