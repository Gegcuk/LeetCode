package Easy.tasks801_900.P867TransposeMatrix;

public class Solution {

    public int[][] transpose(int[][] matrix) {
        int[][] resultMatrix = new int[matrix[0].length][matrix.length];
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                resultMatrix[col][row] = matrix[row][col];
            }
        }
        return resultMatrix;
    }

}
