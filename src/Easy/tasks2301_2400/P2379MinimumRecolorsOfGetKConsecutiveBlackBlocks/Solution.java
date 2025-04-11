package Easy.tasks2301_2400.P2379MinimumRecolorsOfGetKConsecutiveBlackBlocks;

public class Solution {

    public int minimumRecolors(String blocks, int k) {
        char[] array = blocks.toCharArray();
        int left = 0, right = k - 1;
        int countW = 0;
        int countCurrent = 0;

        for (int i = 0; i < k; i++) {
            if (array[i] == 'W') {
                countW++;
                countCurrent++;
            }
        }

        while (right < array.length - 1) {
            right++;
            if (array[right] == 'W') countCurrent++;
            if (array[left] == 'W') countCurrent--;
            countW = Math.min(countW, countCurrent);
            left++;
        }

        return countW;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumRecolors("BWBBWWBBBWBWWWBWWBBWBWBBWBB", 11));
    }


}
