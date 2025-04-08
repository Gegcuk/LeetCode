package Easy.tasks2601_2700.P2659FindTheWidthOfColumnsOfAGrid;

import java.util.Arrays;

public class Solution {
    public int[] findColumnWidth(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                grid[i][j] = String.valueOf(grid[i][j]).length();
            }
        }
        int[] resultList = new int[grid[0].length];
        int resultListIndex = 0;
        for(int col = 0; col < grid[0].length; col++){
            int max = 0;
            for(int row = 0; row < grid.length; row++){
                if(grid[row][col] > max) max = grid[row][col];
            }
            resultList[resultListIndex++] = max;
        }

        return resultList;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findColumnWidth(new int[][]{{-15,1,3},{15,7,12},{5,6,-2}})));
    }
}
