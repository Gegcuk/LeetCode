package Easy.tasks2901_3000.P2965FindMissingAndRepeatedValues;

import java.util.Arrays;

public class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int length = n * n;
        int doubled = 0, missing = 0;
        int[] sorted_array = new int[length];

        // Traverse grid and identify repeated number
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(sorted_array[grid[i][j] - 1] == 0) {
                    sorted_array[grid[i][j] - 1] = grid[i][j];
                } else {
                    doubled = grid[i][j];
                }
            }
        }

        // Identify missing number
        for(int i = 0; i < length; i++){
            if(sorted_array[i] == 0) {
                missing = i + 1;
                break;
            }
        }

        return new int[]{doubled, missing};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findMissingAndRepeatedValues(new int[][]{{9,1,7},{8,9,2},{3,4,6}})));
        System.out.println(Arrays.toString(solution.findMissingAndRepeatedValues(new int[][]{{1, 3},{2, 2}})));
    }

}
