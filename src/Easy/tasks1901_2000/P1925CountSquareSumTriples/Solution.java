package Easy.tasks1901_2000.P1925CountSquareSumTriples;

import java.util.Arrays;

public class Solution {

    public int countTriples(int n) {

        int[] squares = new int[n];
        for(int i = 1; i <= squares.length; i++){
            squares[i-1] = i*i;
        }
        System.out.println(Arrays.toString(squares));

        int counter = 0;
        int currentNumber;
        for(int i = 0; i < squares.length; i++){
            currentNumber = squares[i];
            for(int j = 0; j < i; j++){
                for(int k = 0; k < j; k++){
                    if(squares[k] + squares[j] == currentNumber) {
                        if(k != j) counter += 2;
                        else counter++;
                    }
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countTriples(10));
    }

}
